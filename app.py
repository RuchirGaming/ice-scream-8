import os
import zipfile
import UnityPy

# Configuration
EXTRACT_DIR = "./extracted_apk"      
UNITY_IMAGES_DIR = "./unity_images"  
DEX_OUTPUT_DIR = "./apk_dex_files"   

def find_apk_globally():
    """Scans the workspace to locate the APK file."""
    print("[+] Searching workspace for an APK file...")
    search_root = os.getcwd() 
    ignore_dirs = {".git", ".github", "node_modules", "venv", "extracted_apk", "unity_images", "apk_dex_files"}

    for root, dirs, files in os.walk(search_root):
        dirs[:] = [d for d in dirs if d not in ignore_dirs and not d.startswith('.')]
        for file in files:
            if file.lower().endswith(".apk"):
                apk_path = os.path.join(root, file)
                print(f"[+] Found APK: {apk_path}")
                return apk_path
    return None

def main():
    apk_path = find_apk_globally()
    if not apk_path:
        print("[!] Error: No APK found.")
        return

    os.makedirs(UNITY_IMAGES_DIR, exist_ok=True)
    os.makedirs(DEX_OUTPUT_DIR, exist_ok=True)
    os.makedirs(EXTRACT_DIR, exist_ok=True)

    # Step 1: Unzip APK raw file footprint
    print(f"[+] Unzipping APK content to {EXTRACT_DIR}...")
    with zipfile.ZipFile(apk_path, 'r') as zip_ref:
        zip_ref.extractall(EXTRACT_DIR)

    # Step 2: Extract .dex files
    print("[+] Moving Dalvik Executable (.dex) bytecode files...")
    dex_count = 0
    for root, _, files in os.walk(EXTRACT_DIR):
        for file in files:
            if file.lower().endswith(".dex"):
                dest = os.path.join(DEX_OUTPUT_DIR, file)
                with open(os.path.join(root, file), "rb") as src, open(dest, "wb") as out:
                    out.write(src.read())
                dex_count += 1
    print(f"[+] Moved {dex_count} '.dex' files to '{DEX_OUTPUT_DIR}'.")

    # Step 3: Let UnityPy dynamically load the extracted asset map
    print("[+] Loading Unity Environment (this may take a minute for large asset sets)...")
    try:
        # Instead of scanning files manually, loading the root directory tells UnityPy 
        # to parse internal split/unsplit metadata structures.
        env = UnityPy.load(EXTRACT_DIR)
        
        img_count = 0
        mesh_count = 0
        
        print("[+] Environment loaded. Sweeping virtual asset mappings for graphics/geometry...")
        for obj in env.objects:
            # Look for compressed Texture 2D assets and UI Sprites
            if obj.type.name in ["Texture2D", "Sprite"]:
                try:
                    data = obj.read()
                    if hasattr(data, "image") and data.image:
                        # Use Name if available, fallback to unique object Path ID
                        base_name = data.name if (hasattr(data, "name") and data.name) else str(obj.path_id)
                        out_name = f"{base_name}.png"
                        
                        data.image.save(os.path.join(UNITY_IMAGES_DIR, out_name))
                        img_count += 1
                except Exception:
                    pass
            
            # Look for 3D meshes
            elif obj.type.name == "Mesh":
                try:
                    data = obj.read()
                    base_name = data.name if (hasattr(data, "name") and data.name) else str(obj.path_id)
                    out_name = f"{base_name}.obj"
                    
                    mesh_data = data.export()
                    if mesh_data:
                        with open(os.path.join(UNITY_IMAGES_DIR, out_name), "w", newline="") as f:
                            f.write(mesh_data)
                        mesh_count += 1
                except Exception:
                    pass

        print(f"\n[SUCCESS] Extracted {img_count} Textures/Sprites and {mesh_count} 3D Meshes.")
    except Exception as e:
        print(f"[!] Engine context extraction failed: {str(e)}")

    print("\n--- Processing Complete! ---")

if __name__ == "__main__":
    main()
import os

# Configuration: Folders you want to index
TARGET_FOLDERS = ["unity_images", "apk_dex_files", "extract_audio", "all_java"]
OUTPUT_HTML = "index.html"

def generate_html():
    html_content = """<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Extracted Game Assets Index</title>
    <style>
        body {
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, sans-serif;
            background-color: #0f172a;
            color: #f8fafc;
            margin: 0;
            padding: 2rem;
        }
        h1 { color: #38bdf8; border-bottom: 2px solid #334155; padding-bottom: 0.5rem; }
        h2 { color: #fbbf24; margin-top: 2rem; text-transform: capitalize; }
        .folder-section { background-color: #1e293b; padding: 1.5rem; border-radius: 8px; margin-bottom: 1.5rem; }
        ul { list-style-type: none; padding: 0; margin: 0; max-height: 400px; overflow-y: auto; }
        li { padding: 0.5rem; border-bottom: 1px solid #334155; display: flex; justify-content: space-between; }
        li:last-child { border-bottom: none; }
        a { color: #60a5fa; text-decoration: none; word-break: break-all; }
        a:hover { text-decoration: underline; color: #93c5fd; }
        .file-size { color: #94a3b8; font-size: 0.85rem; font-family: monospace; }
        .count { font-size: 1rem; color: #94a3b8; font-weight: normal; }
    </style>
</head>
<body>

    <h1>🎮 Extracted Game Assets Archive</h1>
    <p>Automatically generated index for Cloudflare Pages hosting.</p>
"""

    for folder in TARGET_FOLDERS:
        if not os.path.exists(folder):
            continue
        
        # Get all files inside the folder
        files = sorted([f for f in os.listdir(folder) if os.path.isfile(os.path.join(folder, f))])
        
        html_content += f"""
    <div class="folder-section">
        <h2>📂 {folder.replace('_', ' ')} <span class="count">({len(files)} files)</span></h2>
        <ul>"""
        
        if not files:
            html_content += "<li><em>No files found in this directory.</em></li>"
        
        for file in files:
            file_path = os.path.join(folder, file)
            # Calculate file size in KB or MB
            size_bytes = os.path.getsize(file_path)
            if size_bytes > 1024 * 1024:
                size_str = f"{size_bytes / (1024 * 1024):.2f} MB"
            else:
                size_str = f"{size_bytes / 1024:.2f} KB"
                
            # URL encode the file name so links work with spaces/special characters
            import urllib.parse
            safe_url = urllib.parse.quote(f"{folder}/{file}")
            
            html_content += f"""
            <li>
                <a href="{safe_url}" target="_blank">{file}</a>
                <span class="file-size">{size_str}</span>
            </li>"""
            
        html_content += """
        </ul>
    </div>"""

    html_content += """
</body>
</html>
"""

    with open(OUTPUT_HTML, "w", encoding="utf-8") as f:
        f.write(html_content)
    print(f"[SUCCESS] Generated {OUTPUT_HTML} linking to all extracted files!")

if __name__ == "__main__":
    generate_html()
import os

def scan_large_files(start_directory=".", threshold_mb=25):
    # Convert MB to bytes (1 MB = 1024 * 1024 bytes)
    threshold_bytes = threshold_mb * 1024 * 1024
    count = 0

    print(f"Scanning for files larger than {threshold_mb} MB...\n")
    print(f"{'File Path':<60} | {'Size (MB)':<10}")
    print("-" * 75)

    for dirpath, dirnames, filenames in os.walk(start_directory):
        # Skip internal Git history folders
        if '.git' in dirpath:
            continue
            
        for filename in filenames:
            filepath = os.path.join(dirpath, filename)
            
            try:
                file_size = os.path.getsize(filepath)
                
                # Check if the file is larger than 25MB
                if file_size > threshold_bytes:
                    file_size_mb = file_size / (1024 * 1024)
                    print(f"{filepath:<60} | {file_size_mb:.2f} MB")
                    count += 1
            except (OSError, FileNotFoundError):
                # Skip system files or symlinks that can't be read
                continue

    print("-" * 75)
    print(f"Scan complete. Found {count} file(s) larger than {threshold_mb} MB.")

if __name__ == "__main__":
    # Run the scan starting from the current directory
    scan_large_files(".", threshold_mb=25)
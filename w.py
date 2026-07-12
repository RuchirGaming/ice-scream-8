import os
import subprocess

def compress_wav_to_flac(start_directory=".", threshold_mb=25):
    # Convert Megabytes to bytes
    threshold_bytes = threshold_mb * 1024 * 1024
    
    print(f"Scanning for .wav files larger than {threshold_mb} MB...\n")
    
    for dirpath, dirnames, filenames in os.walk(start_directory):
        # Skip Git internal files to prevent scanning history
        if '.git' in dirpath:
            continue
            
        for filename in filenames:
            if filename.lower().endswith('.wav'):
                filepath = os.path.join(dirpath, filename)
                
                try:
                    file_size = os.path.getsize(filepath)
                    
                    # Target files larger than 25MB
                    if file_size > threshold_bytes:
                        file_size_mb = file_size / (1024 * 1024)
                        print(f"Found: {filename} ({file_size_mb:.2f} MB)")
                        
                        # Generate the new FLAC file path
                        flac_filepath = os.path.splitext(filepath)[0] + '.flac'
                        print(f"  -> Compressing losslessly to FLAC...")
                        
                        # Execute the FLAC compression command line tool
                        # '--best' maximizes compression, '-s' operates silently
                        result = subprocess.run(['flac', '--best', '-s', filepath, '-o', flac_filepath])
                        
                        # SAFETY FIRST: Only delete the original if the compression succeeded 
                        # and the new file actually exists on disk.
                        if result.returncode == 0 and os.path.exists(flac_filepath):
                            os.remove(filepath)
                            new_size_mb = os.path.getsize(flac_filepath) / (1024 * 1024)
                            print(f"  -> Success! Replaced original with .flac ({new_size_mb:.2f} MB)\n")
                        else:
                            print(f"  ❌ Error: Compression failed for {filepath}. Keeping original.\n")
                            
                except (OSError, FileNotFoundError) as e:
                    print(f"  ❌ Error accessing {filename}: {e}\n")
                    continue

    print("Scan and compression routine finished.")

if __name__ == "__main__":
    # Runs the script starting from your current folder location
    compress_wav_to_flac(".", threshold_mb=25)
import os
import shutil

# ----------------------------------------------------------------------------------
def remove_files(directory, file_extensions):
  """Removes files with specified extensions from a directory and its subdirectories.

  Args:
    directory: The root directory to search.
    file_extensions: A list of file extensions to remove.
  """

  for root, dirs, files in os.walk(directory):
    for file in files:
    #   print(file)
      fileName, fileExtension = os.path.splitext(file)
    #   print(fileName, "---", fileExtension)
      if (fileName in file_extensions or fileExtension in file_extensions):
        file_path = os.path.join(root, file)
        print(file_path)
        try:
          os.remove(file_path)
          print(f"Removed file: {file_path}")
        except OSError as e:
          print(f"Error removing file {file_path}: {e}")


# ----------------------------------------------------------------------------------
root_dir = "./"
file_extensions = [".class"]  # Replace with your desired extensions

remove_files(root_dir, file_extensions)

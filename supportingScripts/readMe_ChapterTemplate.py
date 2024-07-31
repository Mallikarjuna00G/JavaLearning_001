import os
import shutil

# NOTE: Stay in JavaLearning_001 while running this script

currentChapterNo = 99  # Update needed here
numberOfSelfTest = 12  # Update needed here

chapterNo = f"{currentChapterNo:02d}"

topDir = os.getcwd()
currentDir = os.getcwd()

chapterTitle = "Dummy Chapter"
prefix = "JBG_HS_Ch"
chapterWithPrefix = prefix + chapterNo

# Create the folder
os.mkdir(chapterWithPrefix)

readMeFile = open(chapterWithPrefix + "/README.md", "w")


# Start updating the readme file.

content = f"""# {chapterWithPrefix}

Chapter {chapterNo}: {chapterTitle}

1. [{chapterWithPrefix}_Exmp](./{chapterWithPrefix}_Exmp/)
2. [{chapterWithPrefix}_SelfTest](./{chapterWithPrefix}_SelfTest/)

"""
readMeFile.writelines(content)
readMeFile.close()
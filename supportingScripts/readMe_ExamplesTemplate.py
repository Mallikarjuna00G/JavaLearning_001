import os
import shutil

# NOTE: Stay in JavaLearning_001 while running this script

currentChapterNo = 99  # Update needed here
examples = ["exmp1", "exmp2", "exmp3"]  # Update needed here
numberOfExmp = len(examples)


chapterNo = f"{currentChapterNo:02d}"

topDir = os.getcwd()
currentDir = os.getcwd()

prefix = "JBG_HS_Ch"
chapterWithPrefix = prefix + chapterNo
dirExmp = chapterWithPrefix + "_" + "Exmp"

dirExmpPath = chapterWithPrefix + "/" + dirExmp
# shutil.rmtree(dirExmpPath)  # Delete this line. Only here for testing
os.mkdir(dirExmpPath)

readMeFile = open(dirExmpPath + "/README.md", "w")

content1 = f"""# {chapterWithPrefix}_Exmp

"""

readMeFile.writelines(content1)

for example in examples:
    content2 = f"""### Example: {example}

#### Source Code
[{example}.java](./{example}.java)

**Description:** 

#### Execution Logs

```

```

---

"""
    readMeFile.writelines(content2)
readMeFile.close()
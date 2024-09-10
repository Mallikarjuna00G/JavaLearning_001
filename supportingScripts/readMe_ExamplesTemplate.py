import os
import shutil

# NOTE: Stay in JavaLearning_001 while running this script

currentChapterNo = 11  # UPDATE NEEDED HERE
# examples = [""]  # UPDATE NEEDED HERE
# numberOfExmp = len(examples)
numberOfExmp = 15  # UPDATE NEEDED HERE

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

for i in range(numberOfExmp):
    exmpNo = dirExmp + f"{i + 1:02d}"
    os.mkdir(dirExmpPath + "/" + exmpNo)
    content2 = f"""### Example: {exmpNo}

#### Source Code
[{exmpNo}](./{exmpNo})

**Description:** 



#### Execution Logs

```

```

---
---

"""
    readMeFile.writelines(content2)
readMeFile.close()
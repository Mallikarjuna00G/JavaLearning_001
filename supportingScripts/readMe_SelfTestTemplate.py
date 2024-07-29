import os
import shutil

# NOTE: Stay in JavaLearning_001 while running this script

currentChapterNo = 2  # Update needed here
numberOfSelfTest = 12  # Update needed here

chapterNo = f"{currentChapterNo:02d}"

topDir = os.getcwd()
currentDir = os.getcwd()

prefix = "JBG_HS_Ch"
chapterWithPrefix = prefix + chapterNo
dirSelfTest = chapterWithPrefix + "_" + "SelfTest"

dirSelfTestPath = chapterWithPrefix + "/" + dirSelfTest
# shutil.rmtree(dirSelfTestPath)  # Delete this line. Only here for testing
os.mkdir(dirSelfTestPath)

readMeFile = open(dirSelfTestPath + "/README.md", "w")

content1 = f"""# {chapterWithPrefix}
"""

readMeFile.writelines(content1)

for i in range(1, numberOfSelfTest + 1):
    content2 = f"""## SelfTest{i:02d}

### SelfTest Problem

AAA

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
"""
    readMeFile.writelines(content2)
readMeFile.close()
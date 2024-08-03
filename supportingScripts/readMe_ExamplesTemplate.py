import os
import shutil

# NOTE: Stay in JavaLearning_001 while running this script

currentChapterNo = 5  # Update needed here
examples = ["ArrayDemo", "MinMax", "MinMax2", "ArrayErr", "Bubble", "TwoD", "Squares", "AssignARef", "LengthDemo", "ACopy", "QDemo", "ForEach", "NoChange", "ForEach2", "Search", "StringDemo", "StrOps", "StringArrays", "SubStr", "StringSwitch", "CLDemo", "Phone", "VarDemo", "VarDemo2", "VarDemo3", "UpCase", "ShowBits", "LowCase", "NotDemo", "ShiftDemo", "ShowBitsDemo", "NoZeroDiv", "NoZeroDiv2"]  # Update needed here
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
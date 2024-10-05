import os
import subprocess


chapterNo = f"{1:02d}"
category = ["Exmp", "SelfTest"][0]
fileName = "Example"
filePath = f"../JBG_HS_Ch{chapterNo}/JBG_HS_Ch{chapterNo}_{category}/{fileName}.java"
command = ["python3", "java2puml.py", filePath]
subprocess.run(command)

import sys

if(len(sys.argv)) != 2:
    print("Usage: python3 javaCodeParser.py <javafile>")
    exit()

fileName = sys.argv[1]
# print("Reading file:", fileName)

file = open(fileName, "r")

if file.readable():
    print("File is readable.")

else:
    print("File is not readable. Exiting...")
    exit()

hr_line1 = "========================================"
print(hr_line1)
lines = file.readlines()

multiLineComments = []
singleLineComments = []
classes = []
methods = []
braceBalance = 0
parenthesesBalance = 0
package = []

mlCommentStarted = False
mlCommentEnded = False

isMlComment = False
isSlComment = False
note = ""

javaKeywords = [
    "abstract",	"assert", "boolean", "break", "byte", "case"
    "catch", "char", "class", "const", "continue", "default",
    "do", "double", "else", "enum", "exports", "extends",
    "final", "finally", "float", "for", "goto", "if",
    "implements", "import", "instanceof", "int", "interface", "long",
    "module", "native", "new", "open", "opens", "package",
    "private", "protected", "provides", "public", "requires", "return",
    "short", "static", "strictfp", "super", "switch", "synchronized",
    "this", "throw", "throws", "to", "transient", "transitive",
    "try", "uses", "void", "volatile", "while", "with",
    "_"
]

for line in lines:
    # print(line.strip())
    line = line.strip()
    if len(line) == 0:
        continue
    if line.startswith("/*"):
        isMlComment = True

    if isMlComment:
        if not(line == "/*" or line == "/**" or line == "*" or line == "*/"):
            note += "\n" + line.strip("*")
        if line.endswith("*/"):
            isMlComment = False
            multiLineComments.append(note)
            note = ""
        continue

    if line.startswith("//"):
        isSlComment = True
        singleLineComments.append(line.strip("// "))
        isSlComment = False
        continue

    # Non-comment content handled here
    if not isMlComment and not isSlComment and len(line) != 0:
        isSlComment = False
        if "//" in line:
            l = line.replace("\"", "")
            isStillComment = False
            nSlashPair = line.count("//")
            placesSlashesPair = []
            position = 0

            for i in range(nSlashPair):
                position = line.index("//", position)
                if position == -1:
                    break
                placesSlashesPair.append(i)
            
            isClosingDIComma = True
            commentStartAt = -1
            for i in range(len(line)):
                if line[i] == "\"":
                    isClosingDIComma = not isClosingDIComma
                for j in placesSlashesPair:
                    if j == i:
                        if isClosingDIComma:
                            isStillComment = True
                            if commentStartAt == -1:
                                commentStartAt = j
                        else:
                            isStillComment = False
            note = ""
            note = line[commentStartAt:].strip("//")
            note = note.strip()
            line = line[:commentStartAt].strip()
            singleLineComments.append(note)
            isStillComment = False
        if "\"" in line:
            print()
        else:
            words = line.split(" ")
            print(words)
            for word in words:
                

print(multiLineComments)
print(singleLineComments)
file.close()

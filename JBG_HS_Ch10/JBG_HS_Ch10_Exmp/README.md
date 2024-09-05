# JBG_HS_Ch10_Exmp

### Example: ReadBytes

#### Source Code
[ReadBytes.java](./ReadBytes.java)

**Description:** 

Read an array of bytes from the keyboard.

#### Execution Logs

```
Enter some characters.
Read Bytes
You entered: Read Bytes
```

---
---

### Example: WriteDemo

#### Source Code
[WriteDemo.java](./WriteDemo.java)

**Description:** 

Demonstrate `System.out.write()`

#### Execution Logs

```
X
```

---
---

### Example: JBG_JBG_HS_Ch10_Exmp_03

#### Source Code
[JBG_JBG_HS_Ch10_Exmp_03](./JBG_JBG_HS_Ch10_Exmp_03)

**Description:** 

Display a text file.

To use this program, specify the name of the file that you want to see. For example, to see a file called TEST.TXT, use the following command line.

`java ShowFile TEST.TXT`

Without usage of `finally`.

#### Execution Logs

```
$ java ShowFile test.txt 
Hi,

I am here to support the demonstration of
'FileInputStream`.

Happy learning... :)
```

---
---

### Example: JBG_JBG_HS_Ch10_Exmp_04

#### Source Code
[JBG_JBG_HS_Ch10_Exmp_04](./JBG_JBG_HS_Ch10_Exmp_04)

**Description:** 

This variation wraps the code that opens and accesses the file within a single try block. The file is closed by the finally block.

#### Execution Logs

```
$ java ShowFile test.txt 
Hi,

I am here to support the demonstration of
'FileInputStream`.

Happy learning... :)
```

---
---

### Example: JBG_JBG_HS_Ch10_Exmp_05

#### Source Code
[JBG_JBG_HS_Ch10_Exmp_05](./JBG_JBG_HS_Ch10_Exmp_05)

**Description:** 

To use this program, specify the name of the source file and destination file. For example, to copy a file called `first.text` to a file called `second.txt`, use the following command line.

`java CopyFile first.txt second.txt`

#### Execution Logs

Nothing gets printed to the console but the contents of `first.txt` is successfully copied to `second.txt`.

```
$ java CopyFile first.txt second.txt 
```

---
---

### Example: JBG_JBG_HS_Ch10_Exmp_06

#### Source Code
[JBG_JBG_HS_Ch10_Exmp_06](./JBG_JBG_HS_Ch10_Exmp_06)

**Description:** 

This version of the `ShowFile` program uses a *`try`-with-resources* statement to automatically close a file when it is no longer needed.

#### Execution Logs

```
Hi,

I am here to support the demonstration of
'FileInputStream`.

Happy learning... :)
```

---
---

### Example: JBG_JBG_HS_Ch10_Exmp_07

#### Source Code
[JBG_JBG_HS_Ch10_Exmp_07](./JBG_JBG_HS_Ch10_Exmp_07)

**Description:** 

A version of CopyFile that uses try-with-resources. It demonstrates two resources (in this case files) being managed by a single try statement.

#### Execution Logs

No output is seen on the console but text is copied from `first.txt` to `second.txt` file successfully.

```
$ java CopyFile first.txt second.txt
```

---
---

### Example: RWData

#### Source Code
[RWData.java](./RWData.java)

**Description:** 



#### Execution Logs

```

```

---
---

### Example: CompFiles

#### Source Code
[CompFiles.java](./CompFiles.java)

**Description:** 



#### Execution Logs

```

```

---
---

### Example: RandomAccessDemo

#### Source Code
[RandomAccessDemo.java](./RandomAccessDemo.java)

**Description:** 



#### Execution Logs

```

```

---
---

### Example: ReadChars

#### Source Code
[ReadChars.java](./ReadChars.java)

**Description:** 



#### Execution Logs

```

```

---
---

### Example: ReadLines

#### Source Code
[ReadLines.java](./ReadLines.java)

**Description:** 



#### Execution Logs

```

```

---
---

### Example: PrintWriterDemo

#### Source Code
[PrintWriterDemo.java](./PrintWriterDemo.java)

**Description:** 



#### Execution Logs

```

```

---
---

### Example: KtoD

#### Source Code
[KtoD.java](./KtoD.java)

**Description:** 



#### Execution Logs

```

```

---
---

### Example: DtoS

#### Source Code
[DtoS.java](./DtoS.java)

**Description:** 



#### Execution Logs

```

```

---
---

### Example: AvgNums

#### Source Code
[AvgNums.java](./AvgNums.java)

**Description:** 



#### Execution Logs

```

```

---
---

### Example: FileHelp

#### Source Code
[FileHelp.java](./FileHelp.java)

**Description:** 



#### Execution Logs

```

```

---
---


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

### Example: JBG_JBG_HS_Ch10_Exmp_08

#### Source Code
[JBG_JBG_HS_Ch10_Exmp_08](./JBG_JBG_HS_Ch10_Exmp_08)

**Description:** 

Write and then read back binary data.

#### Execution Logs

```
$ java RWData | $XCLIP0
Writing 10
Writing 1023.56
Writing true
Writing 90.28


Reading 10
Reading 1023.56
Reading true
Reading 90.28
```

---
---

### Example: JBG_JBG_HS_Ch10_Exmp_09 | Try This 10-1 A file comparison Utility.

#### Source Code
[JBG_JBG_HS_Ch10_Exmp_09](./JBG_JBG_HS_Ch10_Exmp_09)

**Description:** 

Try This 10-1
A file comparison Utility.
Compare two files.

To use this program, specify the names of the files to be compared on the command line.

`java CompFiles first.txt second.txt`

#### Execution Logs

```
$ java CompFiles file1.txt file2.txt 
Files are the same.
$ java CompFiles file1.txt file3.txt 
Files differ
$ java CompFiles file1.txt file4.txt 
Files differ
```

---
---

### Example: JBG_JBG_HS_Ch10_Exmp_10 | Try This 10-1-1 A file comparison Utility case-insensitive.

#### Source Code
[JBG_HS_Ch10_Exmp_10](./JBG_HS_Ch10_Exmp_10/)

**Description:** 

Try This 10-1-1
A file comparison utility.

Compare two files and ignore the case of the letters during comparison.

To use this program, specify the names of files to be compared on the command line.

`java CompFiles file1 file2`

#### Execution Logs

```
$ java CompFiles file1.txt file2.txt 
Files are same.
$ java CompFiles file1.txt file3.txt 
Files are same.
$ java CompFiles file1.txt file4.txt 
File differ
```

---
---

### Example: JBG_JBG_HS_Ch10_Exmp_11 | Try This 10-1-2 A file comparison Utility positions of differences.

#### Source Code
[JBG_HS_Ch10_Exmp_11](./JBG_HS_Ch10_Exmp_11/)

**Description:** 

Try This 10-1-2
A file comparison utility.

Compare two files. Display the position within the file where the files differ.

To use this program, specify the names of files to be compared on the command line.

`java CompFiles file1 file2`

#### Execution Logs

```
$ java CompFiles file1.txt file2.txt
Files are same.
$ java CompFiles file1.txt file3.txt
Files are not same.
Positions with differences in the compared files:
29 63 129 166 260 286
$ java CompFiles file1.txt file4.txt
Files are not same.
Positions with differences in the compared files:
25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 43 45 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 77 78 79 80 81 82 83 84 85 86 87 90 91 92 93 94 95 96 97 98 99 101 102 104 105 106 107 108 109 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 166 167 168 169 170 171 172 173 174 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 192 193 195 196 197 198 199 200 201 202 203 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 221 222 223 224 225 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255 256 257 259 260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299 300 301 302 303 304 305 306 307 308 309 310 311 313 315 316 317 318 319 320 321 322 323 324 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 360 361 362 363 364 365
```

---
---

### Example: JBG_HS_Ch10_Exmp_12

#### Source Code
[JBG_HS_Ch10_Exmp_12](./JBG_HS_Ch10_Exmp_12)

**Description:** 

Demonstrate radom access files.

#### Execution Logs

```
First value is 19.4
Second value is 10.1
Fourth value is 33.0

Here is every other value: 
19.4 10.1 123.54 33.0 87.9 74.25 
```

---
---

### Example: JBG_HS_Ch10_Exmp_13

#### Source Code
[JBG_HS_Ch10_Exmp_13](./JBG_HS_Ch10_Exmp_13)

**Description:** 

Use a BufferedReader to read characters from the console.

#### Execution Logs

```
Enter characters, period to quit.
One Two.
O
n
e
 
T
w
o
.
```

---
---

### Example: JBG_HS_Ch10_Exmp_14

#### Source Code
[JBG_HS_Ch10_Exmp_14](./JBG_HS_Ch10_Exmp_14)

**Description:** 

Read a string from console using a BufferedReader.

Use `readLine()` from `BufferedReader` to read a line of text.

#### Execution Logs

```
Enter lines of text.
Enter 'stop' to quit.
I am not gonna stop.
I am not gonna stop.
Will you stop?
Will you stop?
stop
stop
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


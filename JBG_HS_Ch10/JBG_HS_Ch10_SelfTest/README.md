# JBG_HS_Ch10_SelfTest

## SelfTest01

### SelfTest Problem

Why does Java define both byte and character streams?

### SelfTest Solution

The byte streams are the original streams defined by Java. They are especially useful for binary I/O, and they support random-access files. The character streams are optimized for Unicode.

---
---

## SelfTest02

### SelfTest Problem

Even though console input and output is text-­based, why does Java still use byte streams for this purpose?

### SelfTest Solution

The predefined streams, `System.in`, `System.out`, and `System.err`, were defined before Java added the character streams.

---
---

## SelfTest03

### SelfTest Problem

Show how to open a file for reading bytes.

### SelfTest Solution

Here is one way to open a file for `byte` input: 

```java
FileInputStream fin = new FileInputStream("test")
```

---
---

## SelfTest04

### SelfTest Problem

Show how to open a file for reading characters.

### SelfTest Solution

Here is one way to open a file for reading characters:

```java
FileReader fr = new FileReader("test");
```

---
---

## SelfTest05

### SelfTest Problem

Show how to open a file for random-­access I/O.

### SelfTest Solution

Here is one way to open a file for random access: 

```java
randFile = new RandomAccessFile("test", "rw");
```

---
---

## SelfTest06

### SelfTest Problem

How can you convert a numeric string such as "123.23" into its binary equivalent?

### SelfTest Solution

To convert numeric strings into their binary equivalents, use the parsing methods defined by the type wrappers, such as `Integer` or `Double`.

---
---

## SelfTest07

### SelfTest Problem

Write a program that copies a text file. In the process, have it convert all spaces into hyphens. Use the byte stream file classes. Use the traditional approach to closing a file by explicitly calling `close()`.

### SelfTest Solution

[JBG_HS_Ch10_SelfTest07](./JBG_HS_Ch10_SelfTest07/)

```
$ java Hyphen file1.txt file2.txt 
```

---
---

## SelfTest08

### SelfTest Problem

Rewrite the program described in question 7 so that it uses the character stream classes. This time, use the `try­`-with-­resources statement to automatically close the file.

### SelfTest Solution

[JBG_HS_Ch10_SelfTest08](./JBG_HS_Ch10_SelfTest08/)

```
$ java Hyphen file1.txt file2.txt
```

---
---

## SelfTest09

### SelfTest Problem

What type of stream is `System.in`?

### SelfTest Solution

`InputStream`

---
---

## SelfTest10

### SelfTest Problem

What does the `read()` method of `InputStream` return when an attempt is made to read at the end of the stream?

### SelfTest Solution

-1

---
---

## SelfTest11

### SelfTest Problem

What type of stream is used to read binary data?

### SelfTest Solution

`DataInputStream`

---
---

## SelfTest12

### SelfTest Problem

`Reader` and `Writer` are at the top of the ____________ class hierarchies.

### SelfTest Solution

Character-based I/O.

---
---

## SelfTest13

### SelfTest Problem

The `try­`-with-­resources statement is used for ___________________________________.

### SelfTest Solution

Automatic resource management.

---
---

## SelfTest14

### SelfTest Problem

If you are using the traditional method of closing a file, then closing a file within a `finally` block is generally a good approach. True or False?

### SelfTest Solution

True.

---
---

## SelfTest15

### SelfTest Problem

Can local variable type inference be used when declaring the resource in a `try­`-with­-resources statement?

### SelfTest Solution

Yes.

---
---


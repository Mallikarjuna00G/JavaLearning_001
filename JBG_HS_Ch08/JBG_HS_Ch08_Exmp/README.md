# JBG_HS_Ch08_Exmp

### Example: JBG_HS_Ch08_Exmp_01

#### Source Code
[bookpack/BookDemo.java](./bookpack/BookDemo.java)

**Description:** 

A short package demonstration.

#### Execution Logs

```
Java: A Beginner's Guide
Schildt
2019

Java: The Complete Reference
Schildt
2019

Introducing JavaFX 8 Programming
Schildt
2015

Red Storm Rising
Clansy
1986

On the Road
Kerouac
1955

```

---
---

### Example: JBG_HS_Ch08_Exmp_02

#### Source Code
- [bookpackext/UseBook.java](./bookpackext/UseBook.java)
- [bookpack/Book.java](./bookpack/Book.java)

**Description:** 

A short package demonstration.

A top­level class has only two possible access levels: default and `public`. When a class is declared as `public`, it is accessible outside its package. If a class has default access, it can be accessed only by other code within its same package. Also, a class that is declared `public` must reside in a file by the same name.

#### Execution Logs

```
Java: A Beginner's Guide
Schildt
2019

Java: The Complete Reference
Schildt
2019

Introducing JavaFX 8 Programming
Schildt
2015

Red Storm Rising
Clansy
1986

On the Road
Kerouac
1955

```

---
---

### Example: JBG_HS_Ch08_Exmp_03

#### Source Code
- [bookpackext/ProtectDemo.java](./bookpackext/ProtectDemo.java)
- [bookpack/Book.java](./bookpack/Book.java)

**Description:** 

Demonstrate `protected` member access from different package using subclass.

#### Execution Logs

```
Java: A Beginner's Guide
Schildt
2019

Oracle Press

Java: The Complete Reference
Schildt
2019

Oracle Press

Introducing JavaFX 8 Programming
Schildt
2015

Oracle Press

Red Storm Rising
Clansy
1986

Putnam

On the Road
Kerouac
1955

Viking

Showing all books by Schildt
 - Java: A Beginner's Guide
 - Java: The Complete Reference
 - Introducing JavaFX 8 Programming
```

---
---

### Example: JBG_HS_Ch08_Exmp_04

#### Source Code
- [bookpackext/UseBook.java](./bookpackext/UseBook.java)
- [bookpack/Book.java](./bookpack/Book.java)

**Description:** 

Demonstrate importing packages.

#### Execution Logs

```
Java: A Beginner's Guide
Schildt
2019

Java: The Complete Reference
Schildt
2019

Introducing JavaFX 8 Programming
Schildt
2015

Red Storm Rising
Clansy
1986

On the Road
Kerouac
1955

```

---
---

### Example: SeriesDemo

#### Source Code
[SeriesDemo.java](./SeriesDemo.java)

**Description:** 

Demonstrate an intrface.

#### Execution Logs

```
Next value is 2
Next value is 4
Next value is 6
Next value is 8
Next value is 10

Resetting
Next value is 2
Next value is 4
Next value is 6
Next value is 8
Next value is 10

Starting at 100
Next value is 102
Next value is 104
Next value is 106
Next value is 108
Next value is 110
```

---
---

### Example: SeriesDemo2

#### Source Code
[SeriesDemo2.java](./SeriesDemo2.java)

**Description:** 

#### Execution Logs

```
Next ByTwos value is 2
Next ByThree value is 3
Next ByTwos value is 4
Next ByThree value is 6
Next ByTwos value is 6
Next ByThree value is 9
Next ByTwos value is 8
Next ByThree value is 12
Next ByTwos value is 10
Next ByThree value is 15
```

---
---

### Example: | Try This 8­-1 Creating a Queue Interface

#### Source Code
- [IQDemo.java](./IQDemo.java)
- [ICharQ.java](./ICharQ.java)

**Description:** 

Try This 8­-1 Creating a Queue Interface
- Fixed queue
- Circular queue
- Dynamic queue

#### Execution Logs

```
Contents of fixed queue: ABCDEFGHIJ
--------------------------------------
Contents of dynamic queue: ZYXWVUTSRQ
--------------------------------------
Contents of circular queue: ABCDEFGHIJ
--------------------------------------
Contents of circular queue: KLMNOPQRST
--------------------------------------

Store and consume from circular queue.
ABCDEFGHIJKLMNOPQRST
```

---
---

### Example: | Try This 8­-1-1 Creating a Queue Interface: Circular version of DynQueue.

#### Source Code
- [IQDemo.java](./IQDemo.java)
- [ICharQ.java](./ICharQ.java)

**Description:** 

Try This 8­-1 Creating a Queue Interface
- Fixed queue
- Circular queue
- Dynamic queue
- Circular dynamic queue: Please note that initial size was only 5 for the queue.

#### Execution Logs

```
Contents of fixed queue: ABCDEFGHIJ
--------------------------------------
Contents of dynamic queue: ZYXWVUTSRQ
--------------------------------------
Contents of circular queue: ABCDEFGHIJ
--------------------------------------
Contents of circular queue: KLMNOPQRST
--------------------------------------

Store and consume from circular queue.
ABCDEFGHIJKLMNOPQRST
--------------------------------------
Contents of circular dynamic queue: ABCDEFGHIJ
--------------------------------------
Contents of circular dynamic queue: KLMNOPQRST
--------------------------------------

Store and consume from circular dynamic queue.
ABCDEFGHIJKLMNOPQRST
```

---
---

### Example: | Try This 8­-1-1 Creating a Queue Interface: `reset` method to the interface.

#### Source Code
- [IQDemo.java](./IQDemo.java)
- [ICharQ.java](./ICharQ.java)

**Description:** 

Try This 8­-1 Creating a Queue Interface
- Fixed queue
- Circular queue
- Dynamic queue
- Circular dynamic queue: Please note that initial size was only 5 for the queue.
- `reset` method to the interface.

#### Execution Logs

```
Contents of fixed queue: ABCDEFGHIJ
--------------------------------------
 - Queue is full.
 - Queue is full.
 - Queue is full.
 - Queue is full.
 - Queue is full.
Reset queue: Contents of fixed queue: FGHIJ - Queue is empty.
  - Queue is empty.
  - Queue is empty.
  - Queue is empty.
  - Queue is empty.
 
--------------------------------------
Contents of dynamic queue: ZYXWVUTSRQ
--------------------------------------
Contents of circular queue: ABCDEFGHIJ
--------------------------------------
Contents of circular queue: KLMNOPQRST
--------------------------------------

Store and consume from circular queue.
ABCDEFGHIJKLMNOPQRST
--------------------------------------
Contents of circular dynamic queue: ABCDEFGHIJ
--------------------------------------
Contents of circular dynamic queue: KLMNOPQRST
--------------------------------------

Store and consume from circular dynamic queue.
ABCDEFGHIJKLMNOPQRST
```

---
---

### Example: | Try This 8­-1-1 Creating a Queue Interface: `static` method that copies of the contents of one type of queue to another.

#### Source Code
- [IQDemo.java](./IQDemo.java)
- [ICharQ.java](./ICharQ.java)

**Description:** 

Try This 8­-1 Creating a Queue Interface
- Fixed queue
- Circular queue
- Dynamic queue
- Circular dynamic queue: Please note that initial size was only 5 for the queue.
- `reset` method to the interface.
- `static` method `copyQueue()` to copy the queue elements from one form of queue to another form of queue.

#### Execution Logs

```
Contents of fixed queue: ABCDEFGHIJ
--------------------------------------
 - Queue is full.
 - Queue is full.
 - Queue is full.
 - Queue is full.
 - Queue is full.
Reset queue: Contents of fixed queue: FGHIJ - Queue is empty.
  - Queue is empty.
  - Queue is empty.
  - Queue is empty.
  - Queue is empty.
 
--------------------------------------
Contents of dynamic queue: ZYXWVUTSRQ
--------------------------------------
Contents of circular queue: ABCDEFGHIJ
--------------------------------------
Contents of circular queue: KLMNOPQRST
--------------------------------------

Store and consume from circular queue.
ABCDEFGHIJKLMNOPQRST
--------------------------------------
Re-initializing source queue before copy: 
Copying queue: 
Contents of circular queue after copy: CDEFG - Queue is empty.
  - Queue is empty.
  - Queue is empty.
  - Queue is empty.
  - Queue is empty.
 --------------------------------------
Contents of circular dynamic queue: ABCDEFGHIJ
--------------------------------------
Contents of circular dynamic queue: KLMNOPQRST
--------------------------------------

Store and consume from circular dynamic queue.
ABCDEFGHIJKLMNOPQRST
```

---
---

### Example: IConstD

#### Source Code
[IConstD.java](./IConstD.java)

**Description:** 

#### Execution Logs

```
0 1 2 3 4 5 6 7 8 9 Boundary Error
```

---
---

### Example: IFExtend

#### Source Code
[IFExtend.java](./IFExtend.java)

**Description:** 

#### Execution Logs

```
Implement meth1().
Implement meth2().
Implement meth3().
```

---
---

### Example: DefaultMethodDemo

#### Source Code
[DefaultMethodDemo.java](./DefaultMethodDemo.java)

**Description:** 

#### Execution Logs

```
User ID is 100
Adminstrator ID is 1
User ID is 100
Adminstrator ID is 42
```

---
---


# JBG_HS_Ch06_Exmp

### Example: AccessDemo

#### Source Code
[AccessDemo.java](./AccessDemo.java)

**Description:** Public vs private access.

#### Execution Logs

```
ob.alpha is: -99
```

---

### Example: FSDemo

#### Source Code
[FSDemo.java](./FSDemo.java)

**Description:** Demonstrate the fail-soft array.

#### Execution Logs

```
Fail quietly.
0 10 20 30 40 

Fail with error reports.
Index 5 out-of-bounds
Index 6 out-of-bounds
Index 7 out-of-bounds
Index 8 out-of-bounds
Index 9 out-of-bounds
0 10 20 30 40 Index 5 out-of-bounds
Index 6 out-of-bounds
Index 7 out-of-bounds
Index 8 out-of-bounds
Index 9 out-of-bounds

```

---

### Example: QDemo | Try This 6-­1 Improving the Queue Class

#### Source Code
[QDemo.java](./QDemo.java)

**Description:** 

#### Execution Logs

```
Using bigQ to store the alphabet.
Contents of bigQ: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Using smallQ to generate errors.
Attempting to store Z
Attempting to store Y
Attempting to store X
Attempting to store W
Attempting to store V - Queue is full.


Contents of smallQ: ZYXW - Queue is empty.
```

---

### Example: PassOb

#### Source Code
[PassOb.java](./PassOb.java)

**Description:** Objects can be passed to methods.

#### Execution Logs

```
ob1 same dimensions as ob2: true
ob1 same dimensions as ob3: false
ob1 same volume as ob3: true
```

---

### Example: CallByValue

#### Source Code
[CallByValue.java](./CallByValue.java)

**Description:** Primitive types are passed by value.

#### Execution Logs

```
a and b before call: 15 20
a and b after call: 15 20
```

---

### Example: PassObRef

#### Source Code
[PassObRef.java](./PassObRef.java)

**Description:** Objects are passed through their references.

#### Execution Logs

```
ob.a and ob.b before call: 15 20
ob.a and ob.b after call: 35 -20
```

---

### Example: ErrMsg

#### Source Code
[ErrMsg.java](./ErrMsg.java)

**Description:** Return a string object.

#### Execution Logs

```
Disk Full
Invalid error code
```

---

### Example: ErrInfo

#### Source Code
[ErrInfo.java](./ErrInfo.java)

**Description:** Return a programmer-defined object.

#### Execution Logs

```
Disk Full severity: 2
Invalid Error Code severity: 0
```

---

### Example: OverloadDemo

#### Source Code
[OverloadDemo.java](./OverloadDemo.java)

**Description:** Demonstrate method overloading.

#### Execution Logs

```
No parameters

One parameter: 2

Two parameters: 4 6
Result of ob.ovlDemo(4, 6): 10

Two double parameters: 1.1 2.32
Result of ob.ovlDemo(1.1, 2.32): 3.42

```

---

### Example: TypeConv

#### Source Code
[TypeConv.java](./TypeConv.java)

**Description:** Automatic type conversions can affect overloaded method resolution.

#### Execution Logs

```
Inside f(int): 10
Inside f(double): 10.1
Inside f(int): 99
Inside f(int): 10
Inside f(double): 11.5
```

---

### Example: TypeConv2

#### Source Code
[TypeConv.java](./TypeConv2.java)

**Description:** Automatic type conversions can affect overloaded method resolution.

Function overloading for byte type parameter to avoid type conversion. 

#### Execution Logs

```
Inside f(int): 10
Inside f(double): 10.1
Inside f(byte): 99
Inside f(int): 10
Inside f(double): 11.5
```

---

### Example: OverloadConsDemo

#### Source Code
[OverloadConsDemo.java](./OverloadConsDemo.java)

**Description:** Demonstrate an overloaded constructor.

#### Execution Logs

```
Inside MyClass().
Inside MyClass(int).
Inside MyClass(double).
Inside MyClass(int, int).
t1.x: 0
t2.x: 88
t3.x: 17
t4.x: 8
```

---

### Example: SumDemo

#### Source Code
[SumDemo.java](./SumDemo.java)

**Description:** Initialize one object with another.

#### Execution Logs

```
s1.sum: 15
s2.sum: 15
```

---

### Example: QDemo2 | Try This 6­-2 Overloading the Queue Constructor

#### Source Code
[QDemo2.java](./QDemo2.java)

**Description:** *Try This 6-2*

Constructor overloading. Construct Queue from a Queue.

Construct a Queue with initial values.

#### Execution Logs

```
Show contents of q1: ABCDEFGHIJ

Contents of q2: Premika

Contents of q3: ABCDEFGHIJ
```

---

### Example: Recursion

#### Source Code
[Recursion.java](./Recursion.java)

**Description:** A simple example of recursion.

#### Execution Logs

```
Factorials using resursive method: 
Factorial of 3 is 6
Factorial of 4 is 24
Factorial of 5 is 120

Factorials using iterative method: 
Factorial of 3 is 6
Factorial of 4 is 24
Factorial of 5 is 120

```

---

### Example: SDemo

#### Source Code
[SDemo.java](./SDemo.java)

**Description:** Use a static variable.

#### Execution Logs

```
Of course, ob1.x and ob2.x are independent.
ob1.x: 10
ob2.x: 20

The static variable y is shared.
Set StaticDemo.y to 19.
ob1.sum(): 29
ob2.sum(): 39

Change StaticDemo.y to 100.
ob1.sum(): 110
ob2.sum(): 120

```

---

### Example: SDemo2

#### Source Code
[SDemo2.java](./SDemo2.java)

**Description:** Use a static method.

#### Execution Logs

```
val is 1024
StaticMeth.valDiv2(): 512
val is 4
StaticMeth.valDiv2(): 2
```

---

### Example: SDemo3

#### Source Code
[SDemo3.java](./SDemo3.java)

**Description:** Use a static block.

#### Execution Logs

```
Inside static block.
Inside Constructor
Square root of 2 is 1.4142135623730951
Square root of 3 is 1.7320508075688772
```

---

### Example: QSDemo | Try This 6­-3 The Quicksort

#### Source Code
[QSDemo.java](./QSDemo.java)

**Description:** *Try This 6-3*: A simple version of the quicksort.

#### Execution Logs

```
Original array: dxarpji
Sorted array: adijprx
```

---

### Example: NestedClassDemo

#### Source Code
[NestedClassDemo.java](./NestedClassDemo.java)

**Description:** Use an inner class.

#### Execution Logs

```
Minimum: 1
Maximum: 9
Average: 5
```

---

### Example: LocalClassDemo

#### Source Code
[LocalClassDemo.java](./LocalClassDemo.java)

**Description:** Use `ShowBits` as local class.

#### Execution Logs

```
0 in binary: 00000000 
1 in binary: 00000001 
2 in binary: 00000010 
3 in binary: 00000011 
4 in binary: 00000100 
5 in binary: 00000101 
6 in binary: 00000110 
7 in binary: 00000111 
8 in binary: 00001000 
9 in binary: 00001001
```

---

### Example: VarArgs

#### Source Code
[VarArgs.java](./VarArgs.java)

**Description:** Demonstrate variable-length arguments.

#### Execution Logs

```
Number of args: 1
Contents: 
  arg 0: 10

Number of args: 3
Contents: 
  arg 0: 1
  arg 1: 2
  arg 2: 3

Number of args: 0
Contents: 

```

---

### Example: VarArgs2

#### Source Code
[VarArgs2.java](./VarArgs2.java)

**Description:** Use varargs with standard arguments.

#### Execution Logs

```
One vararg: 1
Contents: 
  arg 0: 10

Three varargs: 3
Contents: 
  arg 0: 1
  arg 1: 2
  arg 2: 3

No varargs: 0
Contents: 

```

---

### Example: VarArgs3

#### Source Code
[VarArgs3.java](./VarArgs3.java)

**Description:** Varargs and Overloading.

#### Execution Logs

```
vaTest(int ...): Number of args: 3
Contents: 
  arg 0: 1
  arg 1: 2
  arg 2: 3

vaTest(String, int ...): Testing2
Contents: 
  arg 0: 10
  arg 1: 20

vaTest(boolean ...): Number of args: 3
Contents: 
  arg 0: true
  arg 1: false
  arg 2: false

```

---

### Example: VarArgs4

#### Source Code
[VarArgs4.java](./VarArgs4.java)

**Description:** 

#### Execution Logs

```

```

---


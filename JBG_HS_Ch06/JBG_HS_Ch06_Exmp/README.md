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

### Example: QDemo3 | Try This 6-­1 Improving the Queue Class

#### Source Code
[QDemo3.java](./QDemo3.java)

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

### Example: QDemo2

#### Source Code
[QDemo2.java](./QDemo2.java)

**Description:** 

#### Execution Logs

```

```

---

### Example: Recursion

#### Source Code
[Recursion.java](./Recursion.java)

**Description:** 

#### Execution Logs

```

```

---

### Example: SDemo

#### Source Code
[SDemo.java](./SDemo.java)

**Description:** 

#### Execution Logs

```

```

---

### Example: SDemo2

#### Source Code
[SDemo2.java](./SDemo2.java)

**Description:** 

#### Execution Logs

```

```

---

### Example: SDemo3

#### Source Code
[SDemo3.java](./SDemo3.java)

**Description:** 

#### Execution Logs

```

```

---

### Example: QSDemo

#### Source Code
[QSDemo.java](./QSDemo.java)

**Description:** 

#### Execution Logs

```

```

---

### Example: NestedClassDemo

#### Source Code
[NestedClassDemo.java](./NestedClassDemo.java)

**Description:** 

#### Execution Logs

```

```

---

### Example: LocalClassDemo

#### Source Code
[LocalClassDemo.java](./LocalClassDemo.java)

**Description:** 

#### Execution Logs

```

```

---

### Example: VarArgs

#### Source Code
[VarArgs.java](./VarArgs.java)

**Description:** 

#### Execution Logs

```

```

---

### Example: VarArgs2

#### Source Code
[VarArgs2.java](./VarArgs2.java)

**Description:** 

#### Execution Logs

```

```

---

### Example: VarArgs3

#### Source Code
[VarArgs3.java](./VarArgs3.java)

**Description:** 

#### Execution Logs

```

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


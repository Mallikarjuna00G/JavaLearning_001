# JBG_HS_Ch06_SelfTest

## SelfTest01

### SelfTest Problem

Given this fragment,

```java
class X {
    private int count;
```

is the following fragment correct?

```java
class Y {
    public static void main(String args[]) {
        X ob = new X();

        ob.count = 10;
```

### SelfTest Solution

No; a private member cannot be accessed outside of its class.

---

## SelfTest02

### SelfTest Problem

An access modifier must __________ a member’s declaration.

### SelfTest Solution

precede.

---

## SelfTest03

### SelfTest Problem

The complement of a queue is a stack. It uses first­-in, last-­out accessing and is often likened to a stack of plates. The first plate put on the table is the last plate used. Create a stack class called `Stack` that can hold characters. Call the methods that access the stack `push()` and `pop()`. Allow the user to specify the size of the stack when it is created. Keep all other members of the `Stack` class `private`. (*Hint:* You can use the `Queue` class as a model; just change the way the data is accessed.)

### SelfTest Solution

#### Programs:

[JBG_HS_Ch06_SelfTest_03.java](./JBG_HS_Ch06_SelfTest_03.java)

#### Execution Logs

```
Contents of q1: JIHGFEDCBA

Contents of q2: akimerP

Contents of q3: JIHGFEDCBA
```

---

## SelfTest04

### SelfTest Problem

Given this class,

```java
class Test {
    int a;
    Test(int i) { a = i; }
}
```

write a method called `swap()` that exchanges the contents of the objects referred to by two `Test` object references.

### SelfTest Solution

```java
void swap(Test ob1, Test ob2) {
    var t = ob1.a;
    ob1.a = ob2.a;
    ob2.a = t;
}
```

---

## SelfTest05

### SelfTest Problem

Is the following fragment correct?

```java
class X {
    int meth(int a, int b) { ... }
    String meth(int a, int b) { ... }
```

### SelfTest Solution

No. Overloaded methods can have different return types, but they do not play a role in overload resolution. Overloaded methods must have different parameter lists.

---

## SelfTest06

### SelfTest Problem

Write a recursive method that displays the contents of a string backwards.

### SelfTest Solution

#### Programs:

[JBG_HS_Ch06_SelfTest_06.java](./JBG_HS_Ch06_SelfTest_06.java)

#### Execution Logs

```
Display the string as is: 
Lack of knowledge lead to suffering.
Display the string in backwards: 
.gnireffus ot dael egdelwonk fo kcaL
```

---

## SelfTest07

### SelfTest Problem

If all objects of a class need to share the same variable, how must you declare that variable?

### SelfTest Solution

Shared variables are declared as `static`.

---

## SelfTest08

### SelfTest Problem

Why might you need to use a `static` block?

### SelfTest Solution

A `static` block is used to perform any initializations related to the class, before any objects are created.

---

## SelfTest09

### SelfTest Problem

What is an inner class?

### SelfTest Solution

An inner class is a nonstatic nested class.

---

## SelfTest10

### SelfTest Problem

To make a member accessible by only other members of its class, what access modifier must be used?

### SelfTest Solution

`private`

---

## SelfTest11

### SelfTest Problem

The name of a method plus its parameter list constitutes the method’s _______________.

### SelfTest Solution

signature.

---

## SelfTest12

### SelfTest Problem

An `int` argument is passed to a method by using call­-by- ­_______________.

### SelfTest Solution

value.

---

## SelfTest13

### SelfTest Problem

Create a varargs method called `sum()` that sums the `int` values passed to it. Have it return the result. Demonstrate its use.

### SelfTest Solution

#### Programs:

[JBG_HS_Ch06_SelfTest_13.java](./JBG_HS_Ch06_SelfTest_13.java)

#### Execution Logs

```
Sum of 1, 2, 3, 4, 5, 6, 7, 8, 9: 45
Sum of 1, 2, -3, 4, -5, 6, -7, 8, 9: 15
Sum of -1, -2, -3, -4, 5, 6, 7, 8, 9: 25
```

---

## SelfTest14

### SelfTest Problem

Can a varargs method be overloaded?

### SelfTest Solution

Yes.

---

## SelfTest15

### SelfTest Problem

Show an example of an overloaded varargs method that is ambiguous.

### SelfTest Solution

An example of ambiguity:

```java
static void vaTest(int ... v) {
    // ...
}

static void vaTest(int n, int ... v) {
    // ...
}
```

Although the parameter lists of `vaTest()` differ, there is no way for the compiler to resolve the following call:

```java
vaTest(1);
```


---


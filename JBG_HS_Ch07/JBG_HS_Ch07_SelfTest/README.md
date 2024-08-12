# JBG_HS_Ch07_SelfTest

## SelfTest01

### SelfTest Problem

Does a superclass have access to the members of a subclass? Does a subclass have access to the members of a superclass?

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest02

### SelfTest Problem

Create a subclass of `TwoDShape` called `Circle`. Include an `area()` method that computes the area of the circle and a constructor that uses `super` to initialize the `TwoDShape` portion.

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest03

### SelfTest Problem

How do you prevent a subclass from having access to a member of a superclass?

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest04

### SelfTest Problem

Describe the purpose and use of the two versions of `super` described in this chapter.

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest05

### SelfTest Problem

Given the following hierarchy:

```java
class Alpha { ... }
class Beta extends Alpha { ... }
class Gamma extends Beta { ... }
```

In what order do the constructors for these classes complete their execution when a `Gamma` object is instantiated?

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest06

### SelfTest Problem

A superclass reference can refer to a subclass object. Explain why this is important as it relates to method overriding.

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest07

### SelfTest Problem

What is an abstract class?

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest08

### SelfTest Problem

How do you prevent a method from being overridden? How do you prevent a class from being inherited?

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest09

### SelfTest Problem

Explain how *inheritance*, *method overriding*, and *abstract* classes are used to support *polymorphism*.

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest10

### SelfTest Problem

What class is a superclass of every other class?

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest11

### SelfTest Problem

A class that contains at least one abstract method must, itself, be declared abstract. True or False?

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest12

### SelfTest Problem

What keyword is used to create a named constant?

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest13

### SelfTest Problem

Assume that class `B` inherits class `A`. Further, assume a method called `makeObj()` that is declared as shown here:

```java
A makeObj(int which) {
    if(which == 0) return new A();
    else return new B();
}
```

Notice that `makeObj()` returns a reference to an object of either type `A` or `B`, depending on the value of `which`. Notice, however, that the return type of `makeObj()` is `A`. (Recall that a superclass reference can refer to a subclass object.) Given this situation and assuming that you are using JDK 10 or later, what is the type of `myRef` in the following declaration and why?

```java
var myRef = makeObj(1);
```

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---

## SelfTest14

### SelfTest Problem

Assuming the situation described in Question 13, what will the type of `myRef` be given this statement?

```java
var myRef = (B) makeObj(1);
```

### SelfTest Solution

#### Programs:

[]()

AAA

#### Execution Logs

```

```

---
---


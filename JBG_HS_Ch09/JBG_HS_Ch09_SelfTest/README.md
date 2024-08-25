# JBG_HS_Ch09_SelfTest

## SelfTest01

### SelfTest Problem

What class is at the top of the exception hierarchy?

### SelfTest Solution



---
---

## SelfTest02

### SelfTest Problem

Briefly explain how to use `try` and `catch`.

### SelfTest Solution



---
---

## SelfTest03

### SelfTest Problem

What is wrong with this fragment?

```java
// ...
vals[18] = 10;
catch (ArrayIndexOutOfBoundsException exc) {
    // handle error
}
```

### SelfTest Solution



---
---

## SelfTest04

### SelfTest Problem

What happens if an exception is not caught?

### SelfTest Solution



---
---

## SelfTest05

### SelfTest Problem

What is wrong with this fragment?

```java
class A extends Exception { ... }

class B extends A {
    ...
    // ...

    try {
        // ...
    }
    catch (A exc) { ... }
    catch (B exc) { ... }
}
```

### SelfTest Solution



---
---

## SelfTest06

### SelfTest Problem

Can an inner `catch` rethrow an exception to an outer `catch`?

### SelfTest Solution



---
---

## SelfTest07

### SelfTest Problem

The `finally` block is the last bit of code executed before your program ends. True or False? Explain your answer.

### SelfTest Solution



---
---

## SelfTest08

### SelfTest Problem

What type of exceptions must be explicitly declared in a `throws` clause of a method?

### SelfTest Solution



---
---

## SelfTest09

### SelfTest Problem

What is wrong with this fragment?

```java
class MyClass {
    // ...
}

// ...

throw new MyClass();
```

### SelfTest Solution



---
---

## SelfTest10

### SelfTest Problem

In question 3 of the Chapter 6 Self Test, you created a `Stack` class. Add custom exceptions to your class that report stack full and stack empty conditions.

### SelfTest Solution



---
---

## SelfTest11

### SelfTest Problem

What are the three ways that an exception can be generated?

### SelfTest Solution



---
---

## SelfTest12

### SelfTest Problem

What are the two direct subclasses of `Throwable`?

### SelfTest Solution



---
---

## SelfTest13

### SelfTest Problem

What is the multi­catch feature?

### SelfTest Solution



---
---

## SelfTest14

### SelfTest Problem

Should your code typically catch exceptions of type *Error*?

### SelfTest Solution



---
---


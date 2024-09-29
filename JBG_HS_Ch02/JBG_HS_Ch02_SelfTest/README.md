# JBG_HS_Ch02
## SelfTest01

### SelfTest Problem

Why does Java strictly specify the range and behavior of its primitive types?

### SelfTest Solution

Java strictly specifies a range and behavior for each primitive type, which all implementations of the Java Virtual Machine must support. Because of Java’s portability requirement, Java is uncompromising on this account. For example, an `int` is the same in all execution environments. This allows programs to be fully portable. There is no need to rewrite code to fit a specific platform. Although strictly specifying the range of the primitive types may cause a small loss of performance in some environments, it is necessary in order to achieve portability.

---

## SelfTest02

### SelfTest Problem

What is Java’s character type, and how does it differ from the character type used by some other programming languages?

### SelfTest Solution

In Java, characters are not 8­-bit quantities like they are in many other computer languages. Instead, Java uses Unicode. Unicode defines a character set that can represent all of the characters found in all human languages. In Java, `char` is an unsigned 16­-bit type having a range of 0 to 65,535. The standard 8­-bit ASCII character set is a subset of Unicode and ranges from 0 to 127. Thus, the ASCII characters are still valid Java characters.

---

## SelfTest03

### SelfTest Problem

A **boolean** value can have any value you like because any non­zero value is true. True or False?

### SelfTest Solution

False. The boolean type represents `true`/`false` values. Java defines the values `true` and `false` using the reserved words `true` and `false`. Thus, a variable or expression of type boolean will be one of these two values.

---

## SelfTest04

### SelfTest Problem

Given this output,

```
One
Two
Three
```

using a single string, show the `println()` statement that produced it.

### SelfTest Solution

```java
System.out.println("One\nTwo\nThree");
```

---
## SelfTest05

### SelfTest Problem

What is wrong with this fragment?

```java
for(i = 0; i < 10; i++) {
    int sum;

    sum = sum + i;
}
System.out.println("Sum is: " + sum);
```

### SelfTest Solution

The `sum` variable used in the `println` statement is not actually visible to it. Regardless of the `sum` variable's requirement in the `println` statement, due to the declaration of `sum` varibale is inside the `for` loop, by the end of the loop, `sum` will not actually have the total sum expected. The declaration of the `sum` variable must be before the `for` loop. The correct version is as follows: 

```java
int sum;
for(i = 0; i < 10; i++) {
    sum = sum + i;
}
System.out.println("Sum is: " + sum);
```

---

## SelfTest06

### SelfTest Problem

Explain the difference between the prefix and postfix forms of the increment operator.

### SelfTest Solution

When an increment operator precedes its operand (i.e., prefix), Java will perform the corresponding operation prior to obtaining the operand’s value for use by the rest of the expression. If the operator follows its operand (i.e., postfix), Java will obtain the operand’s value before incrementing or decrementing it.

---
## SelfTest07

### SelfTest Problem

Show how a short­-circuit AND can be used to prevent a divide­-by-­zero error.

### SelfTest Solution

```java
int n, d, q;

n = 10;
d = 2;

// if(expression1 && expression2)
if(d != 0 && (n % d) == 0) {
    System.out.println(d + " is a factor of " + n);
} // When the expression1 results in true, only then the expression2 gets evaluated. 
// As a part of expression1 we are checking if the denominator is not 0.
// If the denominator is not zero only then the expression2 (i.e., division/modulus) gets evaluated otherwise the entire if blocked will be skipped. This happens due to the usage of && (short-circuit AND) operator.

d = 0; // now, set d to zero

// since d is zero, the second operand is not evaluated.
if(d != 0 && (n % d) == 0) { // Will not enter the block
    System.out.println(d + " is a factor of " + n);
}

```

---
## SelfTest08

### SelfTest Problem

In an expression, what type are `byte` and `short` promoted to?

### SelfTest Solution

In an expression, the `byte` and `short` will get promoted to `int`.

---
## SelfTest09

### SelfTest Problem

In general, when is a cast needed?

### SelfTest Solution

A cast is needed when converting between incompatible types or when a narrowing conversion is occurring.

---
## SelfTest10

### SelfTest Problem

Write a program that finds all of the prime numbers between 2 and 100.

### SelfTest Solution

#### Programs:

[JBG_HS_Ch02_SelfTest_10.java](./JBG_HS_Ch02_SelfTest_10.java)

#### Execution Logs

```
Prime numbers between 2 and 100: 
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
```

---

## SelfTest11

### SelfTest Problem

Does the use of redundant parentheses affect program performance?

### SelfTest Solution

Use of redundant or additional parentheses will not cause errors or slow down the execution of the expression.

---

## SelfTest12

### SelfTest Problem

Does a block define a scope?

### SelfTest Solution

Yes

---

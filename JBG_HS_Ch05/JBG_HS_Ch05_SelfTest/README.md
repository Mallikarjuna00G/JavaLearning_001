# JBG_HS_Ch05_SelfTest

## SelfTest01

### SelfTest Problem

Show two ways to declare a one-­dimensional array of 12 doubles.

### SelfTest Solution

```java
double arr[] = new double[12];
double[] arr = new double[12];
```

---

## SelfTest02

### SelfTest Problem

Show how to initialize a one-­dimensional array of integers to the values 1 through 5.

### SelfTest Solution

```java
int[] arr = {1, 2, 3, 4, 5};
```

---

## SelfTest03

### SelfTest Problem

Write a program that uses an array to find the average of 10 `double` values. Use any 10 values you like.

### SelfTest Solution

#### Programs:

[JBG_HS_Ch05_SelfTest_03.java](./JBG_HS_Ch05_SelfTest_03.java)

#### Execution Logs

```
Average of the elements: 10.1 20.2 30.3 40.4 50.5 60.6 70.7 80.8 90.9 100.01 
Average: 55.451
```

---

## SelfTest04

### SelfTest Problem

Change the sort in `Try This 5­-1` so that it sorts an array of strings. Demonstrate that it works.

### SelfTest Solution

#### Programs:

[JBG_HS_Ch05_SelfTest_04.java](./JBG_HS_Ch05_SelfTest_04.java)

#### Execution Logs

```
Original array is:
 1. Rajakumaara
 2. Shankaranaag
 3. Vishnuvardhana
 4. Ravichandra
 5. Arjuna
 6. Sudeep
 7. Kishore
 8. Rishab
 9. Vajramuni
 10. SaadhuKokila

Sorted array is:
 1. Arjuna
 2. Kishore
 3. Rajakumaara
 4. Ravichandra
 5. Rishab
 6. SaadhuKokila
 7. Shankaranaag
 8. Sudeep
 9. Vajramuni
 10. Vishnuvardhana

```

---

## SelfTest05

### SelfTest Problem

What is the difference between the String methods `indexOf()` and `lastIndexOf()`?

### SelfTest Solution

The `indexOf()` method finds the first occurrence of the specified substring. `lastIndexOf()` finds the last occurrence.

---

## SelfTest06

### SelfTest Problem

Since all strings are objects of type `String`, show how you can call the `length()` and `charAt()` methods on this string literal: `"I like Java"`.

### SelfTest Solution

```java
System.out.println("I like Java".length());  // Output: 11
System.out.println("I like Java".charAt(5));  // Output: 5
```

---

## SelfTest07

### SelfTest Problem

Expanding on the `Encode` cipher class, modify it so that it uses an eight-­character string as the key.

### SelfTest Solution

#### Programs:

[JBG_HS_Ch05_SelfTest_07.java](./JBG_HS_Ch05_SelfTest_07.java)

#### Execution Logs

```
Original message: Idu yaaru bareda katheyo.. nanagaagi banda vyatheyo..
Encoded message: 9S


AP
S       A

]]
Decoded message: Idu yaaru bareda katheyo.. nanagaagi banda vyatheyo..
```

---

## SelfTest08

### SelfTest Problem

Can the bitwise operators be applied to the `double` type?

### SelfTest Solution

No.

---

## SelfTest09

### SelfTest Problem

Show how this sequence can be rewritten using the `?` operator.

```java
if(x < 0) y = 10;
else y = 20;
```

### SelfTest Solution

```java
y = (x < 0) ? (10) : (20);
```

---

## SelfTest10

### SelfTest Problem

In the following fragment, is the `&` a bitwise or logical operator? Why?

```java
boolean a, b;
// ...
if(a & b) ...
```

### SelfTest Solution

It is a logical operator because the operands are of type `boolean`.

---

## SelfTest11

### SelfTest Problem

Is it an error to overrun the end of an array? Is it an error to index an array with a negative value?

### SelfTest Solution

Yes and Yes.

---

## SelfTest12

### SelfTest Problem

What is the unsigned right-­shift operator?

### SelfTest Solution

```java
>>>
```

---

## SelfTest13

### SelfTest Problem

Rewrite the `MinMax` class shown earlier in this chapter so that it uses a for-­each style `for` loop.

### SelfTest Solution

#### Programs:

[JBG_HS_Ch05_SelfTest_13.java](./JBG_HS_Ch05_SelfTest_13.java)

#### Execution Logs

```
min and max: -978 100123
```

---

## SelfTest14

### SelfTest Problem

Can the `for` loops that perform sorting in the `Bubble` class shown in `Try This 5­-1` be converted into for-­each style loops? If not, why not?

### SelfTest Solution

No, the `for` loops in the `Bubble` class that perform the sort cannot be converted into for­each style loops. In the case of the outer loop, the current value of its loop counter is needed by the inner loop. In the case of the inner loop, out-­of-­order values must be exchanged, which implies assignments. Assignments to the underlying array cannot take place when using a for­each style loop.

---

## SelfTest15

### SelfTest Problem

Can a `String` control a `switch` statement?

### SelfTest Solution

Yes.

---

## SelfTest16

### SelfTest Problem

What type name is reserved for use with local variable type inference?

### SelfTest Solution

`var`.

---

## SelfTest17

### SelfTest Problem

Show how to use local variable type inference to declare a `boolean` variable called `done` that has an initial value of `false`.

### SelfTest Solution

```java
var done = false;
```

---

## SelfTest18

### SelfTest Problem

Can `var` be the name of a variable? Can `var` be the name of a class?

### SelfTest Solution

Yes, `var` can be the name of a variable. No, `var` cannot be the name of a class.

---

## SelfTest19

### SelfTest Problem

Is the following declaration valid? If not, why not.

```java
var[] argTemps = new double[7];
```

### SelfTest Solution

No, it is not valid because array brackets are not allowed after `var`. Remember, the complete type is inferred from the initializer.

---

## SelfTest20

### SelfTest Problem

Is the following declaration valid? If not, why not?

```java
var alpha = 10, beta = 20;
```

### SelfTest Solution

No, only one variable at a time can be declared when type inference is used.

---

## SelfTest21

### SelfTest Problem

In the `show()` method of the `ShowBits` class developed in `Try This 5­-3`, the local variable mask is declared as shown here:

```java
long mask = 1;
```

Change this declaration so that it uses local variable type inference. When doing so, be sure that `mask` is of type `long` (as it is here), and not of type `int`.

### SelfTest Solution

```java
var mask = 1L;
```

---


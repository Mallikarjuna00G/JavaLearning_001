# JBG_HS_Ch03
## SelfTest01

### SelfTest Problem

Write a program that reads characters from the keyboard until a period is received. Have the program count the number of spaces. Report the total at the end of the program.

### SelfTest Solution

#### Programs:

[JBG_HS_Ch03_SelfTest_01.java](./JBG_HS_Ch03_SelfTest_01.java)

#### Execution Logs

#### Log1

```
Enter a statement ending with a period 
to know the number of spaces in the statement: 
Huttidare kannada naadal huttabeku.
Number of spaces in your statement: 3
```

#### Log2

```
Enter a statement ending with a period 
to know the number of spaces in the statement: 
Ajanta Ellorana baalalli omme nodu. Baadaami Aiholeya chandana savidu node.          
Number of spaces in your statement: 4
```

---

## SelfTest02

### SelfTest Problem

Show the general form of the **if-­else-­if** ladder.

### SelfTest Solution

```
if(condition)
    statement;
else if(condition)
    statement;
else if(condition)
    statement;
    .
    .
    .
    .
else
    statement;
```

---

## SelfTest03

### SelfTest Problem

Given

```java
if(x < 10)
    if(y > 100) {
        if(!done) x = z;
        else y = z;
    }
else System.out.println("error");  // what if?
```

to what `if` does the last `else` associate?

### SelfTest Solution

The last `else` associates with the second `if` statement i.e., `if(y > 100)`. One level of indentation to the `else` statement might add more readability.

---

## SelfTest04

### SelfTest Problem

Show the `for` statement for a loop that counts from 1000 to 0 by –2.

### SelfTest Solution

```java
for(int i = 1000; i >= 0; i -= 2) {
    // ....
}
```

---

## SelfTest05

### SelfTest Problem

Is the following fragment valid?

```java
for(int i = 0; i < num; i++)
    sum += i;

count = i;
```

### SelfTest Solution

No. (Assuming `sum` and `count` are already declared and initialized). `i` is not visible at the statement `count = i;`.

---

## SelfTest06

### SelfTest Problem

Explain what `break` does. Be sure to explain both of its forms.

### SelfTest Solution

A `break` without a label causes termination of its immediately enclosing loop or `switch` statement.

A `break` with a label causes control to transfer to the end of the labeled block.

---

## SelfTest07

### SelfTest Problem

In the following fragment, after the `break` statement executes, what is displayed?

```java
for(i = 0; i < 10; i++) {
    while(running) {
        if(x < y) break;
            // ...
    }
    System.out.println("after while");
}
System.out.println("After for");
```

`after while` gets printed.

---

## SelfTest08

### SelfTest Problem

What does the following fragment print?

```java
for(int i = 0; i < 10; i++) {
    System.out.print(i + " ");
    if((i % 2) == 0) continue;
    System.out.println();
}
```

### SelfTest Solution

```
0 1 
2 3 
4 5 
6 7 
8 9 
```

---

## SelfTest09

### SelfTest Problem

The iteration expression in a `for` loop need not always alter the loop control variable by a fixed amount. Instead, the loop control variable can change in any arbitrary way. Using this concept, write a program that uses a `for` loop to generate and display the progression 1, 2, 4, 8, 16, 32, and so on.

### SelfTest Solution

#### Programs:

[JBG_HS_Ch03_SelfTest_02.java](./JBG_HS_Ch03_SelfTest_02.java)

Note: Loop iterates only for 100 times.

#### Execution Logs

```
1 2 4 8 16 32 64
```

---

## SelfTest10

### SelfTest Problem

The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to convert a lowercase letter to uppercase, subtract 32 from it. Use this information to write a program that reads characters from the keyboard. Have it convert all lowercase letters to uppercase, and all uppercase letters to lowercase, displaying the result. Make no changes to any other character. Have the program stop when the user enters a period. At the end, have the program display the number of case changes that have taken place.

### SelfTest Solution

#### Programs:

[JBG_HS_Ch03_SelfTest_10.java](./JBG_HS_Ch03_SelfTest_10.java)

#### Execution Logs

#### Log1

```
Enter characters to change the case of the letters (put a period at the end): 
Tangaaliyalli naanu teli bande, Ninnannu preethiyinda seralende.
tANGAALIYALLI NAANU TELI BANDE, nINNANNU PREETHIYINDA SERALENDE
Number of case changes: 56
```

#### Log2

```
Enter characters to change the case of the letters (put a period at the end): 
Ethake heege aleyuthaliruve, Yaaranu heege hudukuthaliruve? Nannannu seralu ba ba.
eTHAKE HEEGE ALEYUTHALIRUVE, yAARANU HEEGE HUDUKUTHALIRUVE? nANNANNU SERALU BA BA
Number of case changes: 70
```

---

## SelfTest11

### SelfTest Problem

What is an infinite loop?

### SelfTest Solution

An infinite loop is a loop that runs indefinitely.

---

## SelfTest12

### SelfTest Problem

When using `break` with a label, must the label be on a block that contains the `break`?

### SelfTest Solution

Yes.

---


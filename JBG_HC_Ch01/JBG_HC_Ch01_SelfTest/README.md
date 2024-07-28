# JBG_HC_Ch01
## SelfTest01

### SelfTest Problem

What is bytecode and why is it important to Java’s use for Internet programming?

### SelfTest Solution

Portability is a major aspect of the Internet because there are many different types of computers and operating systems connected to it. If a Java program were to be run on virtually any computer connected to the Internet, there needed to be some way to enable that program to execute on different types of systems. It is not practical to have
different versions of the same application for different computers.

The key that allowed Java to address both the security and the portability problems just described is that the output of a Java compiler is not executable code. Rather, it is
bytecode. *Bytecode* is a highly optimized set of instructions designed to be executed by what is called the Java Virtual Machine (JVM), which is part of the Java RuntimeEnvironment (JRE).

Translating a Java program into bytecode makes it much easier to run a program in a wide variety of environments because only the JRE (which includes the JVM) needs to be implemented for each platform.

---
## SelfTest02

### SelfTest Problem

What are the three main principles of object­oriented programming?

### SelfTest Solution

**1. Encapsulation:** *Encapsulation* is a programming mechanism that binds together code and the data it manipulates, and that keeps both safe from outside interference and misuse.

**1. Polymorphism:** *Polymorphism* (from Greek, meaning "many forms") is the quality that allows one interface to access a general class of actions. The specific action is determined by the exact nature of the situation.

**1. Inheritance:** *Inheritance* is the process by which one object can acquire the properties of another object.

---
## SelfTest03

### SelfTest Problem

Where do Java programs begin execution?

### SelfTest Solution

In general, java programs begin execution by calling `main()`.

---
## SelfTest04

### SelfTest Problem

What is a variable?

### SelfTest Solution

A *variable* is a named memory location that can be assigned a value. Further, the value of a variable can be changed during the execution of a program. That is, the content of a variable is changeable, not fixed.

---
## SelfTest05

### SelfTest Problem

Which of the following variable names is invalid?

A. `count`  
B. `$count`  
C. `count27`  
D. `67count`  

### SelfTest Solution

**D. `67count`** is invalid. We can't start an identifier with a digit.

---
## SelfTest06

### SelfTest Problem

How do you create a single­-line comment? How do you create a multi-line comment?

### SelfTest Solution

A single­line comment begins with `//` and ends at the end of the line. A multiline comment begins with `/*` and ends with `*/`.

---
## SelfTest07

### SelfTest Problem

Show the general form of the `if` statement. Show the general form of the `for` loop.

### SelfTest Solution

**General form of `if`:**

a. For single statement body.  

```
if(condition) statement;
```

b. For multi-statement body.  

```
if(condition) {
    statement1;
    statement2;
}
```

**General form of `for`:**

a. For single statement body.  

```
for(initialization; condition; iteration) statement;
```

b. For multi-statement body.  

```
for(initialization; condition; iteration) {
    statement1;
    statement2;
}
```

---
## SelfTest08

### SelfTest Problem

How do you create a block of code?

### SelfTest Solution

A block of code is started with a `{` and ended with a `}`.

---
## SelfTest09

### SelfTest Problem

The moon’s gravity is about 17 percent that of earth’s. Write a program that computes your effective weight on the moon.

### SelfTest Solution

#### Programs:

[JBG_HC_Ch01_SelfTest_08.java](./JBG_HC_Ch01_SelfTest_08.java)

#### Execution Logs

```
Your weight on earth which is 63.2Kgs is equal to 10.744000000000002Kgs on the moon.
```

---
## SelfTest10

### SelfTest Problem

Adapt [`Try This 1­-2`](../JBG_HC_Ch01_Exmp/GalToLitTable.java) so that it prints a conversion table of inches to meters. Display 12 feet of conversions, inch by inch. Output a blank line every 12 inches. (One meter equals approximately 39.37 inches.)

### SelfTest Solution

#### Programs:

[JBG_HC_Ch01_SelfTest_10.java](./JBG_HC_Ch01_SelfTest_10.java)

#### Execution Logs

```
1.0 inches is 0.025400050800101603 meters.
2.0 inches is 0.05080010160020321 meters.
3.0 inches is 0.07620015240030481 meters.
4.0 inches is 0.10160020320040641 meters.
5.0 inches is 0.12700025400050802 meters.
6.0 inches is 0.15240030480060962 meters.
7.0 inches is 0.17780035560071122 meters.
8.0 inches is 0.20320040640081283 meters.
9.0 inches is 0.2286004572009144 meters.
10.0 inches is 0.25400050800101603 meters.
11.0 inches is 0.27940055880111764 meters.
12.0 inches is 0.30480060960121924 meters.

13.0 inches is 0.33020066040132084 meters.
14.0 inches is 0.35560071120142245 meters.
15.0 inches is 0.38100076200152405 meters.
16.0 inches is 0.40640081280162565 meters.
17.0 inches is 0.43180086360172726 meters.
18.0 inches is 0.4572009144018288 meters.
19.0 inches is 0.4826009652019304 meters.
20.0 inches is 0.5080010160020321 meters.
21.0 inches is 0.5334010668021336 meters.
22.0 inches is 0.5588011176022353 meters.
23.0 inches is 0.5842011684023368 meters.
24.0 inches is 0.6096012192024385 meters.

25.0 inches is 0.63500127000254 meters.
26.0 inches is 0.6604013208026417 meters.
27.0 inches is 0.6858013716027432 meters.
28.0 inches is 0.7112014224028449 meters.
29.0 inches is 0.7366014732029464 meters.
30.0 inches is 0.7620015240030481 meters.
31.0 inches is 0.7874015748031497 meters.
32.0 inches is 0.8128016256032513 meters.
33.0 inches is 0.8382016764033529 meters.
34.0 inches is 0.8636017272034545 meters.
35.0 inches is 0.8890017780035561 meters.
36.0 inches is 0.9144018288036576 meters.

37.0 inches is 0.9398018796037593 meters.
38.0 inches is 0.9652019304038608 meters.
39.0 inches is 0.9906019812039625 meters.
40.0 inches is 1.0160020320040641 meters.
41.0 inches is 1.0414020828041657 meters.
42.0 inches is 1.0668021336042672 meters.
43.0 inches is 1.0922021844043688 meters.
44.0 inches is 1.1176022352044706 meters.
45.0 inches is 1.143002286004572 meters.
46.0 inches is 1.1684023368046736 meters.
47.0 inches is 1.1938023876047752 meters.
48.0 inches is 1.219202438404877 meters.

49.0 inches is 1.2446024892049785 meters.
50.0 inches is 1.27000254000508 meters.
51.0 inches is 1.2954025908051816 meters.
52.0 inches is 1.3208026416052834 meters.
53.0 inches is 1.346202692405385 meters.
54.0 inches is 1.3716027432054865 meters.
55.0 inches is 1.397002794005588 meters.
56.0 inches is 1.4224028448056898 meters.
57.0 inches is 1.4478028956057913 meters.
58.0 inches is 1.4732029464058929 meters.
59.0 inches is 1.4986029972059944 meters.
60.0 inches is 1.5240030480060962 meters.

61.0 inches is 1.5494030988061978 meters.
62.0 inches is 1.5748031496062993 meters.
63.0 inches is 1.6002032004064008 meters.
64.0 inches is 1.6256032512065026 meters.
65.0 inches is 1.6510033020066042 meters.
66.0 inches is 1.6764033528067057 meters.
67.0 inches is 1.7018034036068073 meters.
68.0 inches is 1.727203454406909 meters.
69.0 inches is 1.7526035052070106 meters.
70.0 inches is 1.7780035560071121 meters.
71.0 inches is 1.8034036068072137 meters.
72.0 inches is 1.8288036576073152 meters.

73.0 inches is 1.854203708407417 meters.
74.0 inches is 1.8796037592075185 meters.
75.0 inches is 1.90500381000762 meters.
76.0 inches is 1.9304038608077216 meters.
77.0 inches is 1.9558039116078234 meters.
78.0 inches is 1.981203962407925 meters.
79.0 inches is 2.0066040132080265 meters.
80.0 inches is 2.0320040640081283 meters.
81.0 inches is 2.0574041148082296 meters.
82.0 inches is 2.0828041656083314 meters.
83.0 inches is 2.108204216408433 meters.
84.0 inches is 2.1336042672085345 meters.

85.0 inches is 2.1590043180086362 meters.
86.0 inches is 2.1844043688087376 meters.
87.0 inches is 2.2098044196088393 meters.
88.0 inches is 2.235204470408941 meters.
89.0 inches is 2.2606045212090424 meters.
90.0 inches is 2.286004572009144 meters.
91.0 inches is 2.311404622809246 meters.
92.0 inches is 2.3368046736093473 meters.
93.0 inches is 2.362204724409449 meters.
94.0 inches is 2.3876047752095504 meters.
95.0 inches is 2.413004826009652 meters.
96.0 inches is 2.438404876809754 meters.

97.0 inches is 2.4638049276098553 meters.
98.0 inches is 2.489204978409957 meters.
99.0 inches is 2.514605029210059 meters.
100.0 inches is 2.54000508001016 meters.
101.0 inches is 2.565405130810262 meters.
102.0 inches is 2.590805181610363 meters.
103.0 inches is 2.616205232410465 meters.
104.0 inches is 2.6416052832105668 meters.
105.0 inches is 2.667005334010668 meters.
106.0 inches is 2.69240538481077 meters.
107.0 inches is 2.717805435610871 meters.
108.0 inches is 2.743205486410973 meters.

109.0 inches is 2.7686055372110747 meters.
110.0 inches is 2.794005588011176 meters.
111.0 inches is 2.819405638811278 meters.
112.0 inches is 2.8448056896113796 meters.
113.0 inches is 2.870205740411481 meters.
114.0 inches is 2.8956057912115827 meters.
115.0 inches is 2.921005842011684 meters.
116.0 inches is 2.9464058928117858 meters.
117.0 inches is 2.9718059436118875 meters.
118.0 inches is 2.997205994411989 meters.
119.0 inches is 3.0226060452120906 meters.
120.0 inches is 3.0480060960121924 meters.

121.0 inches is 3.0734061468122937 meters.
122.0 inches is 3.0988061976123955 meters.
123.0 inches is 3.124206248412497 meters.
124.0 inches is 3.1496062992125986 meters.
125.0 inches is 3.1750063500127004 meters.
126.0 inches is 3.2004064008128017 meters.
127.0 inches is 3.2258064516129035 meters.
128.0 inches is 3.2512065024130052 meters.
129.0 inches is 3.2766065532131066 meters.
130.0 inches is 3.3020066040132083 meters.
131.0 inches is 3.3274066548133097 meters.
132.0 inches is 3.3528067056134114 meters.

133.0 inches is 3.378206756413513 meters.
134.0 inches is 3.4036068072136145 meters.
135.0 inches is 3.4290068580137163 meters.
136.0 inches is 3.454406908813818 meters.
137.0 inches is 3.4798069596139194 meters.
138.0 inches is 3.505207010414021 meters.
139.0 inches is 3.5306070612141225 meters.
140.0 inches is 3.5560071120142243 meters.
141.0 inches is 3.581407162814326 meters.
142.0 inches is 3.6068072136144274 meters.
143.0 inches is 3.632207264414529 meters.
144.0 inches is 3.6576073152146305 meters.

```

---
## SelfTest11

### SelfTest Problem

If you make a typing mistake when entering your program, what sort of error will result?

### SelfTest Solution

Will result in syntax error.

---
## SelfTest12

### SelfTest Problem

Does it matter where on a line you put a statement?

### SelfTest Solution

No. Java is a free­form language, meaning that it does not matter where you place statements relative to each other on a line.

---

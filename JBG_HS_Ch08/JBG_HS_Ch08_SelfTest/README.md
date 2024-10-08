# JBG_HS_Ch08_SelfTest

## SelfTest01

### SelfTest Problem

Using the code from *Try This 8-­1*, put the `ICharQ` interface and its three implementations into a package called `qpack`. Keeping the queue demonstration class `IQDemo` in the default package, show how to import and use the classes in `qpack`.

### SelfTest Solution

- `IQDemo.java` now only contains `IQDemo` class.
- `IQDemo.java` now imports the package `qpack` (i.e., `import qpack.*`).
- All the implementations of `ICharQ` had to be maintained in separate files under `qpack` package since their classes' access modifier's had to be `public`.
- All the source files under `qpack` are now specified with `package` statement (i.e., `package qpack`).

#### Programs:

- [`IQDemo.java`](IQDemo.java)
- [`qpack/CircDynQueue.java`](qpack/CircDynQueue.java)
- [`qpack/CircularQueue.java`](qpack/CircularQueue.java)
- [`qpack/DynQueue.java`](qpack/DynQueue.java)
- [`qpack/FixedQueue.java`](qpack/FixedQueue.java)
- [`qpack/ICharQ.java`](qpack/ICharQ.java)

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

## SelfTest02

### SelfTest Problem

What is a namespace? Why is it important that Java allows you to partition the namespace?

### SelfTest Solution

A namespace is a declarative region. By partitioning the namespace, you can prevent name collisions.

---
---

## SelfTest03

### SelfTest Problem

Typically, packages are stored in ______________.

### SelfTest Solution

directories.

---
---

## SelfTest04

### SelfTest Problem

Explain the difference between `protected` and default access.

### SelfTest Solution

A memeber with `protected` access can be used within its package and by a subclass in other packages.

A member with default access can be used only within its package.

---
---

## SelfTest05

### SelfTest Problem

Explain the two ways that the members of a package can be used by other packages.

### SelfTest Solution

To use a member of a package, you can either fully qualify its name, or you can import it using `import`.

---
---

## SelfTest06

### SelfTest Problem

"One interface, multiple methods" is a key tenet of Java. What feature best exemplifies it?

### SelfTest Solution

The `interface` best exemplifies the one interface, multiple methods principle of OOP.

---
---

## SelfTest07

### SelfTest Problem

How many classes can implement an interface? How many interfaces can a class implement?

### SelfTest Solution

An interface can be implemented by an unlimited number of classes. A class can implement as many interfaces as it chooses.

---
---

## SelfTest08

### SelfTest Problem

Can interfaces be extended?

### SelfTest Solution

Yes.

---
---

## SelfTest09

### SelfTest Problem

Create an interface for the `Vehicle` class from Chapter 7. Call the interface `IVehicle`.

### SelfTest Solution

```java
interface IVehicle {
    // Return the range
    int range();

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles);

    // Access methods for instance variables.
    int getPassengers();
    void setPassengers(int passengers);
    int getFuelCap();
    void setFuelCap(int fuelCap);
    int getMpg();
    void setMpg(int mpg);
}
```

---
---

## SelfTest10

### SelfTest Problem

Variables declared in an interface are implicitly `static` and `final`. Can they be shared with other parts of a program?

### SelfTest Solution

Yes, interface variables can be used as named constants that are shared by all files in a program. They are brought into view by importing their interface.

---
---

## SelfTest11

### SelfTest Problem

A package is, in essence, a container for classes. True or False?

### SelfTest Solution

True.

---
---

## SelfTest12

### SelfTest Problem

What standard Java package is automatically imported into a program?

### SelfTest Solution

`java.lang`

---
---

## SelfTest13

### SelfTest Problem

What keyword is used to declare a default interface method?

### SelfTest Solution

`default`.

---
---

## SelfTest14

### SelfTest Problem

Beginning with JDK 8, is it possible to define a `static` method in an `interface`?

### SelfTest Solution

Yes.

---
---

## SelfTest15

### SelfTest Problem

Assume that the `ICharQ` interface shown in *Try This 8­-1* has been in widespread use for several years. Now, you want to add a method to it called `reset()`, which will be used to reset the queue to its empty, starting condition. Assuming JDK 8 or later, how can this be accomplished without breaking preexisting code?

### SelfTest Solution

To avoid breaking preexisting code, you must use a default interface method. Because you can't know how to reset each queue implementation, the default `reset()` implementation will need to report an error that indicates that it is not implemented. (The best way to do this is to use an exception. Exceptions are examined in the following chapter.) Fortunately, since no pre-existing code assumes that `ICharQ` defines a `reset()` method, no pre-existing code will encounter that error, and no pre-existing code will be broken.

---
---

## SelfTest16

### SelfTest Problem

How is a `static` method in an interface called?

### SelfTest Solution

A `static` interface method is called through its interface name, by use of the dot operator.

---
---

## SelfTest17

### SelfTest Problem

Can an `interface` have a `private` method?

### SelfTest Solution

Beginning with JDK 9, the answer is Yes.

---
---


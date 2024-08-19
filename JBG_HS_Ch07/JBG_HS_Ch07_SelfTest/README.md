# JBG_HS_Ch07_SelfTest

## SelfTest01

### SelfTest Problem

Does a superclass have access to the members of a subclass? Does a subclass have access to the members of a superclass?

### SelfTest Solution

No, a superclass has no knowledge of its subclasses. Yes, a subclass has access to all non-private members of its superclass.

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

```java
/*
 * Purpose: A subclass of TwoDShape for circles.
 */
class Circle extends TwoDShape {
    /*==================== START: FIELDS ====================*/
    private final double PI = 3.1416;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /*
     * Purpose: A default constructor.
     */
    public Circle() {
        super();
    } // Constructor 

    /*
     * Purpose: Constructor for Circle.
     */
    public Circle(double radius) {
        super(radius, "circle");
    } // Constructor 

    /*
     * Purpose: Construct object from an object
     */
    public Circle(Circle ob) {
        super(ob);  // pass object to TwoDShape constructor
    } // Constructor 
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: Override area() for Circle
     */
    public double area() {
        return PI * getWidth() * getHeight();  // A = PI * r * r
    } // method area
    /*==================== END: METHODS ====================*/
} // class Circle
```

---
---

## SelfTest03

### SelfTest Problem

How do you prevent a subclass from having access to a member of a superclass?

### SelfTest Solution

To prevent a subclass from having access to a superclass member, declare that member as `private`.

---
---

## SelfTest04

### SelfTest Problem

Describe the purpose and use of the two versions of `super` described in this chapter.

### SelfTest Solution

The `super` keyword has two forms. The first is used to call a superclass constructor. The general form of this usage is

```
super(param­-list);
```

The second form of `super` is used to access a superclass member. It has this general form:

```
super.member
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

Constructors complete their execution in order of derivation. Thus, when a `Gamma` object is created, the order is `Alpha`, `Beta`, `Gamma`.

---
---

## SelfTest06

### SelfTest Problem

A superclass reference can refer to a subclass object. Explain why this is important as it relates to method overriding.

### SelfTest Solution

When an overridden method is called through a superclass reference, it is the type of the object being referred to that determines which version of the method is called.

---
---

## SelfTest07

### SelfTest Problem

What is an abstract class?

### SelfTest Solution

An abstract class contains at least one abstract method.

---
---

## SelfTest08

### SelfTest Problem

How do you prevent a method from being overridden? How do you prevent a class from being inherited?

### SelfTest Solution

To prevent a method from being overridden, declare it as `final`. To prevent a class from being inherited, declare it as `final`.

---
---

## SelfTest09

### SelfTest Problem

Explain how *inheritance*, *method overriding*, and *abstract* classes are used to support *polymorphism*.

### SelfTest Solution

*Inheritance*, *method overriding*, and *abstract classes* support *polymorphism* by enabling you to create a generalized class structure that can be implemented by a variety of classes. Thus, the abstract class defines a consistent interface that is shared by all implementing classes. This embodies the concept of "one interface, multiple methods."

---
---

## SelfTest10

### SelfTest Problem

What class is a superclass of every other class?

### SelfTest Solution

The `Object` class.

---
---

## SelfTest11

### SelfTest Problem

A class that contains at least one abstract method must, itself, be declared abstract. True or False?

### SelfTest Solution

True.

---
---

## SelfTest12

### SelfTest Problem

What keyword is used to create a named constant?

### SelfTest Solution

`final`.

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

Even though a `B` object is created, the type of `myRef` will be `A` because that is the declared return type of `makeObj()`. When using local variable type inference, the inferred type of a variable is based on the declared type of its initializer. Therefore, if the initializer is of a superclass type (which is `A` in this case), that will be the type of the variable. It does not matter if the actual object being referred to by the initializer is an instance of a derived class.

---
---

## SelfTest14

### SelfTest Problem

Assuming the situation described in Question 13, what will the type of `myRef` be given this statement?

```java
var myRef = (B) makeObj(1);
```

### SelfTest Solution

In this case, the cast to `B` specifies the type of the initializer, and `myRef` is of type `B`.

---
---


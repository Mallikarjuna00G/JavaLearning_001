/**
 * File: OrderOfConstruction.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate when constructors are executed.
 * 
 */

/*
 * Purpose: Create a super class
 */
class A {
    /*
     * Purpose: 
     */
    public A() {
        System.out.println("Constructing A.");
    } // Constructor 
} // class A

/*
 * Purpose: Create a subclass by extending class A.
 */
class B extends A {
    /*
     * Purpose: 
     */
    public B() {
        System.out.println("Constructing B.");
    } // Constructor 
} // class B

/*
 * Purpose: Create a subclass by extending class B.
 */
class C extends B {
    /*
     * Purpose: 
     */
    public C() {
        System.out.println("Constructing C.");
    } // Constructor 
} // class C

/*
 * Purpose: 
 */
class OrderOfConstruction {
    public static void main(String[] args) {
        var c = new C();
    }  // main(String[])
}  // class OrderOfConstruction
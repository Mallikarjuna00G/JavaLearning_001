/**
 * File: IFExtend.java
 * @author Mallikarjuna00G
 * Purpose: Interfaces can be extended.
 * 
 */

/**
 * Purpose: One interface can extend another.
 */
interface A {
    void meth1();
    void meth2();
}  // interface A

/**
 * Purpose: B now includes meth1() and meth2() - it adds meth3().
 */
interface B extends A{
    void meth3();
}  // interface B 

/**
 * Purpose: This class must implement all of A and B.
 */
class MyClass implements B {
    /*==================== START: FIELDS ====================*/
    
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /**
     * Purpose: 
     */
    public void meth1() {
        System.out.println("Implement meth1().");
    }  // method meth1

    /**
     * Purpose: 
     */
    public void meth2() {
        System.out.println("Implement meth2().");
    }  // method meth2

    /**
     * Purpose: 
     */
    public void meth3() {
        System.out.println("Implement meth3().");
    }  // method meth3
    /*==================== END: METHODS ====================*/
}  // class MyClass

/**
 * Purpose: 
 */
class IFExtend {
    public static void main(String[] args) {
        var ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }  // main(String[])
}  // class IFExtend
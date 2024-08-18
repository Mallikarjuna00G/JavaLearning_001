/**
 * File: UseSuper.java
 * @author Mallikarjuna00G
 * Purpose: Using super to overcome hiding.
 * 
 */
/*
 * Purpose: A super class
 */
class A {
    int i;
} // class A

/*
 * Purpose: Create a subclass by extending class A.
 */
class B extends A {
    int i;  // this i hides the i in A

    /*
     * Purpose: 
     */
    public B(int a, int b) {
        super.i = a;  // i in A
        i = b;  // i in B
    } // Constructor 

    /*
     * Purpose: Display the i values from the superclass and this class.
     */
    public void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in this (subclass): " + i);
    } // method show
} // class B

/*
 * Purpose: 
 */
class UseSuper {
    public static void main(String[] args) {
        var subOb = new B(1, 2);

        subOb.show();
    }  // main(String[])
}  // class UseSuper
/**
 * File: OverloadConsDemo.java
 * 
 * Purpose: Demonstrate an overloaded constructor.
 * 
 */
/*
 * Purpose: 
 */
class MyClass {
    int x;

    /*
     * Purpose: Constructor with no parameters
     */
    public MyClass() {
        System.out.println("Inside MyClass().");
    } // Constructor 

    /*
     * Purpose: Constructor with one parameter
     */
    public MyClass(int i) {
        System.out.println("Inside MyClass(int).");
        x = i;
    } // Constructor 

    /*
     * Purpose: Constructor with one double parameter
     */
    public MyClass(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    } // Constructor 

    /*
     * Purpose: Constructor with two parameters
     */
    public MyClass(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    } // Constructor 
} // class MyClass

/*
 * Purpose: 
 */
class OverloadConsDemo {
    public static void main(String[] args) {
        var t1 = new MyClass();
        var t2 = new MyClass(88);
        var t3 = new MyClass(17.23);
        var t4 = new MyClass(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }  // main(String[])
}  // class OverloadConsDemo
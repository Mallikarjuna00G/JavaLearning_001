/**
 * File: ParmConsDemo.java
 * 
 * Purpose: A parameterized constructor.
 * 
 */
class MyClass {
    int x;

    MyClass(int i) {
        x = i;
    }  // constructor: no parameters

} // class MyClass

class ParmConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }  // main(String[])
}  // class ParmConsDemo
/**
 * File: ConsDemo.java
 * 
 * Purpose: A simple constructor.
 * 
 */
class MyClass {
    int x;

    MyClass() {
        x = 10;
    }  // constructor: no parameters

} // class MyClass

class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }  // main(String[])
}  // class ConsDemo
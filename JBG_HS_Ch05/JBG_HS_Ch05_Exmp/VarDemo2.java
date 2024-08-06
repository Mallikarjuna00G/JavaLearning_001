/**
 * File: VarDemo2.java
 * 
 * Purpose: Local variable type inference with a user-defined class type.
 * 
 */
class MyClass {
    private int i;
    
    MyClass(int k) {i = k;}  // Constructor

    int geti() {return i;}
    void seti(int k) {if(k >= 0) i = k;}
} // class MyClass

class VarDemo2 {
    public static void main(String[] args) {
        var mc = new MyClass(10);  // Notice the use of var here.

        System.out.println("Value of i in mc is " + mc.geti());
        mc.seti(19);
        System.out.println("Value of i in mc is now " + mc.geti());
    }  // main(String[])
}  // class VarDemo2
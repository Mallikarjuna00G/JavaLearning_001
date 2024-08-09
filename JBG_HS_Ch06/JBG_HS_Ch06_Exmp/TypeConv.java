/**
 * File: TypeConv.java
 * 
 * Purpose: Automatic type conversions can affect 
 * overloaded method resolution.
 * 
 */
/*
 * Purpose: 
 */
class Overload2 {
    /*
     * Purpose: 
     */
    public void f(int x) {
        System.out.println("Inside f(int): " + x);
    } // method f

    /*
     * Purpose: 
     */
    public void f(double x) {
        System.out.println("Inside f(double): " + x);
    } // method f
} // class Overload2

/*
 * Purpose: 
 */
class TypeConv {
    public static void main(String[] args) {
        var ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5f;

        ob.f(i);  // Calls ob.f(int)
        ob.f(d);  // Calls ob.f(double)

        ob.f(b);  // Calls ob.f(int) - type conversion
        ob.f(s);  // Calls ob.f(int) - type conversion
        ob.f(f);  // Calls ob.f(double) - type conversion
    }  // main(String[])
}  // class TypeConv
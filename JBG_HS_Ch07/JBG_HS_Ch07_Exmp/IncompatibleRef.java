/**
 * File: IncompatibleRef.java
 * @author Mallikarjuna00G
 * Purpose: A reference variable of one class type
 * cannot normally refer to an object of another class
 * type.
 * 
 * This will not compile.
 */
/*
 * Purpose: 
 */
class X {
    int a;

    /*
     * Purpose: 
     */
    public X(int i) {
        a = i;
    } // Constructor 
} // class X

/*
 * Purpose: 
 */
class Y {
    int a;

    /*
     * Purpose: 
     */
    public Y(int i) {
        a = i;
    } // Constructor 
} // class Y

/*
 * Purpose: 
 */
class IncompatibleRef {
    public static void main(String[] args) {
        var x = new X(10);
        X x2;
        var y = new Y(5);

        x2 = x;  // OK, both are of same type
        x2 = y;  // Error, not of same type
    }  // main(String[])
}  // class IncompatibleRef
/**
 * File: SupSubRef.java
 * @author Mallikarjuna00G
 * Purpose: A superclass reference can refer to a subclass object.
 * 
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
class Y extends X {
    int b;

    /*
     * Purpose: 
     */
    public Y(int i, int j) {
        super(j);
        b = i;
    } // Constructor 
} // class Y

/*
 * Purpose: 
 */
class SupSubRef {
    public static void main(String[] args) {
        var x = new X(10);
        X x2;
        var y = new Y(5, 6);

        x2 = x;  // OK, both are of same type
        System.out.println("x2.a is " + x2.a);

        x2 = y;  // Still OK, because Y is derived from X.
        System.out.println("\nx2.a is " + x2.a);

        // X references know only about X members
        x2.a = 19;  // OK
        // x2.b = 27;  // Error, x doesn't have a b member.
    }  // main(String[])
}  // class SupSubRef
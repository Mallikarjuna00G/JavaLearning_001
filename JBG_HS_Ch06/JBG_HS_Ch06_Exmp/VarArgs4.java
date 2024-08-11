/**
 * File: VarArgs4.java
 * 
 * Purpose: Varargs, Overloading, and ambiguity.
 * 
 */
/*
 * Purpose: 
 */
class VarArgs4 {
    /*
     * Purpose: 
     */
    public static void vaTest(int ... v) {
        System.out.println("vaTest(int ...): " + "Number of args: " + v.length);
        System.out.println("Contents: ");

        for(var i = 0; i < v.length; i++) {
            System.out.println("  arg " + i + ": " + v[i]);
        }  // for loop: 
        System.out.println();
    } // method vaTest

    /*
     * Purpose: 
     */
    public static void vaTest(boolean ... v) {
        System.out.println("vaTest(boolean ...): " + "Number of args: " + v.length);
        System.out.println("Contents: ");

        for(var i = 0; i < v.length; i++) {
            System.out.println("  arg " + i + ": " + v[i]);
        }  // for loop: 
        System.out.println();
    } // method vaTest

    public static void main(String[] args) {
        vaTest(1, 2, 3);  // OK
        vaTest(true, false, false);  // OK
        vaTest();  // Error: ambiguous!
    }  // main(String[])
}  // class VarArgs4
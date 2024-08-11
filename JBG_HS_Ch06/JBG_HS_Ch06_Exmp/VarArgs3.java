/**
 * File: VarArgs3.java
 * 
 * Purpose: Varargs and Overloading.
 * 
 */
/*
 * Purpose: 
 */
class VarArgs3 {
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

    /*
     * Purpose: 
     */
    public static void vaTest(String msg, int ... v) {
        System.out.println("vaTest(String, int ...): " + msg + v.length);
        System.out.println("Contents: ");

        for(var i = 0; i < v.length; i++) {
            System.out.println("  arg " + i + ": " + v[i]);
        }  // for loop: 
        System.out.println();
    } // method vaTest

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Testing", 10, 20);
        vaTest(true, false, false);
    }  // main(String[])
}  // class VarArgs3
/**
 * File: VarArgs.java
 * 
 * Purpose: Demonstrate variable-length arguments.
 * 
 */
/*
 * Purpose: 
 */
class VarArgs {
    /*
     * Purpose: vaTest() uses a vararg.
     */
    public static void vaTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for(var i = 0; i < v.length; i++) {
            System.out.println("  arg " + i + ": " + v[i]);
        }  // for loop: 
        System.out.println();
    } // method vaTest

    public static void main(String[] args) {
        // Notice how vaTest() can be called
        // with a variable number of arguments.
        vaTest(10);  // 1 arg
        vaTest(1, 2, 3);  // 3 args
        vaTest();  // No args
    }  // main(String[])
}  // class VarArgs
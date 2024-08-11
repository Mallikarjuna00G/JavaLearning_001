/**
 * File: VarArgs2.java
 * 
 * Purpose: Use varargs with standard arguments.
 * 
 */
/*
 * Purpose: 
 */
class VarArgs2 {
    /*
     * Purpose: Here, msg is a normal paramter,
     * v is a varargs parameter.
     */
    public static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for(var i = 0; i < v.length; i++) {
            System.out.println("  arg " + i + ": " + v[i]);
        }  // for loop: 
        System.out.println();
    } // method vaTest

    public static void main(String[] args) {
        // Notice how vaTest() can be called
        // with a variable number of arguments.
        vaTest("One vararg: ", 10);  // 1 arg
        vaTest("Three varargs: ", 1, 2, 3);  // 3 args
        vaTest("No varargs: ");  // No args
    }  // main(String[])
}  // class VarArgs2
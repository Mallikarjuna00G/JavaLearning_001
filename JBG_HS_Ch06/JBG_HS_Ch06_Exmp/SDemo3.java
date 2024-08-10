/**
 * File: SDemo3.java
 * 
 * Purpose: Use a static block.
 * 
 */
/*
 * Purpose: 
 */
class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    /*
     * Purpose: 
     */
    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }  // Static Block

    /*
     * Purpose: 
     */
    public StaticBlock(String msg) {
        System.out.println(msg);
    } // Constructor 
} // class StaticBlock

/*
 * Purpose: 
 */
class SDemo3 {
    public static void main(String[] args) {
        var ob = new StaticBlock("Inside Constructor");

        System.out.println("Square root of 2 is " + StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " + StaticBlock.rootOf3);
    }  // main(String[])
}  // class SDemo3
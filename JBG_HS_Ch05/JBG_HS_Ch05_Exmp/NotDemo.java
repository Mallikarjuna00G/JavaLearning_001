/**
 * File: NotDemo.java
 * 
 * Purpose: Demonstrate the bitwise NOT.
 * 
 */
class NotDemo {
    public static void main(String[] args) {
        byte b = -34;
        for(var t = 128; t > 0; t = t / 2) {
            if((b & t) != 0) {
                // if: 
                System.out.print("1 ");
            } else {
                // else: 
                System.out.print("0 ");
            }  // if-else statement: 
        }  // for loop: 
        System.out.println();

        // reverse all bits
        b = (byte) ~b;
        for(var t = 128; t > 0; t = t / 2) {
            if((b & t) != 0) {
                // if: 
                System.out.print("1 ");
            } else {
                // else: 
                System.out.print("0 ");
            }  // if-else statement: 
        }  // for loop: 
        System.out.println();
    }  // main(String[])
}  // class NotDemo
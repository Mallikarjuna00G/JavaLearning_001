/**
 * File: ShiftDemo.java
 * 
 * Purpose: Demonstrate the shift << and >> operators.
 * 
 */
class ShiftDemo {
    public static void main(String[] args) {
        var val = 1;

        for(var i = 0; i < 8; i++) {
            for(var t = 128; t > 0; t = t / 2) {
                if((val & t) != 0) {
                    // if: 
                    System.out.print("1 ");
                } else {
                    // else: 
                    System.out.print("0 ");
                }  // if-else statement: 
            }  // for loop: 
            System.out.println();
            val = val << 1;  // left shift
        }  // for loop: 
        System.out.println();

        val = 128;
        for(var i = 0; i < 8; i++) {
            for(var t = 128; t > 0; t /= 2) {
                if((val & t) != 0) {
                    // if: 
                    System.out.print("1 ");
                } else {
                    // else: 
                    System.out.print("0 ");
                }  // if-else statement: 
            }  // for loop: 
            System.out.println();
            val = val >> 1;  // right shift
        }  // for loop: 
    }  // main(String[])
}  // class ShiftDemo
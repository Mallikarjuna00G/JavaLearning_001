/**
 * File: ShowBits.java
 * 
 * Purpose: Display the bits within a byte.
 * 
 */
class ShowBits {
    public static void main(String[] args) {
        var val = (byte) 123;

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
    }  // main(String[])
}  // class ShowBits
/**
 * File: NonZeroDiv2.java
 * 
 * Purpose: Prevent a division by zero using the ? (optimized).
 * 
 */
class NonZeroDiv2 {
    public static void main(String[] args) {
        for(var i = -5; i < 6; i++) {
            if((i != 0) ? (true):(false)) {
                System.out.println("100 / " + i + " is " + 100 / i);
            }  // if statement: 
        }  // for loop: 
    }  // main(String[])
}  // class NonZeroDiv2
/**
 * File: NonZeroDiv.java
 * 
 * Purpose: Prevent a division by zero using the ?.
 * 
 */
class NonZeroDiv {
    public static void main(String[] args) {
        int result;

        for(var i = -5; i < 6; i++) {
            result = (i != 0) ? (100 / i):(0);
            if(i != 0) {
                System.out.println("100 / " + i + " is " + result);
            }  // if statement: 
        }  // for loop: 
    }  // main(String[])
}  // class NonZeroDiv
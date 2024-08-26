/**
 * File: MultiCatch.java
 * @author Mallikarjuna00G
 * Purpose: Use multi-catch feature. Note: This code requires JDK 7 or
 * later to compile.
 */
/**
 * Purpose: 
 */
class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char[] chrs = {'A', 'B', 'C'};

        for(var i = 0; i < 2; i++) {
            try {
                /*
                 *Purpose: 
                 */
                if(i == 0) {
                    // if: 
                    result = a / b;  // generate an ArithmeticException
                } else {
                    // else: 
                    chrs[5] = 'X';  // Generate an ArrayIndexOutOfBoundsException.
                }  // if-else statement: 
            }  // try statement
            catch(ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                /*
                 *Purpose: This catch clause catches both exceptions.
                 */
                System.out.println("Exception caught: " + exc);
            }  // catch exception type ArithmeticException | ArrayIndexOutOfBoundsException
        }  // for loop: 

        System.out.println("After multi-catch.");
    }  // main(String[])
}  // class MultiCatch
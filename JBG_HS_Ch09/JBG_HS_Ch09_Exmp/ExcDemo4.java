/**
 * File: ExcDemo4.java
 * @author Mallikarjuna00G
 * Purpose: Use multiple catch statements.
 */
/**
 * Purpose: 
 */
class ExcDemo4 {
    public static void main(String[] args) {
        // Here, numer is longer than denom.
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for(var i = 0; i < numer.length; i++) {
            try {
                /*
                 *Purpose: 
                 */
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
            }  // try statement
            catch(ArithmeticException exc) {
                /*
                 *Purpose: Catch the divide-by-zero exception.
                 */
                System.out.println("Can't divide by zero!");
            }  // catch exception type ArithmeticException
            catch(ArrayIndexOutOfBoundsException exc) {
                /*
                 *Purpose: Catch the array index out-of-bounds exception
                 */
                System.out.println("No matching element found.");
            }  // catch exception type ArrayIndexOutOfBoundsException
        }  // for loop: 
    }  // main(String[])
}  // class ExcDemo4
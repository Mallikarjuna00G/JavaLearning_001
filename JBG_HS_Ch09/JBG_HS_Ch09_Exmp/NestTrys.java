/**
 * File: NestTrys.java
 * @author Mallikarjuna00G
 * Purpose: Use a nested try block.
 */
/**
 * Purpose: 
 */
class NestTrys {
    public static void main(String[] args) {
        // Here, numer is longer than denom.
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        try {
            /*
             *Purpose: Outer try
             */
            for(var i = 0; i < numer.length; i++) {
                try {
                    /*
                 *Purpose: 
                 */
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
                }  // try statement
                catch(ArithmeticException exc) {
                    /*
                    *Purpose: Arithmetic exception: divide-by-zero
                    */
                    System.out.println("Can't divide by zero!");
                }  // catch exception type Throwable
            }  // for loop: 
        }  // try statement
        catch(ArrayIndexOutOfBoundsException exc) {
            /*
            *Purpose: Catch the array index out-of-bounds exception
            */
            System.out.println("No matching element found.");
            System.out.println("Fatal error - program terminated.");
        }  // catch exception type ArrayIndexOutOfBoundsException
    }  // main(String[])
}  // class NestTrys
/**
 * File: CustomExceptDemo.java
 * @author Mallikarjuna00G
 * Purpose: Use a custom exception.
 */
/**
 * Purpose: Create an exception.
 */
class NonIntResultException extends Exception {
    /*==================== START: FIELDS ====================*/
    int n;
    int d;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /**
     * Purpose: 
     */
    public String toString() {
        return "Result of " + n + " / " + d + " is non-integer.";
    }  // method toString
    /*==================== END: METHODS ====================*/
}  // class NonIntResultException
/**
 * Purpose: 
 */
class CustomExceptDemo {
    public static void main(String[] args) {
        // Here, numer contains some odd values.
        int[] numer = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for(var i = 0; i < numer.length; i++) {
            try {
                /*
                 *Purpose: 
                 */
                if((numer[i] % 2) != 0) {
                    throw new NonIntResultException(numer[i], denom[i]);
                }  // if statement: 
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
            }  // try statement
            catch(ArithmeticException exc) {
                /*
                 *Purpose: Catch the exception
                 */
                System.out.println("Can't divide by zero!");
            }  // catch exception type ArithmeticException
            catch(ArrayIndexOutOfBoundsException exc) {
                /*
                 *Purpose: Catch the exception
                 */
                System.out.println("No mathcing element found.");
            }  // catch exception type ArrayIndexOutOfBoundsException
            catch(NonIntResultException exc) {
                /*
                 *Purpose: 
                 */
                System.out.println(exc);
            }  // catch exception type NonIntResultException
        }  // for loop: 
    }  // main(String[])
}  // class CustomExceptDemo
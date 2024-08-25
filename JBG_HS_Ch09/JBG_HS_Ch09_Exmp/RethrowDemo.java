/**
 * File: RethrowDemo.java
 * @author Mallikarjuna00G
 * Purpose: Rethrowing an exception.
 */
/**
 * Purpose: 
 */
class Rethrow {
    /*==================== START: FIELDS ====================*/
    
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    public static void genException() {
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
                *Purpose: Arithmetic exception: divide-by-zero
                */
                System.out.println("Can't divide by zero!");
            }  // catch exception type Throwable
            catch(ArrayIndexOutOfBoundsException exc) {
                /*
                *Purpose: Catch the array index out-of-bounds exception
                */
                System.out.println("No matching element found.");
                throw exc;  // Rethrow exception
            }  // catch exception type ArrayIndexOutOfBoundsException
        }  // for loop: 
    }  // genException()
    /*==================== END: METHODS ====================*/
}  // class Rethrow
/**
 * Purpose: 
 */
class RethrowDemo {
    public static void main(String[] args) {
        try {
            /*
             *Purpose: Outer try
             */
            Rethrow.genException();
        }  // try statement
        catch(ArrayIndexOutOfBoundsException exc) {
            /*
            *Purpose: Recatch exception.
            */
            System.out.println("Fatal error - program terminated.");
        }  // catch exception type ArrayIndexOutOfBoundsException
    }  // main(String[])
}  // class RethrowDemo
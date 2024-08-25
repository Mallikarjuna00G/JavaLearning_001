/**
 * File: ThrowDemo.java
 * @author Mallikarjuna00G
 * Purpose: Manually throw an exception.
 */
/**
 * Purpose: 
 */
class ThrowDemo {
    public static void main(String[] args) {
        try {
            /*
             *Purpose: 
             */
            System.out.println("Before throw.");
            throw new ArithmeticException();
        }  // try statement
        catch(ArithmeticException exc) {
            /*
             *Purpose: Catch the exception.
             */
            System.out.println("Exception caught.");
        }  // catch exception type ArithmeticException
        System.out.println("After try/catch block.");
    }  // main(String[])
}  // class ThrowDemo
/**
 * File: ExcTypeMismatch.java
 * @author Mallikarjuna00G
 * Purpose: Exception type mismatch.
 */
/**
 * Purpose: 
 */
class ExcTypeMismatch {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            /*
             *Purpose: 
             */
            System.out.println("Before exception is generated.");

            // generate an index out-of-bounds exception.
            nums[7] = 10;
            System.out.println("This won't be displayed.");
        }  // try statement
        catch(ArithmeticException exc) {
            /*
             *Purpose: catch the exception
             */
            System.out.println("Index out-of-bounds!");
        }  // catch exception type ArithmeticException
        System.out.println("After catch statement.");
    }  // main(String[])
}  // class ExcTypeMismatch
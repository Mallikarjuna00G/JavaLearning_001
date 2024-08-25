/**
 * File: ExcDemo1.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate exception handling.
 */

/**
 * Purpose: Demonstrate exception handling.
 */
class ExcDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            /*
             *Purpose: 
             */
            System.out.println("Before exception is generated.");

            // Generate an index out-of-bounds exception.
            nums[7] = 10;
            System.out.println("This won't be displayed.");
        }  // try statement
        catch(ArrayIndexOutOfBoundsException exc) {
            /*
             *Purpose: Catch the exception.
             */
            System.out.println("Index out-of-bounds!");
        }  // catch exception type ArrayIndexOutOfBoundsException
        System.out.println("After catch statement.");
    }  // main(String[])
}  // class ExcDemo1
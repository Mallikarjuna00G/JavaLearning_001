/**
 * File: UseThrowableMethods.java
 * @author Mallikarjuna00G
 * Purpose: Using the Throwable methods.
 */
/**
 * Purpose: 
 */
class ExcTest {
    /*==================== START: FIELDS ====================*/
    
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /**
     * Purpose: 
     */
    static void genException() {
        int[] nums = new int[4];

        System.out.println("Before exception is generated.");

        // generate an inde out-of-bounds exception
        nums[7] = 10;
        System.out.println("This won't be displayed.");
    }  // method genException
    /*==================== END: METHODS ====================*/
}  // class ExcTest

/**
 * Purpose: 
 */
class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            /*
             *Purpose: 
             */
            ExcTest.genException();
        }  // try statement
        catch(ArrayIndexOutOfBoundsException exc) {
            /*
             *Purpose: catch the exception
             */
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
        }  // catch exception type ArrayIndexOutOfBoundsException
        System.out.println("After catch statement.");
    }  // main(String[])
}  // class UseThrowableMethods
/**
 * File: FinallyDemo.java
 * @author Mallikarjuna00G
 * Purpose: Use Finally.
 */
/**
 * Purpose: 
 */
class UseFinally {
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
    public static void genException(int what) {
        int t;
        int[] nums = new int[2];

        System.out.println("Receiving " + what);
        try {
            /*
             *Purpose: 
             */
            switch(what) {
                case 0:  // case: 
                    t = 10 / what;  // generate divide-by-zero error
                    break;
                case 1:  // case: 
                    nums[4] = 4;  // Generate array index error.
                    break;
                case 2:  // case: 
                    return;  // return from try block.
            }  // switch statement:        
        }  // try statement
        catch(ArithmeticException exc) {
            /*
             *Purpose: Catch the divide-by-zero exception.
             */
            System.out.println("Can't divide by zero!");
            return;  // Return from catch
        }  // catch exception type ArithmeticException
        catch(ArrayIndexOutOfBoundsException exc) {
            /*
             *Purpose: Catch exception of out-of-bound exception
             */
            System.out.println("No matching element found.");
        }  // catch exception type ArrayIndexOutOfBoundsException 
        finally {
            System.out.println("Leaving try.");
        }  // finally statement
    }  // method genException
    /*==================== END: METHODS ===============Catch the divide-by-zero exception.=====*/
}  // class UseFinally

/**
 * Purpose: 
 */
class FinallyDemo {
    public static void main(String[] args) {
        for(var i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }  // for loop: 
    }  // main(String[])
}  // class FinallyDemo
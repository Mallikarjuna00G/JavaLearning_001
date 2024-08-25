/**
 * File: NotHandled.java
 * @author Mallikarjuna00G
 * Purpose: Let JVM handle the error.
 */
/**
 * Purpose: 
 */
class NotHandled {
    public static void main(String[] args) {
        int[] nums = new int[4];

        System.out.println("Before exception is generated.");

        // generate an index out-of-bounds exception
        nums[7] = 10;
    }  // main(String[])
}  // class NotHandled
/**
 * File: NoChange.java
 * 
 * Purpose: The for-each loop essentially is read-only.
 * 
 */
class NoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int item: nums) {
            System.out.print(item + " ");
            item *= 10;  // No effect on nums array.
        }  // for-each loop: 

        System.out.println();

        for(int item: nums) {
            System.out.print(item + " ");
        }  // for-each loop: 
        System.out.println();
    }  // main(String[])
}  // class NoChange
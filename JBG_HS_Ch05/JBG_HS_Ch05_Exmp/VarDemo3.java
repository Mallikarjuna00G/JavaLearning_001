/**
 * File: VarDemo3.java
 * 
 * Purpose: Use type inference in a for loop.
 * 
 */
class VarDemo3 {
    public static void main(String[] args) {
        // Use type inference with the loop control variable.
        System.out.print("Value of x: ");
        for(var x = 2.5; x < 100.0; x = x * 2) {
            System.out.print(x + " ");
        }  // for loop: 
        System.out.println();

        // Use type inference with the iteration variable.
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.print("Values in nums array: ");
        for(var item: nums) {
            System.out.print(item + " ");
        }  // for-each loop: 
        System.out.println();
    }  // main(String[])
}  // class VarDemo3
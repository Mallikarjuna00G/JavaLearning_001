/**
 * File: ForEach.java
 * 
 * Purpose: Use a for-each style for loop.
 * 
 */
class ForEach {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int item: nums) {
            System.out.println("Value is: " + item);
            sum += item;
        }  // for-each loop: 
        System.out.println("Summation: " + sum);
    }  // main(String[])
}  // class ForEach
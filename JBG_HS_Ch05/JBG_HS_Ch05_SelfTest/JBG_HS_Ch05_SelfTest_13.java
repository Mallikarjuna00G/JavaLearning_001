/**
 * File: JBG_HS_Ch05_SelfTest_13.java
 * 
 * Purpose: Find the minimum and maximum values in a array.
 * 
 * Use for-each for loop.
 */
class JBG_HS_Ch05_SelfTest_13 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;
        
        min = max = nums[0];
        for(var item: nums) {
            if(item < min) {
                min = item;
            }  // if statement: redetermine for min value in array
            if(item > max) {
                max = item;
            }  // if statement: redetermine for max value in array
        }  // for-each loop: 
        System.out.println("min and max: " + min + " " + max);
    }  // main(String[])
}  // class JBG_HS_Ch05_SelfTest_13
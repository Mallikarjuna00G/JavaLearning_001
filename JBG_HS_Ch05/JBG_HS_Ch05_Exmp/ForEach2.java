/**
 * File: ForEach2.java
 * 
 * Purpose: Use for-each style for on a two-dimensional array.
 * 
 */
class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        // give nums some values
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }  // for loop: 
        }  // for loop: 

        // Use for-each loop to display and sum the values. 
        for(int[] itemL1: nums) {
            for(int itemL2: itemL1) {
                System.out.println("Value is: " + itemL2);
                sum += itemL2;
            }  // for-each loop: 
        }  // for-each loop: 
        System.out.println("Summation: " + sum);
    }  // main(String[])
}  // class ForEach2
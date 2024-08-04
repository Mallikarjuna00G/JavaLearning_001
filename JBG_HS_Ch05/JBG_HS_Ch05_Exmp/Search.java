/**
 * File: Search.java
 * 
 * Purpose: Search an array using for-each style for.
 * 
 */
class Search {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        // Use for-each style for to search nums for val.
        for(int item: nums) {
            if(item == val) {
                found = true;
                break;
            }  // if statement: 
        }  // for-each loop: 

        if(found) {
            System.out.println("Value found!");
        }  // if statement: 
    }  // main(String[])
}  // class Search
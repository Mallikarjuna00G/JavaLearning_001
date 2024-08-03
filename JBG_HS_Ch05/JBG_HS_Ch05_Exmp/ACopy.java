/**
 * File: ACopy.java
 * 
 * Purpose: Use length variable to help copy an array.
 * 
 */
class ACopy {
    public static void main(String[] args) {
        int i;
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];

        for(i = 0; i < nums1.length; i++) {
            nums1[i] = i;
        }  // for loop: 

        // copy nums1 to nums2
        if(nums2.length >= nums1.length) {
            for(i = 0; i < nums1.length; i++) {
                nums2[i] = nums1[i];
            }  // for loop: 
        }  // if statement: 

        for(i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }  // for loop: 
        System.out.println();
    }  // main(String[])
}  // class ACopy
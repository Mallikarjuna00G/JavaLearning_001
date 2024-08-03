/**
 * File: AssignARef.java
 * 
 * Purpose: Assigning array reference variables.
 * 
 */
class AssignARef {
    public static void main(String[] args) {
        int i;

        int[] nums1 = new int[10];
        int[] nums2 = new int[10];

        for(i = 0; i < 10; i++) {
            nums1[i] = i;
        }  // for loop: fill in nums1 array
        for(i = 0; i < 10; i++) {
            nums2[i] = -i;
        }  // for loop: fill in nums2 array

        System.out.print("Here is nums1:");
        for(i = 0; i < 10; i++) {
            System.out.print(nums1[i] + " ");
        }  // for loop: Display nums1 array
        System.out.println();
        System.out.print("Here is nums2:");
        for(i = 0; i < 10; i++) {
            System.out.print(nums2[i] + " ");
        }  // for loop: Display nums2 array
        System.out.println();
        
        nums2 = nums1;  // now num2 refers to num1.
        System.out.print("Here is nums2 after assignment:");
        for(i = 0; i < 10; i++) {
            System.out.print(nums2[i] + " ");
        }  // for loop: Display nums2 array
        System.out.println();
        
        // Now operate on nums1 array through nums2
        nums2[3] = 99;

        System.out.print("Here is nums1 after change through nums2:");
        for(i = 0; i < 10; i++) {
            System.out.print(nums1[i] + " ");
        }  // for loop: Display nums2 array
        System.out.println();
        

    }  // main(String[])
}  // class AssignARef
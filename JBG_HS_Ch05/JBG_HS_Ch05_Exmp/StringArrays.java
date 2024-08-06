/**
 * File: StringArrays.java
 * 
 * Purpose: Demonstrate String arrays.
 * 
 */
class StringArrays {
    public static void main(String[] args) {
        String[] strs = {"This", "is", "a", "test."};

        System.out.println("Original array: ");
        for(String s: strs) {
            System.out.print(s + " ");
        }  // for-each loop: 
        System.out.println("\n");

        // change a string
        strs[1] = "was";
        strs[3] = "test, too!";

        System.out.println("Modified array: ");
        for (String s : strs) {
            System.out.print(s + " ");
        }
        
        System.out.println();
    }  // main(String[])
}  // class StringArrays
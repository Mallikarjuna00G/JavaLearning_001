

/**
 * File: JBG_HS_Ch05_SelfTest_04.java
 * 
 * Purpose: Sorting of strings.
 * 
 */
class JBG_HS_Ch05_SelfTest_04 {
    public static void main(String[] args) {
        String[] names = {"Rajakumaara", "Shankaranaag", "Vishnuvardhana", "Ravichandra", "Arjuna", "Sudeep", "Kishore", "Rishab", "Vajramuni", "SaadhuKokila"};
        int a, b;
        String t;
        var size = names.length;

        // display original array
        System.out.println("Original array is:");
        for(int i = 0; i < size; i++) {
            System.out.println(" " + (i + 1) + ". " + names[i]);
        }  // for loop: 
        System.out.println();

        // This is the Bubble sort
        for(a = 1; a < size; a++) {
            for(b = size -1; b >= a; b--) {
                if(names[b-1].compareTo(names[b]) > 0) {
                    t = names[b-1];
                    names[b-1] = names[b];
                    names[b] = t;
                }  // if statement: if out of order, exchange elements.
            }  // for loop: Bubble sort inner loop.
        }  // for loop: Bubble sort outer loop.

        // display sorted order
        System.out.println("Sorted array is:");
        for(int i = 0; i < size; i++) {
            System.out.println(" " + (i + 1) + ". " + names[i]);
        }  // for loop: 
        System.out.println();
    }  // main(String[])
}  // class JBG_HS_Ch05_SelfTest_04
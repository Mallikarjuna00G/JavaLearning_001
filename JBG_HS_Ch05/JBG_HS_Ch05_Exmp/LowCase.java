/**
 * File: LowCase.java
 * 
 * Purpose: Lowercase letters.
 * 
 */
class LowCase {
    public static void main(String[] args) {
        char ch;

        for(var i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // This statement turns on the 6-th bit.
            ch = (char) ((int) ch | 32);  // ch is now lowercase

            System.out.print(ch + " ");
        }  // for loop: 
        System.out.println();
    }  // main(String[])
}  // class LowCase
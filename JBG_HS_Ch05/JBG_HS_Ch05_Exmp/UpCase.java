/**
 * File: UpCase.java
 * 
 * Purpose: Uppercase letters.
 * 
 */
class UpCase {
    public static void main(String[] args) {
        char ch;

        for(var i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            // This statement turns off the 6th bit.
            ch = (char) ((int) ch & 65503);  // ch is now uppercase.

            System.out.print(ch + " ");
        }  // for loop: 
        System.out.println();
    }  // main(String[])
}  // class UpCase
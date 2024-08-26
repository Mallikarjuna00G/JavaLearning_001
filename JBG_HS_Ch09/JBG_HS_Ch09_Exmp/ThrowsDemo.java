/**
 * File: ThrowsDemo.java
 * @author Mallikarjuna00G
 * Purpose: Use throws.
 */
class ThrowsDemo {
    /**
     * Purpose: 
     */
    public static char prompt(String str) 
    throws java.io.IOException {
        System.out.print(str + ": ");
        return (char) System.in.read();
    }  // method prompt

    public static void main(String[] args) {
        char ch;

        try {
            /*
             *Purpose: 
             */
            ch = prompt("Enter a letter");
        }  // try statement
        catch(java.io.IOException exc) {
            /*
             *Purpose: 
             */
            System.out.println("I/O exception occured.");
            ch = 'X';
        }  // catch exception type java.io.IOEXception
        System.out.println("You pressed " + ch);
    }  // main(String[])
}  // class ThowsDemoSystem.out.println("I/O exception occured.");
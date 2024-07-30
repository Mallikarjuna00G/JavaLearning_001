/**
 * Guess the letter game. Version 2.
 * 
 * Call this file "Guess2.java".
 */
class Guess2 {
    public static void main(String[] args) 
        throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("I am thinking of a letter between A and Z.");
        System.out.print("Can you guess it?: ");

        ch = (char) System.in.read();  // read a character from the keyboard

        if(ch == answer) System.out.println("** Right **");
        else System.out.println("...Sorry, you're wrong.");
    }
}
/**
 * Guess the letter game. Version 3.
 * 
 * Call this file "Guess3.java".
 */
class Guess3 {
    public static void main(String[] args) 
        throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("I am thinking of a letter between A and Z.");
        System.out.print("Can you guess it?: ");

        ch = (char) System.in.read();  // read a character from the keyboard

        if(ch == answer) System.out.println("** Right **");
        else {
            System.out.print("...Sorry, you're ");
            // a nested if
            if(ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }
    }
}
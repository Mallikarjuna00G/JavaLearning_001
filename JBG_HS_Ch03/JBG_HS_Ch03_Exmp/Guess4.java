/**
 * Guess the letter game. Version 4.
 * 
 * Call this file "Guess4.java".
 */
class Guess4 {
    public static void main(String[] args) 
        throws java.io.IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("I am thinking of a letter between A and Z.");
            System.out.print("Can you guess it?: ");

            ch = (char) System.in.read();  // read a character from the keyboard

            // discard any other characters in the input buffer
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');

            if(ch == answer) System.out.println("** Right **");
            else {
                System.out.print("...Sorry, you're ");
                // a nested if
                if(ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        }while(answer != ch);
    }
}
/**
 * File: ReadChars.java
 * @author Mallikarjuna00G
 * Purpose: Use a BufferedReader to read characters from the console.
 */
import java.io.*;
/**
 * Purpose: 
 */
class ReadChars {
    public static void main(String[] args) 
    throws IOException{
        char c;

        // Create a BufferedReader linked to System.in.
        var br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, period to quit.");

        // read characters
        do {
            /**
             * do: 
             */
            c = (char) br.read();
            System.out.println(c);
        } while(c != '.');  // do-while loop: 
    }  // main(String[])
}  // class ReadChars
/**
 * File: ReadLines.java
 * @author Mallikarjuna00G
 * Purpose: Read a string from console using a BufferedReader.
 */
import java.io.*;
/**
 * Purpose: 
 */
class ReadLines {
    public static void main(String[] args)
        throws IOException {
        // Create a BufferedReader using System.in
        var br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");

        do {
            /**
             * do: 
             */
            str = br.readLine();  // Use readLine() from BufferedReader to read a line of text.
            System.out.println(str);
        } while(!str.equals("stop"));  // do-while loop: 
    }  // main(String[])
}  // class ReadLines
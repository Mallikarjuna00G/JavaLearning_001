/**
 * File: ShowFile.java
 * @author Mallikarjuna00G
 * Purpose: This version of the ShowFile program uses a try-with-resources
 * statement to automatically close a file when it is no longer needed.
 */
import java.io.*;
/**
 * Purpose: 
 */
class ShowFile {
    public static void main(String[] args) {
        int i;
        
        if(args.length != 1) {
            // First make sure that a file name has been specified.
            System.out.println("Usage: ShowFile fileName");
            return;
        }  // if statement:

        try(FileInputStream fin = new FileInputStream(args[0])) {
            /**
             * Purpose: Use try-with-resources to open a file and
             * then automatically close it when the try block is left.
             */
            do {
                i = fin.read();
                if(i != -1) {
                    System.out.print((char)i);
                }  // if statement: 
            } while(i != -1);  // do-while loop: 
            System.out.println();
        }  // try-with-resources statement 
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            System.out.println("I/O Error: " + exc);
        }  // catch exception type IOException
    }  // main(String[])
}  // class ShowFile
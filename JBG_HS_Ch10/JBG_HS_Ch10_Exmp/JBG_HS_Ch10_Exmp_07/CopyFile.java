/**
 * File: CopyFile.java
 * @author Mallikarjuna00G
 * Purpose: A version of CopyFile that uses try-with-resources.
 * It demonstrates two resources (in this case files) being 
 * managed by a single try statement.
 */
import java.io.*;
/**
 * Purpose: 
 */
class CopyFile {
    public static void main(String[] args) {
        int i;

        if(args.length != 2) {
            // First confirm that both files have been specified.
            System.out.println("Usage: CopyFile fromFile toFile");
            return;  // Return from the main method.
        }  // if statement: 

        try(
            var fin = new FileInputStream(args[0]);
            var fout = new FileOutputStream(args[1]) 
        ) {
            /**
             * Purpose: Open and manage two files via try (-with-resources) statement
             */
            do {
                i = fin.read();
                if(i != -1) {
                    fout.write(i);
                }  // if statement: 
            } while(i != -1);  // do-while loop: 
        }  // try-with-resources statement
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            System.out.println("I/O Exception: " + exc);
        }  // catch exception type IOException
    }  // main(String[])
}  // class CopyFile
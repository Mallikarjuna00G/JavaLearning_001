
import java.io.FileInputStream;
import java.io.IOException;

/**
 * File: CompFiles.java
 * @author Mallikarjuna00G
 * Purpose: Try This 10-1
 * 
 * A file comparison Utility.
 * 
 * Compare two files.
 * 
 * To use this program, specify the names of 
 * the files to be compared on the command line.
 * 
 * `java CompFiles first.txt second.txt`
 */
/**
 * Purpose: 
 */
class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        if(args.length != 2) {
            /**
             * if: First make sure that both the files have been specified.
             */
            System.out.println("Usage: CompFiles file1 file2");
            return;  // Return from main
        }  // if statement: 

        try(
            var file1 = new FileInputStream(args[0]);
            var file2 = new FileInputStream(args[1])
        ) {
            /**
             * Purpose: Compare files.
             */
            do {
                /**
                 * do: 
                 */
                i = file1.read();
                j = file2.read();

                if(i != j) {
                    /**
                     * if: 
                     */
                    break;  // Break out of d-while loop
                }  // if statement: 
            } while(i != -1 && j != -1);  // do-while loop: 

            if(i != j) {
                /**
                 * if: 
                 */
                System.out.println("Files differ");
            } else {
                /**
                 * else: 
                 */
                System.out.println("Files are the same.");
            }  // if-else statement: 
        }  // try-with-resources statement
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            System.out.println("I/O Error " + exc);
        }  // catch exception type IOException
    }  // main(String[])
}  // class CompFiles
/**
 * File: Hyphen.java
 * @author Mallikarjuna00G
 * Purpose: For JBG_HS_Ch10_SelfTest08
 * 
 * Copy a text file, substituting hyphens for spaces.
 * 
 * This version uses byte streams.
 * 
 * To use this program, specify the name of the source file
 * and the destination file.
 * 
 * For example,
 * 
 * java Hyphen source target
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Purpose: 
 */
class Hyphen {
    public static void main(String[] args) {
        int i;

        if(args.length != 2) {
            /**
             * if: 
             */
            System.out.println("Usage: Hyphen file1 file2");
            return;  // Return from main
        }  // if statement: 

        try(
            var fin = new FileReader(args[0]);
            var fout = new FileWriter(args[1])
        ) {
            /**
             * Purpose: 
             */
            do {
                /**
                 * do: 
                 */
                i = fin.read();
                if((char) i == ' ') {
                    /**
                     * if: 
                     */
                    i = '-';
                }  // if statement: 
                fout.write(i);
            } while(i != -1);  // do-while loop: 
        }  // try-with-resources statement
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            System.out.println("I/O Error: " + exc);
        }  // catch exception type IOException
    }  // main(String[])
}  // class Hyphen
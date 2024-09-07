/**
 * File: Hyphen.java
 * @author Mallikarjuna00G
 * Purpose: For JBG_HS_Ch10_SelfTest07
 * 
 * Convert spaces to hyphens while making a copy of a file. 
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Purpose: 
 */
class Hyphen {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        
        if(args.length != 2) {
            /**
             * if: 
             */
            System.out.println("Usage: Hyphen file1 file2");
            return;
        }  // if statement: 

        try {
            /**
             * Purpose: 
             */
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                /**
                 * do: 
                 */
                i = fin.read();
                if((char)i == ' ') {
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
        finally {
            /**
             * Purpose: 
            */
            try {
                /**
                 * Purpose: 
                 */
                if(fin != null) {
                    /**
                     * if: 
                     */
                    fin.close();
                }  // if statement: 
            }  // try statement
            catch(IOException exc) {
                /**
                 * Purpose: 
                 */
                System.out.println("Error closing input file: " + exc);
            }  // catch exception type IOException

            try {
                /**
                 * Purpose: 
                 */
                if(fout != null) {
                    /**
                     * if: 
                     */
                    fout.close();
                }  // if statement: 
            }  // try statement
            catch(IOException exc) {
                /**
                 * Purpose: 
                 */
                System.out.println("Error closing output file: " + exc);
            }  // catch exception type IOException
        }  // finally block
    }  // main(String[])
}  // class Hyphen
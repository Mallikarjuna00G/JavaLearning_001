/**
 * File: CopyFile.java
 * @author Mallikarjuna00G
 * Purpose: Copy a text file.
 * 
 * To use this program, specify the name of the source file and 
 * destination file. For example, to copy a file called first.text 
 * to a file called second.txt, use the following command line.
 * 
 * `java CopyFile first.txt second.txt`
 */
import java.io.*;
/**
 * Purpose: 
 */
class CopyFile {
    public static void main(String[] args) 
    throws IOException{
        int i;

        FileInputStream fin = null;
        FileOutputStream fout = null;

        if(args.length != 2) {
            // First, make sure that both files has been specified.
            System.out.println("Usage: CopyFile fromFile toFile");
            return;  // return from main
        }  // if statement: 

        try {
            /**
             * Purpose: Try copying the file.
             */

            // Attempt to open the files.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if(i != -1) {
                    fout.write(i);
                }  // if statement: 
            } while(i != -1);  // do-while loop: 
        }  // try statement
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
                 * Purpose: Close the input file
                 */
                if(fin != null) {
                    fin.close();
                }  // if statement: 
            }  // try statement
            catch(IOException exc) {
                /**
                 * Purpose: 
                 */
                System.out.println("Error closing Input File");
            }  // catch exception type IOException
            try {
                /**
                 * Purpose: Close the output file
                 */
                if(fout != null) {
                    fout.close();
                }  // if statement: 
            }  // try statement
            catch(IOException exc) {
                /**
                 * Purpose: 
                 */
                System.out.println("Error closing Output File");
            }  // catch exception type IOException
        }  // finally block
    }  // main(String[])
}  // class CopyFile
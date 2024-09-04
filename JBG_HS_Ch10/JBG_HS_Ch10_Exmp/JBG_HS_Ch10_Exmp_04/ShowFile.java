/**
 * File: ShowFile.java
 * @author Mallikarjuna00G
 * Purpose: Display a text file.
 * 
 * This variation wraps the code that opens and
 * accesses the file within a single try block.
 * The file is closed by the finally block.
 * 
 * `java ShowFile TEST.TXT`
 */
import java.io.*;

/**
 * Purpose: 
 */
class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;  // fin initialized to null.

        // First make sure that a file has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;  // return from main
        }  // if statement: 

        try {
            /*
             * Purpose: The following code opens a file, reads characters until EOF
             * is encountered, and then closes the file via a finally block.
             */
            fin = new FileInputStream(args[0]);  // Open the file

            do {
                i = fin.read();  // Read from the file.
                if(i != -1) {
                    System.out.print((char)i);
                }  // if statement: 
            } while (i != -1);
            System.out.println();
        }  // try statement
        catch(FileNotFoundException exc) {
            /*
             *Purpose: 
             */
            System.out.println("File not found");
            return;  // retur from the main
        }  // catch exception type FileNotFoundException
        catch(IOException exc) {
            /*
             *Purpose: 
             */
            System.out.println("Error reading file.");
        }  // catch exception type IOException
        finally {
            /**
             * Purpose: Close the file in all cases.
             * - successful reading
             * - failed to read from the file.
            */
            try {
                /**
                 * Purpose: 
                 */
                if(fin != null) {
                    fin.close();
                }  // if statement: 
            }  // try statement
            catch(IOException exc) {
                /**
                 * Purpose: 
                 */
                System.out.println("Error closing the file");
            }  // catch exception type IOException
        }  // finally block
    }  // main(String[])
}  // class ShowFile
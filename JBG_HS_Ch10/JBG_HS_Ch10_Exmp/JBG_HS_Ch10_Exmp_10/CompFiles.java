/**
 * file: CompFiles.java
 * @author: Mallikarjuna00G
 * @Purpose: Try This 10-1-1
 * 
 * A file comparison utility.
 * 
 * Compare two files and ignore the case of the letters during comparison.
 * 
 * To use this program, specify the names of 
 * files to be compared on the command line.
 * 
 * `java CompFiles file1 file2`
 * 
 */
import java.io.*;
/**
 * Purpose: 
 */
class CompFiles {
    static int toLowerCase(int ch) {
        /**
         * Purpose: Convert the received character to lowercase.
         */
        int c = ch;
        if(ch >= 'A' && ch <= 'Z') {
            c = (int)(ch + ('a' - 'A'));
        } else {
            c = ch;
        }
        return c;
    }
    
    public static void main(String[] args) {
        int i = 0, j = 0;
        
        if(args.length != 2) {
            /**
             * if: First make sure that both the files have been specified.
             */
            System.out.println("Usage: CompFiles file1 file2");
            return;  // Return from main method.
        }  // try statement: 
        
        try(
            var file1 = new FileInputStream(args[0]);
            var file2 = new FileInputStream(args[1])
        ) {
            do {
                i = toLowerCase(file1.read());
                j = toLowerCase(file2.read());
                
                if(i != j) {
                    break;
                }  // if statement:     
            } while(i != -1 && j != -1);
            
            if(i != j) {
                System.out.println("File differ");
            } else {
                System.out.println("Files are same.");
            }
        }  // try statement: 
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}  // class CompFiles
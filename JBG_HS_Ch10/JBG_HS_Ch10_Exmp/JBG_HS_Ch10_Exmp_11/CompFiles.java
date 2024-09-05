/**
 * File: CompFiles.java
 * @author Mallikarjuna00G
 * Purpose: Try This 10-1-2
 * 
 * A file comparison utility.
 * 
 * Compare two files. Display the position within the file where the files differ.
 * 
 * To use this program, specify the names of the files to be compared on the command line.
 * 
 */
import java.io.*;
/**
 * Purpose: 
 */
class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0, dataCounter = 0, nDifferences = 0;
        var positions = new int[0];

        if(args.length != 2) {
            /**
             * if: Make sure that the two files are mentioned for comparison.
             */
            System.out.println("Usage: CompFiles file1 file2");
            return;
        }  // if statement: 

        try(
            var file1 = new FileInputStream(args[0]);
            var file2 = new FileInputStream(args[1])
        ) {
            /**
             * Purpose: Compare the files
             */
            i = 0;
            j = 0;
            dataCounter = 0;

            do {
                /**
                 * do: 
                 */
                if(i != -1) {
                    /**
                     * if: 
                     */
                    i = file1.read();
                }  // if statement: 
                if(j != -1) {
                    /**
                     * if: 
                     */
                    j = file2.read();
                }  // if statement: 
                if(i != j) {
                    /**
                     * if: 
                     */
                    var posLength = positions.length;
                    var temp = new int[posLength + 1];
                    for(var k = 0; k < posLength; k++) {
                        /**
                         * for: 
                         */
                        temp[k] = positions[k];
                    }  // for loop: 
                    positions = temp;
                    positions[nDifferences] = dataCounter;
                    nDifferences++;
                }  // if statement: 
                dataCounter++;
            } while(!(i == -1 && j == -1));  // do-while loop: 
            
            if(positions.length != 0) {
                /**
                 * if: 
                 */
                System.out.println("Files are not same.");
                System.out.println("Positions with differences in the compared files: ");
                for(int item: positions) {
                    System.out.print(item + " ");
                }  // for-each loop: 
                System.out.println();
            } else {
                /**
                 * else: 
                 */
                System.out.println("Files are same.");
            }  // if-else statement: 
        }  // try-with-resources statement
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            System.out.println("I/O Error: " + exc);
        }  // catch exception type IOException
    }  // main(String[])
}  // class CompFiles
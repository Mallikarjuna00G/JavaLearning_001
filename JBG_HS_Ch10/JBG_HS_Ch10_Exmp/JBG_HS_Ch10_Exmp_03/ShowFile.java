/**
 * File: ShowFile.java
 * @author Mallikarjuna00G
 * Purpose: Display a text file.
 * 
 * To use this program, specify the name 
 * of the file that you want to see. For 
 * example, to see a file called TEST.TXT, 
 * use the following command line. 
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
        FileInputStream fin;

        // First make sure that a file has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;  // return from main
        }  // if statement: 

        try {
            /*
             *Purpose: 
             */
            fin = new FileInputStream(args[0]);  // Open the file
        }  // try statement
        catch(FileNotFoundException exc) {
            /*
             *Purpose: 
             */
            System.out.println("File not found");
            return;  // retur from the main
        }  // catch exception type FileNotFoundException

        try {
            /*
             *Purpose: read bytes until EOF is encountered
             */
            do {
                i = fin.read();  // Read from the file.
                if(i != -1) {
                    System.out.print((char)i);
                }  // if statement: 
            } while (i != -1);
            System.out.println();
        }  // try statement
        catch(IOException exc) {
            /*
             *Purpose: 
             */
            System.out.println("Error reading file.");
        }  // catch exception type IOException

        try {
            /*
             *Purpose: 
             */
            fin.close();  // Close the file
        }  // try statement
        catch(IOException exc) {
            /*
             *Purpose: 
             */
            System.out.println("Error closing the file.");
        }  // catch exception type IOException
    }  // main(String[])
}  // class ShowFile
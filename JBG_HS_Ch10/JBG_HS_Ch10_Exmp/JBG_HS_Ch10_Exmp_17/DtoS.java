/**
 * File: DtoS.java
 * @author Mallikarjuna00G
 * Purpose: A simple disk-to-screen utility that demonstrates a FileReader.
 */
import java.io.*;
/**
 * Purpose: 
 */
class DtoS {
    public static void main(String[] args) {
        String s;

        try(var br = new BufferedReader(new FileReader("test.txt"))) {
            /**
             * Purpose: Create and use a FileReader wrapped in a BufferedReader.
             * To read the content from the disk (file) we are using FileReader.
             * Since we need to output to the screen (which is console) we need BufferedReader.
             */
            while((s = br.readLine()) != null) {
                /**
                 * while: 
                 */
                System.out.println(s);
            }  // while loop: 
        }  // try-with-resources statement
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            System.out.println("I/O Error: " + exc);
        }  // catch exception type IOException
    }  // main(String[])
}  // class DtoS
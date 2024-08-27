/**
 * File: ReadBytes.java
 * @author Mallikarjuna00G
 * Purpose: Read an array of bytes from the keyboard.
 */
import java.io.*;

class ReadBytes {
    public static void main(String[] args) 
    throws IOException{
        byte[] data = new byte[10];

        System.out.println("Enter some characters.");
        System.in.read(data);

        System.out.print("You entered: ");
        for(var i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }  // for loop: 

        System.out.println();
    }  // method main(String[])
}  // class ReadBytes
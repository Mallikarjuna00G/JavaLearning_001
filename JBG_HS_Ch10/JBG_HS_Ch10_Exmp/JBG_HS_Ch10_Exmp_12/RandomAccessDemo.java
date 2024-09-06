/**
 * File: RandomAccessDemo.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate radom access files.
 */
import java.io.*;
/**
 * Purpose: 
 */
class RandomAccessDemo {
    public static void main(String[] args) {
       double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
       double d;

       try(var raf = new RandomAccessFile("random.dat", "rw")) {
           /**
            * Purpose: Open and use random access file.
            */
           // Write values to the file.
           for(int i = 0; i < data.length; i++) {
               /**
                * for: 
                */
               raf.writeDouble(data[i]);
           }  // for loop: 

           // Now, read back specific values
           raf.seek(0);  // Seek to first double; Use seek() to set the file pointer.
           d = raf.readDouble();
           System.out.println("First value is " + d);

           raf.seek(8);  // Seek to second double; Use seek() to set the file pointer.
           d = raf.readDouble();
           System.out.println("Second value is " + d);

           raf.seek(8 * 3);  // Seek to fourth double; Use seek() to set the file pointer.
           d = raf.readDouble();
           System.out.println("Fourth value is " + d);

           System.out.println();

           // Now, read every other value.
           System.out.println("Here is every other value: ");
           for(int i = 0; i < data.length; i++) {
               /**
                * for: 
                */
               raf.seek(i * 8);  // Seek to ith double
               d = raf.readDouble();
               System.out.print(d + " ");
           }  // for loop: 

           System.out.println();
       }  // try-with-resources statement 
       catch(IOException exc) {
           /**
            * Purpose: 
            */
           System.out.println("I/O Error: " + exc);
       }  // catch exception type IOException
    }  // main(String[])
}  // class RandomAccessDemo
/**
 * File: PrintWriterDemo.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate PrintWriter.
 */
import java.io.*;
/**
 * Purpose: 
 */
class PrintWriterDemo {
    public static void main(String[] args) {
        var pw = new PrintWriter(System.out, true);

        var i = 10;
        var d = 123.65;

        pw.println("Using a PrintWriter.");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " is " + (i + d));
    }  // main(String[])
}  // class PrintWriterDemo
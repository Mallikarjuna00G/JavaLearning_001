/**
 * File: KtoD.java
 * @author Mallikarjuna00G
 * Purpose: A simple key-to-disk utility that demonstrates a FileWriter.
 */
import java.io.*;
/**
 * Purpose: using PrintWriter instead of System.io.
 */
final class PW {
    static PrintWriter so = new PrintWriter(System.out, true);
}  // class PWSO
/**
 * Purpose: 
 */
class KtoD {
    public static void main(String[] args) 
    throws IOException{
        String str;
        var br = new BufferedReader(new InputStreamReader(System.in));

        PW.so.println("Enter text ('stop' to quit).");

        try(var fw = new FileWriter("test.txt")) {
            /**
             * Purpose: Create a FileWriter and write strings (obtained from console) to the file.
             */
            var isStop = 0;
            do {
                /**
                 * do: 
                 */
                PW.so.print(": ");
                str = br.readLine();  // Get the input from the console

                isStop = str.compareTo("stop");

                if(isStop == 0) {
                    /**
                     * if: 
                     */
                    break;  // Break out of do-while.
                }  // if statement: 

                str = str + "\r\n";  // add new line
                fw.write(str);
            } while(isStop != 0);  // do-while loop: 
        }  // try-with-resources statement
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            PW.so.println("I/O Exception: " + exc);
        }  // catch exception type IOException
    }  // main(String[])
}  // class KtoD
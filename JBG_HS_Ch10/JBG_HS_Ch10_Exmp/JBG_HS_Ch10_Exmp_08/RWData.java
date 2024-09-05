/**
 * File: RWData.java
 * @author Mallikarjuna00G
 * Purpose: Write and then read back binary data.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Purpose: 
 */
class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try(var dataOut = new DataOutputStream(new FileOutputStream("testData"))) {
            /**
             * Purpose: Write some values
             * 
             * Write some binary data.
             */
            System.out.println("Writing " + i);
            dataOut.writeInt(i);

            System.out.println("Writing " + d);
            dataOut.writeDouble(d);

            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);

            System.out.println("Writing " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);

            System.out.println();
        }  // try-with-resources statement
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            System.out.println("Data write error.\n" + exc);
            return;  // Return from the main method.
        }  // catch exception type IOException

        System.out.println();
        try(var dataIn = new DataInputStream(new FileInputStream("testData"))) {
            /**
             * Purpose: Now, read the data back
             */
            i = dataIn.readInt();
            System.out.println("Reading " + i);

            d = dataIn.readDouble();
            System.out.println("Reading " + d);

            b = dataIn.readBoolean();
            System.out.println("Reading " + b);

            d = dataIn.readDouble();
            System.out.println("Reading " + d);
        }  // try-with-resources statement
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            System.out.println("Read error.\n" + exc);
        }  // catch exception type IOException
    }  // main(String[])
}  // class RWData
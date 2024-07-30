/**
 * Demonstrate the do-while loop.
 * 
 * Call this file "DWDemo.java".
 */
class DWDemo {
    public static void main(String[] args) 
        throws java.io.IOException{
        char ch;

        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read();  // get a char
        } while(ch != 'q');
    }
}

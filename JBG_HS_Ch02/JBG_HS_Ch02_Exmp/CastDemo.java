/**
 * Demonstrate casting.
 * 
 * Call this file "CastDemo.java".
 */
class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // cast double too int
        System.out.println("integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i; // No loss of info here. byte can store 100.
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i; // Information loss here. byte cannot hold the value 257.
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for x
        ch = (char) b; // Cast between incompatible types.
        System.out.println("ch: " + ch);
    }
}
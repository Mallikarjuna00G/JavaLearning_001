/**
 * A promotion surprise!
 * 
 * Call this file "PromDemo.java".
 */
class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // OK, no cast needed. Because result is already elevated to int.

        b = 10;
        b = (byte) (b * b); // cast needed!!
        System.out.println("i and b: " + i + " " + b);
    }
}
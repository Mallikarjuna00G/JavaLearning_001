/**
 * Demonstrate automatic conversion from double to long.
 * 
 * *** This program will not compile. ***
 * 
 * Call this file "DtoL.java"
 */
class DtoL {
    public static void main(String[] args) {
        long L;
        double D;

        D = 100123285.0;
        L = D;

        System.out.println("L and D: " + L + " " + D);
    }
}
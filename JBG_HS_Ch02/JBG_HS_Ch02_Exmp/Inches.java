/**
 * Compute the number of inches in 1 cubic mile.
 * 
 * Call this file "Inches.java".
 */
class Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in a cubic mile.");
    }
}
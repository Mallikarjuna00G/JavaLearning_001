/**
 * Use commas in a for statement.
 * 
 * Call this file "Comma.java".
 */
class Comma {
    public static void main(String[] args) {
        int i, j;

        for(i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i and j: " + i + " " + j);
        }
    }
}

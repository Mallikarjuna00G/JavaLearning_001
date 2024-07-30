/**
 * Body of a loop can be empty.
 * 
 * Call this file "Empty3.java".
 */
class Empty3 {
    public static void main(String[] args) {
        int i, sum = 0;

        for(i = 1; i <= 5; sum += i++);
        System.out.println("Sum is " + sum);
    }
}

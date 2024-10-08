/**
 * Declare loop control variable inside the for.
 * 
 * Call this file "ForVar.java".
 */
class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // Compute the factorial of the numbers through 5
        for(int i = 1; i <= 5; i++) {  // i is declared inside the for statement
            sum += i;  // i is known throughout the loop
            fact *= i;
        }

        // but i is not known here.

        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}

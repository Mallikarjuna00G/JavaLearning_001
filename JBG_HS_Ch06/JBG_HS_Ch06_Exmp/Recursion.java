/**
 * File: Recursion.java
 * 
 * Purpose: A simple example of recursion.
 * 
 */
/*
 * Purpose: Provide methods to find the factorial of a 
 * number via recursive and iterative methods.
 */
class Factorial {
    /*
     * Purpose: This is a recursive function.
     */
    public int factR(int n) {
        int result;

        if(n == 1) {
            return 1;
        }  // if statement: 
        result = factR(n - 1) * n;
        return result;
    } // method factR

    /*
     * Purpose: This is an iterative equivalent.
     */
    public int factI(int n) {
        int t, result;

        result = 1;
        for(t = 1; t <= n; t++) {
            result *= t;
        }  // for loop: 
        return result;
    } // method factI
} // class Factorial

/*
 * Purpose: 
 */
class Recursion {
    public static void main(String[] args) {
        var f = new Factorial();

        System.out.println("Factorials using resursive method: ");
        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(5));
        System.out.println();

        System.out.println("Factorials using iterative method: ");
        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
        System.out.println();
    }  // main(String[])
}  // class Recursion
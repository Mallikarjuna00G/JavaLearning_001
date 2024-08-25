/**
 * File: ExcDemo3.java
 * @author Mallikarjuna00G
 * Purpose: Handle error gracefully and continue.
 */
/**
 * Purpose: 
 */
class ExcDemo3 {
    public static void main(String[] args) {
        int[] numer = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for(var i = 0; i < numer.length; i++) {
            try {
                /*
                 *Purpose: 
                 */
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
            }  // try statement
            catch(ArithmeticException exc) {
                /*
                 *Purpose: Catch the divide-by-zero exception.
                 */
                System.out.println("Can't divide by zero!");
            }  // catch exception type ArithmeticException
        }  // for loop: 
    }  // main(String[])
}  // class ExcDemo3
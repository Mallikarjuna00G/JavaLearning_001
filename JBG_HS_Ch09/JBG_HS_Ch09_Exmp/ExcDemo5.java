/**
 * File: ExcDemo5.java
 * @author Mallikarjuna00G
 * Purpose: Subclasses must preed superclasses in catch statements.
 */
/**
 * Purpose: 
 */
class ExcDemo5 {
    public static void main(String[] args) {
        // Here, numer is longer than denom.
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for(var i = 0; i < numer.length; i++) {
            try {
                /*
                 *Purpose: 
                 */
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
            }  // try statement
            catch(ArrayIndexOutOfBoundsException exc) {
                /*
                 *Purpose: Catch the array index out-of-bounds exception
                 */
                System.out.println("No matching element found.");
            }  // catch exception type ArrayIndexOutOfBoundsException
            catch(Throwable exc) {
                /*
                 *Purpose: Catch all other exceptions being a superclass.
                 */
                System.out.println("Some exception occured!");
            }  // catch exception type Throwable
        }  // for loop: 
    }  // main(String[])
}  // class ExcDemo5
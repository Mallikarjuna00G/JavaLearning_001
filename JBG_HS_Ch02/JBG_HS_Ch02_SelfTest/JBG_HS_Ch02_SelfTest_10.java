/**
 * Find all of the prime numbers between 2 and 100.
 * 
 * Call this file "JBG_HS_SelfTest_10.java".  
 */
class JBG_HS_SelfTest_10 {
    public static void main(String[] args) {
        int i, j;

        System.out.println("Prime numbers between 2 and 100: ");
        System.out.print("2 ");
        for(i = 3; i <= 100; i++) {
            int upto = (int)(Math.sqrt((double) i)) + 1;
            boolean isPrime = true;
            for(j = 2; j <= upto; j++) {
                if(i%j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
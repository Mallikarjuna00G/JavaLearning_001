/**
 * File: LocalClassDemo.java
 * 
 * Purpose: Use ShowBits as local class.
 * 
 */
/*
 * Purpose: 
 */
class LocalClassDemo {
    public static void main(String[] args) {
        /*
         * Purpose: An inner class version of ShowBits.
         */
        class ShowBits {
            int numBits;

            /*
             * Purpose: 
             */
            public ShowBits(int n) {
                numBits = n;
            } // Constructor
            
            /*
             * Purpose: 
             */
            public void show(long val) {
                var mask = 1L;

                // left-shift a 1 into the proper position.
                mask = mask << numBits - 1;

                int spacer = 0;
                for(; mask != 0; mask >>>= 1) {
                    if((val & mask) != 0) {
                        // if: 
                        System.out.print("1");
                    } else {
                        // else: 
                        System.out.print("0");
                    }  // if-else statement: 
                    spacer++;
                    if((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }  // if statement: 
                }  // for loop: 
                System.out.println();
            } // method show
        } // class ShowBits

        for(byte b = 0; b < 10; b++) {
            var byteVal = new ShowBits(8);
            System.out.print(b + " in binary: ");
            byteVal.show(b);
        }  // for loop: 
    }  // main(String[])
}  // class LocalClassDemo
/**
 * File: ShowBitsDemo.java
 * 
 * Purpose: Try This 5-3
 * 
 * A class that displays the binary representation of a value.
 * 
 */
class ShowBits {
    int numBits;

    ShowBits(int n) {
        numBits = n;
    }  // Constructor

    // method purpose: 
    void show(long val) {
        long mask = 1;
        
        // left-shift a 1 into the proper position
        mask <<= numBits - 1;

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

class ShowBitsDemo {
    public static void main(String[] args) {
        var b = new ShowBits(8);
        var i = new ShowBits(32);
        var li = new ShowBits(64);
        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87987 in binary: ");
        i.show(87987);

        System.out.println("\n237658768 in binary: ");
        li.show(237658768);

        // you can also show low-order bits of any integer
        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }  // main(String[])
}  // class ShowBitsDemo
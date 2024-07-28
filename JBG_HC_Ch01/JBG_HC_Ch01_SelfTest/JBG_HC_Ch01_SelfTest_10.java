/**
 * Try This 1-2
 * 
 * This program displays a conversion
 * table of inches to meters.
 * 
 * Call this program "JBG_HC_Ch01_SelfTest_10.java"
 */
class JBG_HC_Ch01_SelfTest_10 {
    public static void main(String[] args) {
        double inches, meters;
        int counter;
        int inchesPerFeet = 12;
        int runForNFeets = 12;

        counter = 0;
        for(inches = 1; inches <= inchesPerFeet*runForNFeets; inches++) {
            meters = inches / 39.37; // convert to meters
            System.out.println(inches + " inches is " + meters + " meters.");

            counter++;
            // every 10th line, print a blank line
            if(counter == 12) {
                System.out.println();
                counter = 0;  // reset the line counter
            }
        }
    }
}
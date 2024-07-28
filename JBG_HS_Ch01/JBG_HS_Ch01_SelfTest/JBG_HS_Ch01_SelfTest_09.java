/**
 * Compute your effective weight (Kgs) on the moon.
 * 
 * Call this file "JBG_HS_Ch01_SelfTest_09"
 */
class JBG_HS_Ch01_SelfTest_09 {
    public static void main(String[] args) {
        double yourWeightOnEarthKgs;
        double yourWeightOnMoonKgs;

        yourWeightOnEarthKgs = 63.2;

        yourWeightOnMoonKgs = yourWeightOnEarthKgs * 0.17;

        System.out.println("Your weight on earth which is " + yourWeightOnEarthKgs + "Kgs is equal to " + yourWeightOnMoonKgs + "Kgs on the moon.");
    }
}
/**
 * File: JBG_HS_Ch05_SelfTest_03.java
 * 
 * Purpose: Average of 10 double from an using array.
 * 
 */
class JBG_HS_Ch05_SelfTest_03 {
    public static void main(String[] args) {
        double[] arrDoubles = {10.1, 20.2, 30.3, 40.4, 50.5, 60.6, 70.7, 80.8, 90.9, 100.01};
        var avg = 0.0;

        System.out.print("Average of the elements: ");
        for(var i = 0; i < 10; i++) {
            System.out.print(arrDoubles[i] + " ");
            avg += arrDoubles[i];
        }  // for loop: 
        avg /= arrDoubles.length;
        System.out.println("\nAverage: " + avg);
    }  // main(String[])
}  // class JBG_HS_Ch05_SelfTest_03
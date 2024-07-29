/**
 * Try This 2-1-1
 * 
 * Compute the distance to a large object,
 * such as a rock wall, by timing the echo.
 * 
 * Call this file "Sound2.java".
 */
class Sound2 {
    public static void main(String[] args) {
        double dist;  // in feet
        double roundTripTime = 4.8;  // in seconds
        double timeForOneWay = roundTripTime / 2;  // in seconds

        double speedOfSound = 1100.0;  // Speed of sound in feet per second.

        dist = timeForOneWay * speedOfSound;

        System.out.println("The object is " + dist + " feet away.");
    }
}



/**
 * File: TwoVehicles.java
 * 
 * Purpose: This program creates two Vehicle objects.
 * 
 */
class Vehicle {
    int passengers;  // number of passengers
    int fuelCap;  // fuel capacity in gallons
    int mpg;  // fuel consumption in piles per gallon
} // class Vehicle

// This class declares an object of type variable.
class TwoVehicles {
    public static void main(String[] arg) {
        Vehicle minivan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        // assign values to fields in minivan
        sportsCar.passengers = 2;
        sportsCar.fuelCap = 14;
        sportsCar.mpg = 12;
        
        // compute the ranges assuming a full tank of gas
        range1 = minivan.fuelCap * minivan.mpg;
        range2 = sportsCar.fuelCap * sportsCar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1);
        System.out.println("Sportscar can carry " + sportsCar.passengers + " with range of " + range2);
    }  // main(String[])
}  // class TwoVehicles
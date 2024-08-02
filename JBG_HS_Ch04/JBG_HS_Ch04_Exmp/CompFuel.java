/**
 * File: CompFuel.java
 * 
 * Purpose: Add a parameterized method that computes the
 * fuel required for a given distance.
 * 
 */
class Vehicle {
    int passengers;  // number of passengers
    int fuelCap;  // fuel capacity in gallons
    int mpg;  // fuel consumption in piles per gallon

    // Display the range.
    int range() {
        return mpg * fuelCap;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
} // class Vehicle

// This class declares an object of type variable.
class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportsCar = new Vehicle();
        double gallons;
        int dist = 252;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        // assign values to fields in minivan
        sportsCar.passengers = 2;
        sportsCar.fuelCap = 14;
        sportsCar.mpg = 12;
        
        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
        
        gallons = sportsCar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    }  // main(String[])
}  // class CompFuel
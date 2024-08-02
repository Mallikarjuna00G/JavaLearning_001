/**
 * File: VehConsDemo.java
 * 
 * Purpose: Add a constructor.
 * 
 */
class Vehicle {
    int passengers;  // number of passengers
    int fuelCap;  // fuel capacity in gallons
    int mpg;  // fuel consumption in piles per gallon

    // This is a constructor for Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelCap = f;
        mpg = m;
    }  // constructor

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
class VehConsDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportsCar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
        
        gallons = sportsCar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    }  // main(String[])
}  // class VehConsDemo
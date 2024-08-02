/**
 * File: RetMeth.java
 * 
 * Purpose: Use a return value.
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
} // class Vehicle

// This class declares an object of type variable.
class RetMeth {
    public static void main(String[] args) {
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
        
        range1 = minivan.range();
        range2 = sportsCar.range();
        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " Miles");
        
        System.out.println("Sportscar can carry " + sportsCar.passengers + " with range of " + range2 + " Miles");
        minivan.range();
    }  // main(String[])
}  // class RetMeth
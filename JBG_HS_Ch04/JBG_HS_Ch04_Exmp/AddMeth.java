/**
 * File: AddMeth.java
 * 
 * Purpose: Add range to Vehicle.
 * 
 */
class Vehicle {
    int passengers;  // number of passengers
    int fuelCap;  // fuel capacity in gallons
    int mpg;  // fuel consumption in piles per gallon

    // Display the range.
    void range() {
        System.out.println("Range is " + fuelCap * mpg + ".");
    }
} // class Vehicle

// This class declares an object of type variable.
class AddMeth {
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
        
        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();
        System.out.print("Sportscar can carry " + sportsCar.passengers + ". ");
        minivan.range();
    }  // main(String[])
}  // class AddMeth
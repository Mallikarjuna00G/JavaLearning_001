/**
 * File: VehicleDemo.java
 * 
 * Purpose: A program that uses the Vehicle class.
 * 
 */
class Vehicle {
    int passengers;  // number of passengers
    int fuelCap;  // fuel capacity in gallons
    int mpg;  // fuel consumption in miles per gallon
} // class Vehicle

// This class declares an object of type Vehicle.
class VehicleDemo {
    public static void main(String[] arg) {
        Vehicle minivan = new Vehicle();
        int range;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        // Compute the range assuming a full tank of gas
        range = minivan.fuelCap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
    }  // main(String[])
}  // class VehicleDemo
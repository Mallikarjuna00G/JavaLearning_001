/**
 * File: TruckDemo.java
 * @author Mallikarjuna00G
 * Purpose: Try This 7­-1 Extending the Vehicle Class
 * 
 * Build a subclass of Vehicle for trucks.
 */

/*
 * Purpose: 
 */
class Vehicle {
    private int passengers;  // number of passengers
    private int fuelCap;  // fuel capacity in gallons
    private int mpg;  // fuel consumption in miles per gallon

    /*
     * Purpose: This is a constructor for vehicle.
     */
    public Vehicle(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    } // Constructor 

    // Accessor methods for instance variables.
    /*
     * Purpose: 
     */
    public int getPassengers() {
        return passengers;
    } // method getPassengers

    /*
     * Purpose: 
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    } // method setPassengers

    /*
     * Purpose: 
     */
    public int getFuelCap() {
        return fuelCap;
    } // method getFuelCap

    /*
     * Purpose: 
     */
    public  void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    } // method functionName

    /*
     * Purpose: 
     */
    public int getMpg() {
        return mpg;
    } // method getMpg

    /*
     * Purpose: 
     */
    public void setMpg(int mpg) {
        this.mpg = mpg;
    } // method setMpg

    /*
     * Purpose: Return the range
     */
    public int range() {
        return mpg * fuelCap;
    } // method range

    /*
     * Purpose: Compute fuel needed for a given distance.
     */
    public double fuelNeeded(int miles) {
        return (double) miles / mpg;
    } // method fuelNeeded
} // class Vehicle

/*
 * Purpose: Extend Vehicle to create a Truck specialization.
 */
class Truck extends Vehicle {
    private int cargoCap;  // Cargo capacity in pounds.

    /*
     * Purpose: This is a constructor for Truck.
     */
    public Truck(int passengers, int fuelCap, int mpg, int cargoCap) {
        /* Initialize  Vehicle members using Vehicle constructor. */
        super(passengers, fuelCap, mpg);
        this.cargoCap = cargoCap;
    } // Constructor 

    // Accessor methods for cargoCap
    /*
     * Purpose: 
     */
    public int getCargo() {
        return cargoCap;
    } // method getCargo

    /*
     * Purpose: 
     */
    public void setCargo(int cargoCap) {
        this.cargoCap = cargoCap;
    } // method setCargo
} // class Truck

/*
 * Purpose: 
 */
class TruckDemo {
    public static void main(String[] args) {
        // Construct some trucks
        var semi = new Truck(2, 200, 7, 44000);
        var pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");

        gallons = pickup.fuelNeeded(dist);
        System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.");
    }  // main(String[])
}  // class TruckDemo
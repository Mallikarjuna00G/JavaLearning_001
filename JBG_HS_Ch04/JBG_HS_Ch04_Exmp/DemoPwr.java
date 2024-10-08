/**
 * File: DemoPwr.java
 * 
 * Purpose: Compute the result of a number raised to some integer power.
 * 
 */
class Pwr {
    double b;
    int e;
    double val;

    // Constructor
    Pwr(double b, int e) {
        this.b = b;
        this.e = e;

        this.val = 1;
        if(e == 0) return;
        for(; e > 0; e--) this.val = this.val * b;
    }  // constructor

    double get_pwr() {
        return this.val;
    }
} // class Pwr

class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());
    }  // main(String[])
}  // class DemoPwr
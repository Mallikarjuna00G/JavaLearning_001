/**
 * File: AccessDemo.java
 * 
 * Purpose: Public vs private access.
 * 
 */
class MyClass {
    private int alpha;  // private access
    public int beta;  // public access
    int gamma;  // default access

    /*
     * Methods to access alpha. It is OK for a 
     * member of a class to access a private member
     * of the same class.
     */
    // method purpose: 
    void setAlpha(int a) {
        alpha = a;
    } // method setAlpha

    // method purpose: 
    int getAlpha() {
        return alpha;
    } // method getAlpha
} // class MyClass

class AccessDemo {
    public static void main(String[] args) {
        var ob = new MyClass();

        /*
         * Access to alpha is allowed only through 
         * its accessor methods.
         */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is: " + ob.getAlpha());

        // You cannot access alpha like this.
        // ob.alpha = 10;  // Wrong! alpha is private!

        // These are OK because beta and gamma are public.
        ob.beta = 88;
        ob.gamma = 99;
    }  // main(String[])
}  // class AccessDemo
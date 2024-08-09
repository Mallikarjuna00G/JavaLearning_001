/**
 * File: OverloadDemo.java
 * 
 * Purpose: Demonstrate method overloading.
 * 
 */
/*
 * Purpose: 
 */
class Overload {
    /*
     * Purpose: first version
     */
    public void ovlDemo() {
        System.out.println("No parameters");
    } // method ovlDemo

    /*
     * Purpose: second version. Overload ovlDemo for one
     * integer parameter.
     */
    public void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    } // method ovlDemo

    /*
     * Purpose: Third version. Overload ovlDemo for two integer parameters.
     */
    public int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    } // method ovlDemo

    /*
     * Purpose: Fourth version. Overload ovlDemo for two double parameters.
     */
    public double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    } // method ovlDemo
} // class Overload

/*
 * Purpose: 
 */
class OverloadDemo {
    public static void main(String[] args) {
        var ob = new Overload();
        int resI;
        double resD;

        // Call all versions of ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
        System.out.println();
        
    }  // main(String[])
}  // class OverloadDemo
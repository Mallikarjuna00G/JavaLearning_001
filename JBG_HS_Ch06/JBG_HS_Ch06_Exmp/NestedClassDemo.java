/**
 * File: NestedClassDemo.java
 * 
 * Purpose: Use an inner class.
 * 
 */
/*
 * Purpose: 
 */
class Outer {
    int[] nums;

    /*
     * Purpose: 
     */
    public Outer(int[] n) {
        nums = n;
    } // Constructor 

    /*
     * Purpose: 
     */
    public void analyze() {
        var inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    } // method analyze

    /*
     * Purpose: This is an inner class
     */
    class Inner {
        /*
         * Purpose: 
         */
        public int min() {
            int m = nums[0];

            for(var i = 1; i < nums.length; i++) {
                if(m > nums[i]) {
                    m = nums[i];
                }  // if statement: 
            }  // for loop: 

            return m;
        } // method min

        /*
         * Purpose: 
         */
        public int max() {
            int m = nums[0];

            for(var i = 1; i < nums.length; i++) {
                if(m < nums[i]) {
                    m = nums[i];
                }  // if statement: 
            }  // for loop: 

            return m;
        } // method max

        /*
         * Purpose: 
         */
        public int avg() {
            int m = 0;

            for(var i = 0; i < nums.length; i++) {
                m += nums[i];
            }  // for loop: 

            return m / nums.length;
        } // method avg
    } // class Inner
} // class Outer

/*
 * Purpose: 
 */
class NestedClassDemo {
    public static void main(String[] args) {
        int[] x = {3, 2, 1, 5, 6, 9, 7, 8};

        var outOb = new Outer(x);

        outOb.analyze();
    }  // main(String[])
}  // class NestedClassDemo
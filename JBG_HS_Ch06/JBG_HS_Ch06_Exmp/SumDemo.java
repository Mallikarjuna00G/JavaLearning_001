/**
 * File: SumDemo.java
 * 
 * Purpose: Initialize one object with another.
 * 
 */
/*
 * Purpose: 
 */
class Summation {
    int sum;

    /*
     * Purpose: 
     */
    public Summation(int num) {
        sum = 0;
        for(var i = 1; i <= num; i++) {
            sum += i;
        }  // for loop: 
    } // Constructor 

    /*
     * Purpose: 
     */
    public Summation(Summation ob) {
        sum = ob.sum;
    } // Constructor 
} // class Summation

/*
 * Purpose: 
 */
class SumDemo {
    public static void main(String[] args) {
        var s1 = new Summation(5);
        var s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }  // main(String[])
}  // class SumDemo
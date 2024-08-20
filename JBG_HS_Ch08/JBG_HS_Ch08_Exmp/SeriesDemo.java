/**
 * File: SeriesDemo.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate an interface.
 * 
 */
/*
 * Purpose: 
 */
class ByTwos implements Series {
    /*==================== START: FIELDS ====================*/
    int start;
    int val;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    ByTwos() {
        start = 0;
        val = 0;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    /*
     * Purpose: 
     */
    public int getNext() {
        val += 2;
        return val;
    } // method getNext

    /*
     * Purpose: 
     */
    public void reset() {
        val = start;
    } // method reset

    /*
     * Purpose: 
     */
    public void setStart(int startValue) {
        start = startValue;
        val = startValue;
    } // method setStart
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    
    /*==================== END: METHODS ====================*/
} // class ByTwos

/*
 * Purpose: 
 */
class SeriesDemo {
    public static void main(String[] args) {
        var ob = new ByTwos();

        for(var i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }  // for loop: 

        System.out.println("\nResetting");
        ob.reset();
        for(var i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }  // for loop: 

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(var i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }  // for loop: 
    }  // main(String[])
}  // class SeriesDemo
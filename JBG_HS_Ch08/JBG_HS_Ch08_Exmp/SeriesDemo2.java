/**
 * File: SeriesDemo2.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate an interface.
 * 
 * Additional members of classes that are implementing interfaces.
 * 
 */
/*
 * Purpose: 
 */
class ByTwos implements Series {
    /*==================== START: FIELDS ====================*/
    int start;
    int val;
    int prev;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: 
     */
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    } // method getNext

    /*
     * Purpose: 
     */
    public void reset() {
        val = start;
        prev = start - 2;
    } // method reset

    /*
     * Purpose: 
     */
    public void setStart(int startValue) {
        start = startValue;
        val = startValue;
        prev = startValue - 2;
    } // method setStart

    /*
     * Purpose: 
     */
    int getPrevious() {
        return prev;
    } // method getPrevious
    /*==================== END: METHODS ====================*/
} // class ByTwos

/*
 * Purpose: 
 */
class ByThrees implements Series {
    /*==================== START: FIELDS ====================*/
    int start;
    int val;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    ByThrees() {
        start = 0;
        val = 0;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: 
     */
    public int getNext() {
        val += 3;
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

    /*
     * Purpose: 
     */
    /*==================== END: METHODS ====================*/
} // class ByThrees

/*
 * Purpose: 
 */
class SeriesDemo2 {
    public static void main(String[] args) {
        var twoOb = new ByTwos();
        var threeOb = new ByThrees();
        Series ob;

        for(var i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Next ByTwos value is " + ob.getNext());
            ob = threeOb;
            System.out.println("Next ByThree value is " + ob.getNext());
        }  // for loop: 

        
    }  // main(String[])
}  // class SeriesDemo2
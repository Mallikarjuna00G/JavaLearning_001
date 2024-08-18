/**
 * File: DynDispDemo.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate dynamic method dispatch.
 * 
 */
/*
 * Purpose: 
 */
class Sup {
    /*==================== START: FIELDS ====================*/
    
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: 
     */
    public void who() {
        System.out.println("who() in Sup");
    } // method who
    /*==================== END: METHODS ====================*/
} // class Sup

/*
 * Purpose: 
 */
class Sub1 extends Sup {
    /*==================== START: FIELDS ====================*/
    
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: 
     */
    public void who() {
        System.out.println("who() in Sub1");
    } // method who
    /*==================== END: METHODS ====================*/
} // class Sub1

/*
 * Purpose: 
 */
class Sub2 extends Sup {
    /*==================== START: FIELDS ====================*/
    
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: 
     */
    public void who() {
        System.out.println("who() in Sub2");
    } // method who
    /*==================== END: METHODS ====================*/
} // class Sub2

/*
 * Purpose: 
 */
class DynDispDemo {
    public static void main(String[] args) {
        var superOb = new Sup();
        var sub1Ob = new Sub1();
        var sub2Ob = new Sub2();

        Sup supRef;

        supRef = superOb;
        supRef.who();
        supRef = sub1Ob;
        supRef.who();
        supRef = sub2Ob;
        supRef.who();
    }  // main(String[])
}  // class DynDispDemo
/**
 * File: FixedQueue.java
 * @author Mallikarjuna00G
 * Purpose: 
 */
package qpack;
/*
 * Purpose: A fixed-size queue class for characters. 
 */
public class FixedQueue implements ICharQ {
    /*==================== START: FIELDS ====================*/
    private char q[];  // This array holds the queue.
    private int putLoc, getLoc;  // The put and get indices.
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /**
     * Purpose: Construct an empty queue give its size.
     */
    public FixedQueue(int size) {
        q = new char[size];  // allocate memory for queue

        putLoc = getLoc = 0;
    }  // Constructor

    /**
     * Purpose: Copy construct.
     */
    FixedQueue(FixedQueue ob) {
        q = new char[ob.q.length];
        for(var i = 0; i < ob.putLoc; i++) {
            q[i] = ob.q[i];
        }  // for loop: 
        putLoc = ob.putLoc;
        getLoc = 0;
    }  // Constructor 
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    /**
     * Purpose: Get putLoc.
     */
    int getPutLoc() {
        return putLoc;
    }  // method getPutLoc

    /**
     * Purpose: Get getLoc.
     */
    int getGetLoc() {
        return getLoc;
    }  // method getGetLoc
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: Put a character into the queue.
     */
    public void put(char ch) {
        if(putLoc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }  // if statement: 

        q[putLoc++] = ch;
    } // method put

    /*
     * Purpose: Get a character from the queue.
     */
    public char get() {
        if(getLoc == putLoc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }  // if statement: 

        return q[getLoc++];
    } // method get

    /**
     * Purpose: Reset the queue.
     */
    public void reset() {
        putLoc = getLoc = 0;
    }  // method reset

    /**
     * Purpose: Return the length of the queue.
     */
    int getQueueLength() {
        return q.length;
    }  // method getQueueLength
    /*==================== END: METHODS ====================*/
} // class FixedQueue
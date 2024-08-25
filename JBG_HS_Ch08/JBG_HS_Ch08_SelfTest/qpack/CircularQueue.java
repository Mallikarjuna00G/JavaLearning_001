/**
 * File: CircularQueue.java
 * @author Mallikarjuna00G
 * Purpose: 
 */
package qpack;

/*
 * Purpose: A Circular queue.
 */
public class CircularQueue implements ICharQ {
    /*==================== START: FIELDS ====================*/
    private char q[];  // This array holds the queue.
    private int putLoc, getLoc;  // the put and get indices.
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /**
     * Purpose: Construct an empty queue given its size.
     */
    public CircularQueue(int size) {
        q = new char[size+1];  // Allocate memory for queue.
        putLoc = getLoc = 0;
    }  // Constructor

    /**
     * Purpose: Copy construct.
     */
    CircularQueue(CircularQueue ob) {
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
        /*
         * Queue is full if either putLoc is one less than
         * getLoc, or if putLoc is at the end of the array
         * and getLoc is at the beginning.
         */
        if(putLoc + 1 == getLoc | (putLoc == q.length - 1 & getLoc == 0)) {
            System.out.println(" - Queue is full.");
            return;
        }  // if statement:
        
        q[putLoc++] = ch;
        if(putLoc == q.length) {
            putLoc = 0;  // loop back
        }  // if statement: 
    } // method put

    /*
     * Purpose: Get a character from the queue.
     */
    public char get() {
        if(getLoc == putLoc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }  // if statement: 

        char ch = q[getLoc++];
        if(getLoc == q.length) {
            getLoc = 0;  // loop back
        }  // if statement: 
        return ch;
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
} // class CircularQueue
/**
 * File: QueueFullException.java
 * @author Mallikarjuna00G
 * Purpose: Try This 9-1 Adding Exceptions to the Queue class.
 */
 /**
 * Purpose: An exception for queue-full errors.
 */
public class QueueFullException extends Exception {
    int size;

    /**
     * Purpose: 
     */
    QueueFullException(int size) {
        this.size = size;
    }  // Constructor 

    /**
     * Purpose: 
     */
    public String toString() {
        return "\nQueue is full. Maximum size is " + size;
    }  // method toString
}  // class QueueFullException
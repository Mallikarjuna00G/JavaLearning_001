/**
 * File: QueueEmptyException.java
 * @author Mallikarjuna00G
 * Purpose: Try This 9-1 Adding exceptions to the Queue class.
 */
 /**
 * Purpose: An exception for queue-empty errors.
 */
public class QueueEmptyException extends Exception {
    /**
     * Purpose: 
     */
    public String toString() {
        return "\n Queue is empty.";
    }  // method toString
}  // class QueueEmptyException
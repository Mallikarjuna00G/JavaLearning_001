/**
 * File: StackFullException.java
 * @author Mallikarjuna00G
 * Purpose: An exception for stack-full errors.
 */
/**
 * Purpose: 
 */
class StackFullException extends Exception {
    int size;

    StackFullException(int size) {
        this.size = size;
    }

    /**
     * Purpose: 
     */
    public String toString() {
        return "\nStack is full. Maximum size is " + size;
    }  // method toString
}  // class StackFullException
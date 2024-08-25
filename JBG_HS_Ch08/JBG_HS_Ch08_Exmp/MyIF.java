/**
 * File: MyIF.java
 * @author Mallikarjuna00G
 * Purpose: interface with default method.
 * 
 */

/**
 * Purpose: 
 */
public interface MyIF{
    // This ia a "normal" interface method declaration.
    // It does NOT define a default implementation.
    int getUserID();

    // This is a default method. Notice that it provides a 
    // default implementation.
    default int getAdminID() {
        return 1;
    }  // method getAdminID

    /**
     * Purpose: This is a static interface method.
     */
    static int getUniversalID() {
        return 0;
    }  // method getUniversalID
}  // interface MyIF
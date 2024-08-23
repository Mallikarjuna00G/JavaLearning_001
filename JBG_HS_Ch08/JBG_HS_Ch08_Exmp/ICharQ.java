/**
 * File: ICharQ.java
 * @author Mallikarjuna00G
 * Purpose: Define the interface ICharQ.
 * 
 */

/** 
 * Purpose: A character queue interface.
 */
public interface ICharQ {
    // put a character into the queue.
    void put(char ch);

    // Get a character from the queue.
    char get();

    // Reset the queue.
    void reset();
}  // interface ICharQ
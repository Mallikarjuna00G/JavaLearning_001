/**
 * File: QDemo3.java
 * 
 * Purpose: Try This 6-1
 * 
 */
/*  
 * Purpose: An improved queue class for characters.
 */
class Queue {
    // these members are now private
    private char[] q;  // this array holds the queue.
    private int putLoc, getLoc;  // The put and get indices

    Queue(int size) {
        q = new char[size];  // allocate memory for queue
        putLoc = getLoc = 0;
    }  // Constructor

    // method purpose: put a character into the queue
    void put(char ch) {
        if(putLoc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }  // if statement: 
        q[putLoc++] = ch;
    } // method put

    // method purpose: get a character from the queue.
    char get() {
        if(getLoc == putLoc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }  // if statement: 
        
        return q[getLoc++];
    } // method get
} // class Queue

// Demonstrate the Queue class.
class QDemo3 {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // put some numbbers into bigQ.
        for(i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }  // for loop: 

        // retrieve and display elements from bigQ.
        System.out.print("Contents of bigQ: ");
        for(i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) {
                System.out.print(ch);
            }  // if statement: 
        }  // for loop: 
        System.out.println();

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors.
        for(i = 0; i < 5; i++) {
            System.out.print("Attempting to store " + (char)('Z' - i));
            smallQ.put((char)('Z' - i));
            System.out.println();
        }  // for loop: 
        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for(i = 0; i < 5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) {
                System.out.print(ch);
            }  // if statement: 
        }  // for loop: 
    }  // main(String[])
}  // class QDemo3
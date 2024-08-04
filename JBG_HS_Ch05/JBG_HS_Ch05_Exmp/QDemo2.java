/**
 * File: QDemo2.java
 * 
 * Purpose: Try This 5-2
 * 
 * A queue class for ints.
 * 
 */
class Queue {
    int[] q;  // this array holds the queue.
    int putLoc, getLoc;  // The put and get indices

    Queue(int size) {
        q = new int[size];  // allocate memory for queue
        putLoc = getLoc = 0;
    }  // Constructor

    // method purpose: put a character into the queue
    void put(int ch) {
        if(putLoc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }  // if statement: 
        q[putLoc++] = ch;

        return;
    } // method put

    // method purpose: get a character from the queue.
    int get() {
        if(getLoc == putLoc) {
            System.out.println(" - Queue is empty.");
            return -1;
        }  // if statement: 
        
        return q[getLoc++];
    } // method get
} // class Queue

// Demonstrate the Queue class.
class QDemo2 {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        int ch;
        int i;

        System.out.println("Using bigQ to store the integer.");
        // put some numbers into bigQ.
        for(i = 0; i < 10; i++) {
            bigQ.put(i + i * 3);
        }  // for loop: 

        // retrieve and display elements from bigQ.
        System.out.print("Contents of bigQ: ");
        for(i = 0; i < 10; i++) {
            ch = bigQ.get();
            if(ch != -1) {
                System.out.print(ch + " ");
            }  // if statement: 
        }  // for loop: 
        System.out.println();

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors.
        for(i = 0; i < 5; i++) {
            int temp = i + i * 3;
            System.out.print("Attempting to store " + temp);
            smallQ.put(temp);
            System.out.println();
        }  // for loop: 
        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for(i = 0; i < 5; i++) {
            ch = smallQ.get();

            if(ch != -1) {
                System.out.print(ch + " ");
            }  // if statement: 
        }  // for loop: 
    }  // main(String[])
}  // class QDemo2
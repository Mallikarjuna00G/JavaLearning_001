/**
 * File: QDemo2.java
 * 
 * Purpose: Try This 6-2
 * 
 * Constructor overloading. Construct Queue from a Queue.
 * 
 * Construct a Queue with initial values.
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

    /*
     * Purpose: Construct a Queue from a Queue.
     */
    public Queue(Queue ob) {
        putLoc = ob.putLoc;
        getLoc = ob.getLoc;
        q = new char[ob.q.length];

        // copy elements
        for(var i = getLoc; i < putLoc; i++) {
            q[i] = ob.q[i];
        }  // for loop: 
    } // Constructor 

    /*
     * Purpose: Construct a Queue with initial values.
     */
    public Queue(char a[]) {
        putLoc = 0;
        getLoc = 0;
        q = new char[a.length];

        for(var i = 0; i < a.length; i++) {
            put(a[i]);
        }  // for loop: 
    } // Constructor 

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
class QDemo2 {
    public static void main(String[] args) {
        // Construct 10-element empty queue
        var q1 = new Queue(10);
        
        char[] name = {'P', 'r', 'e', 'm', 'i', 'k', 'a'};
        // Construct queue from array
        var q2 = new Queue(name);

        char ch;
        int i;

        // put some characters into q1
        for(i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }  // for loop: 

        // Construct Queue from another Queue.
        var q3 = new Queue(q1);

        // Show the queues.
        System.out.print("Show contents of q1: ");
        for(i = 0; i < 10; i++) {
            ch = q1.get();

            System.out.print(ch);
        }  // for loop: 

        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for(i = 0; i < 7; i++) {
            ch = q2.get();
            System.out.print(ch);
        }  // for loop: 

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for(i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }  // for loop: 

        System.out.println();
    }  // main(String[])
}  // class QDemo2
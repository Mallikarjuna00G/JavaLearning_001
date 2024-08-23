/**
 * File: IQDemo.java
 * @author Mallikarjuna00G
 * Purpose: Try This 8­-1 Creating a Queue Interface
 * 
 */
/*
 * Purpose: A fixed-size queue class for characters. 
 */
class FixedQueue implements ICharQ {
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
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
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
    /*==================== END: METHODS ====================*/
} // class FixedQueue

/*
 * Purpose: A Circular queue.
 */
class CircularQueue implements ICharQ {
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
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
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
    /*==================== END: METHODS ====================*/
} // class CircularQueue

/*
 * Purpose: A dynamic queue.
 */
class DynQueue implements ICharQ {
    /*==================== START: FIELDS ====================*/
    private char q[];  // This array holds the queue.
    private int putLoc, getLoc;  // the put and get indices.
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /**
     * Purpose: Construct an empty queue give its size.
     */
    public DynQueue(int size) {
        q = new char[size];

        putLoc = getLoc = 0;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: Put a character into the queue.
     */
    public void put(char ch) {
        if(putLoc == q.length) {
            // increase the queue size
            char t[] = new char[q.length * 2];

            for(var i = 0; i < q.length; i++) {
                t[i] = q[i];
            }  // for loop: 

            q = t;
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
    /*==================== END: METHODS ====================*/
} // class DynQueue

/**
 * Purpose: A Circular dynamic queue.
 */
class CircDynQueue implements ICharQ {
    /*==================== START: FIELDS ====================*/
    private char q[];  // This array holds the queue.
    private int putLoc, getLoc;  // the put and get indices.
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /**
     * Purpose: Construct an empty queue given its size.
     */
    public CircDynQueue(int size) {
        q = new char[size+1];  // Allocate memory for queue.
        putLoc = getLoc = 0;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
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
         * 
         * At this moment increase the queue array length.
         */
        if(putLoc + 1 == getLoc | (putLoc == q.length - 1 & getLoc == 0)) {
            // increase the queue size
            char t[] = new char[q.length * 2];

            for(var i = 0; i < q.length; i++) {
                t[i] = q[i];
            }  // for loop: 

            q = t;
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
    /*==================== END: METHODS ====================*/
} // class CircDynQueue

/*
 * Purpose: Demonstrate the ICharQ interface.
 */
class IQDemo {
    public static void main(String[] args) {
        var q1 = new FixedQueue(10);
        var q2 = new DynQueue(5);
        var q3 = new CircularQueue(10);
        var q4 = new CircDynQueue(5);

        ICharQ iQ;

        char ch;
        int i;
        String hrLine = "--------------------------------------";

        iQ = q1;
        // Put some characters into fixed queue.
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }  // for loop: 

        // Show the queue.
        System.out.print("Contents of fixed queue: ");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }  // for loop: 
        System.out.println();
        System.out.println(hrLine);

        /* Reset demo */
        // Put some characters into fixed queue.
        for(i = 0; i < 10; i++) {
            if(i == 5) {
                iQ.reset();
            }  // if statement: 
            iQ.put((char) ('A' + i));
        }  // for loop: 

        // Show the queue.
        System.out.print("Reset queue: Contents of fixed queue: ");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }  // for loop: 
        System.out.println();
        System.out.println(hrLine);

        /* ----------------------------------- */
        iQ = q2;
        // Put some characters into dynamic queue.
        for(i = 0; i < 10; i++) {
            iQ.put((char)('Z' - i));
        }  // for loop: 

        // Show the queue.
        System.out.print("Contents of dynamic queue: ");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }  // for loop: 
        System.out.println();
        System.out.println(hrLine);

        iQ = q3;
        // Put some characters into circular queue.
        for(i = 0; i < 10; i++) {
            iQ.put((char)('A' + i));
        }  // for loop: 

        // Show the queue.
        System.out.print("Contents of circular queue: ");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }  // for loop: 
        System.out.println();
        System.out.println(hrLine);

        // put more characters into circular queue.
        for(i = 10; i < 20; i++) {
            iQ.put((char)('A' + i));
        }  // for loop: 

        // Show the queue.
        System.out.print("Contents of circular queue: ");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }  // for loop: 
        System.out.println();
        System.out.println(hrLine);
        System.out.println("\nStore and consume from circular queue.");
        // Store in and consume from circular queue.
        for(i = 0; i < 20; i++) {
            iQ.put((char)('A' + i));
            ch = iQ.get();

            System.out.print(ch);
        }  // for loop:
        System.out.println(); 
        System.out.println(hrLine);
        
        /********************************************** */
        iQ = q4;
        // Put some characters into circular queue.
        for(i = 0; i < 10; i++) {
            iQ.put((char)('A' + i));
        }  // for loop: 

        // Show the queue.
        System.out.print("Contents of circular dynamic queue: ");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }  // for loop: 
        System.out.println();
        System.out.println(hrLine);

        // put more characters into circular dynamic queue.
        for(i = 10; i < 20; i++) {
            iQ.put((char)('A' + i));
        }  // for loop: 

        // Show the queue.
        System.out.print("Contents of circular dynamic queue: ");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }  // for loop: 
        System.out.println();
        System.out.println(hrLine);
        System.out.println("\nStore and consume from circular dynamic queue.");
        // Store in and consume from circular dynamic queue.
        for(i = 0; i < 20; i++) {
            iQ.put((char)('A' + i));
            ch = iQ.get();

            System.out.print(ch);
        }  // for loop:
        System.out.println(); 
    }  // main(String[])
}  // class IQDemo
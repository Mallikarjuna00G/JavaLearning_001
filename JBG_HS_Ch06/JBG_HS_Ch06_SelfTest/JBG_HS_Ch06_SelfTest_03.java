/**
 * File: JBG_HS_Ch06_SelfTest_03.java
 * 
 * Purpose: Implement and demonstrate stack.
 */
/*  
 * Purpose: 
 */
class Stack {
    // these members are now private
    private char[] q;  // this array holds the queue.
    private int topOfStack;  // The put and get indices

    Stack(int size) {
        q = new char[size];  // allocate memory for queue
        topOfStack = 0;
    }  // Constructor

    /*
     * Purpose: Construct a Stack from a Stack.
     */
    public Stack(Stack ob) {
        topOfStack = ob.topOfStack;
        q = new char[ob.q.length];

        // copy elements
        for(var i = 0; i < topOfStack; i++) {
            q[i] = ob.q[i];
        }  // for loop: 
    } // Constructor 

    /*
     * Purpose: Construct a Stack with initial values.
     */
    public Stack(char a[]) {
        topOfStack = 0;
        q = new char[a.length];

        for(var i = 0; i < a.length; i++) {
            put(a[i]);
        }  // for loop: 
    } // Constructor 

    // method purpose: put a character into the queue
    void put(char ch) {
        if(topOfStack == q.length) {
            System.out.println("  -- Stack is full.");
            return;
        }  // if statement: 
        q[topOfStack++] = ch;
    } // method put

    // method purpose: get a character from the queue.
    char get() {
        if(topOfStack == 0) {
            System.out.println("  -- Stack is empty.");
            return (char) 0;
        }  // if statement: 
        
        return q[--topOfStack];
    } // method get
} // class Stack

// Demonstrate the Stack class.
class JBG_HS_Ch06_SelfTest_03 {
    public static void main(String[] args) {
        // Construct 10-element empty queue
        var q1 = new Stack(10);
        
        char[] name = {'P', 'r', 'e', 'm', 'i', 'k', 'a'};
        // Construct queue from array
        var q2 = new Stack(name);

        char ch;
        int i;

        // put some characters into q1
        for(i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }  // for loop: 

        // Construct Stack from another Stack.
        var q3 = new Stack(q1);

        // Show the queues.
        System.out.print("Contents of q1: ");
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
}  // class JBG_HS_Ch06_SelfTest_03
/**
 * File: Stack.java
 * @author Mallikarjuna00G
 * Purpose: A stack class for characters.
 */
/**
 * Purpose: 
 */
class Stack {
    private char[] stck;  // This array holds the stack.
    private int topOfStack;  // Top of stack

    /**
     * Purpose: Construct an empty stack given its size.
     */
    Stack(int size) {
        stck = new char[size];  // Allocate memory for stack.
        topOfStack = 0;
    }  // Constructor 

    /**
     * Purpose: Construct stack from stack.
     */
    Stack(Stack ob) {
        topOfStack = ob.topOfStack;
        stck = new char[ob.stck.length];

        // copy elements
        for(var i = 0; i < topOfStack; i++) {
            stck[i] = ob.stck[i];
        }  // for loop: 
    }  // Constructor 

    /**
     * Purpose: Construct a stack with initial values.
     */
    Stack(char a[]) {
        stck = new char[a.length];

        for(var i = 0; i < a.length; i++) {
            try {
                /*
                 *Purpose: 
                 */
                push(a[i]);
            }  // try statement
            catch(StackFullException exc) {
                /*
                 *Purpose: 
                 */
                System.out.println(exc);
            }  // catch exception type StackFullException
        }  // for loop: 
    }  // Constructor 

    /**
     * Purpose: Push characters on to the stack.
     */
    void push(char ch) 
        throws StackFullException {
        if(topOfStack == stck.length) {
            throw new StackFullException(stck.length);
        }  // if statement: 
        stck[topOfStack++] = ch;
    }  // method push

    /**
     * Purpose: Pop a character from the stack.
     */
    char pop() 
        throws StackEmptyException {
        if(topOfStack == 0) {
            throw new StackEmptyException();
        }  // if statement: 
        return stck[--topOfStack];
    }  // method pop
}  // class Stack
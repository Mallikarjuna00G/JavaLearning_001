/**
 * File: IQDemo.java
 * @author Mallikarjuna00G
 * Purpose: Try This 8­-1 Creating a Queue Interface
 * 
 */
import qpack.*;
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
        
        /* Demonstrate copy of contents from one form of queue to another */
        System.out.println("Re-initializing source queue before copy: ");
        iQ = q1;
        iQ.reset();
        for(i = 0; i < 10; i++) {
            iQ.put((char)(i + 'A'));
        }  // for loop: 
        System.out.println("Copying queue: ");
        ICharQ.copyQueue(q1, q3, 2, 6);
        System.out.print("Contents of circular queue after copy: ");
        for(i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }  // for loop: 
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
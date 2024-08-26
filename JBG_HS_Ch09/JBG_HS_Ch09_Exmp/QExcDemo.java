/**
 * File: QExcDemo.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate the queue exceptions.
 */
/**
 * Purpose: 
 */
class QExcDemo {
    public static void main(String[] args) {
        var q = new FixedQueue(10);
        char ch;
        int i;

        try {
            /*
             *Purpose: Overrun the queue.
             */
            for(i = 0; i < 15; i++) {
                ch = (char)('A' + i);
                System.out.print("Attempting to store : " + ch);
                q.put(ch);
                System.out.print(" - OK\n");
            }  // for loop: 
            System.out.println();
        }  // try statement
        catch(QueueFullException exc) {
            /*
             *Purpose: 
             */
            System.out.println(exc);
        }  // catch exception type QueueFullException
        System.out.println();

        try {
            /*
             *Purpose: Empty the queue.
             */
            for(i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }  // for loop: 
        }  // try statement
        catch(QueueEmptyException exc) {
            /*
             *Purpose: 
             */
            System.out.println(exc);
        }  // catch exception type QueueEmptyException
    }  // main(String[])
}  // class QExcDemo
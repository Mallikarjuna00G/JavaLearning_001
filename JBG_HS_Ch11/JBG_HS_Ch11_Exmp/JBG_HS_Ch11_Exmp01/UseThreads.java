/**
 * File: UseThreads.java
 * @author Mallikarjuna00G
 * Purpose: Create a thread by implementing a runnable.
 */
/**
 * Purpose: Objects of MyThread can be run in their own threads because
 * MyThread implements Runnable.
 */
class MyThread implements Runnable {
    String thrdName;

    MyThread(String thrdName) {
        this.thrdName = thrdName;
    }

    /**
     * Purpose: Entry point of this thread.
     */
    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            /**
             * Purpose: 
             */
            for(var count = 0; count < 10; count++) {
                /**
                 * for: 
                 */
                Thread.sleep(400);
                System.out.println("In thread " + thrdName + ", count is " + count);
            }  // for loop: 
        }  // try statement
        catch(InterruptedException exc) {
            /**
             * Purpose: 
             */
            System.out.println(thrdName + " interrupted.");
        }  // catch exception type InterrupterException
        System.out.println(thrdName + " terminating.");
    }  // method run
}  // class MyThread

/**
 * Purpose: 
 */
class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // First construct a MyThread object.
        var mt = new MyThread("Child #1");

        // Next, construct a thread from that object.
        var newThread = new Thread(mt);

        // Finally, start execution of the thread.
        newThread.start();

        for(var i = 0; i < 50; i++) {
            /**
             * for: 
             */
            System.out.print(".");
            try {
                /**
                 * Purpose: 
                 */
                Thread.sleep(100);  // This is applicable for main thread.
            }  // try statement
            catch(InterruptedException exc) {
                /**
                 * Purpose: 
                 */
                System.out.println("Main thread interrupted.");
            }  // catch exception type InterruptedException
        }  // for loop: 

        System.out.println("Main thread ending.");
    }  // main(String[])
}  // class UseThreads
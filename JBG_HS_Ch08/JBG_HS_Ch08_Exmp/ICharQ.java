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

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcFixedQueue
     * @param destCircularQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(FixedQueue srcFixedQueue, CircularQueue destCircularQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new FixedQueue(srcFixedQueue);
        destCircularQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destCircularQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destCircularQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcFixedQueue
     * @param destDynQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(FixedQueue srcFixedQueue, DynQueue destDynQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new FixedQueue(srcFixedQueue);
        destDynQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destDynQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destDynQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcFixedQueue
     * @param destCircDynQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(FixedQueue srcFixedQueue, CircDynQueue destCircDynQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new FixedQueue(srcFixedQueue);
        destCircDynQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destCircDynQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destCircDynQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcCircularQueue
     * @param destFixedQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(CircularQueue srcCircularQueue, FixedQueue destFixedQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new CircularQueue(srcCircularQueue);
        destFixedQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destFixedQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destFixedQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcCircularQueue
     * @param destDynQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(CircularQueue srcCircularQueue, DynQueue destDynQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new CircularQueue(srcCircularQueue);
        destDynQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destDynQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destDynQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcCircularQueue
     * @param destCircDynQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(CircularQueue srcCircularQueue, CircDynQueue destCircDynQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new CircularQueue(srcCircularQueue);
        destCircDynQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destCircDynQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destCircDynQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcDynQueue
     * @param destFixedQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(DynQueue srcDynQueue, FixedQueue destFixedQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new DynQueue(srcDynQueue);
        destFixedQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destFixedQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destFixedQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcDynQueue
     * @param destCircularQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(DynQueue srcDynQueue, CircularQueue destCircularQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new DynQueue(srcDynQueue);
        destCircularQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destCircularQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destCircularQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcDynQueue
     * @param destCircDynQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(DynQueue srcDynQueue, CircDynQueue destCircDynQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new DynQueue(srcDynQueue);
        destCircDynQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destCircDynQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destCircDynQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcCircDynQueue
     * @param destFixedQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(CircDynQueue srcCircDynQueue, FixedQueue destFixedQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new CircDynQueue(srcCircDynQueue);
        destFixedQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destFixedQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destFixedQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcCircDynQueue
     * @param destCircularQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(CircDynQueue srcCircDynQueue, CircularQueue destCircularQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new CircDynQueue(srcCircDynQueue);
        destCircularQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destCircularQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destCircularQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue

    /**
     * Purpose: Copy the contents from one form of queue to the other form of queue.
     * @param srcCircDynQueue
     * @param destDynQueue
     * @param startIndex
     * @param endIndex
     */
    static void copyQueue(CircDynQueue srcCircDynQueue, DynQueue destDynQueue, int startIndex, int endIndex) {
        // Creating a clone of the source queue so that its putLoc and getLoc won't get affected.
        var temp = new CircDynQueue(srcCircDynQueue);
        destDynQueue.reset();

        // To set the getLoc position to startIndex
        for(var i = 0; i < startIndex; i++) {
            var t = temp.get();
        }  // for loop: 

        // Copy the content now.
        for(var i = 0; i < destDynQueue.getQueueLength() && i < (endIndex - startIndex + 1); i++) {
            destDynQueue.put(temp.get());
        }  // for loop: 
    }  // copyQueue
}  // interface ICharQ
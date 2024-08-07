/**
 * File: FSDemo.java
 * 
 * Purpose: Demonstrate the fail-soft array.
 * 
 */
/*
 * Purpose: This class implements a "fail-soft" array which prevents
 * runtime errors.
 */
class FailSoftArray {
    private int[] a;  // reference to array;
    private int errVal;  // value to return if get() fails
    public int length;  // length is public

    /* 
     * Construct array give its size and the value to 
     * return if get() fails.
     */
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errVal = errv;
        length = size;
    }  // Constructor

    /*
     * Purpose: Return value at given index.
     */
    public int get(int index) {
        if(indexOK(index)) {
            return a[index];
        }  // if statement: 
        
        return errVal;
    } // method get

    /*
     * Purpose: Put a value at an index. Return false on failure.
     */
    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }  // if statement: 
        
        return false;
    } // method put

    /*
     * Purpose: Return true if index is within bounds.
     */
    private boolean indexOK(int index) {
        if(index >= 0 & index < length) {
            return true;
        }  // if statement: 
        
        return false;
    } // method indexOK
} // class FailSoftArray

/*
 * Purpose: Demonsrate the fail-soft array.
 */
class FSDemo {
    public static void main(String[] args) {
        var fs = new FailSoftArray(5, -1);
        int x;

        // Show quiet failures
        System.out.println("Fail quietly.");
        for(int i = 0; i < (fs.length * 2); i++) {
            fs.put(i,  i * 10);
        }  // for loop: 

        for(int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != -1) {
                System.out.print(x + " ");
            }  // if statement: 
        }  // for loop: 
        System.out.println();

        // Now, handle failures
        System.out.println("\nFail with error reports.");
        for(var i = 0; i < (fs.length * 2); i++) {
            if(!fs.put(i, i*10)) {
                System.out.println("Index " + i + " out-of-bounds");
            }  // if statement: 
        }  // for loop: 

        for(var i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != -1) {
                // if: 
                System.out.print(x + " ");
            } else {
                // else: 
                System.out.println("Index " + i + " out-of-bounds");
            }  // if-else statement: 
        }  // for loop: 
        System.out.println();
    }  // main(String[])
}  // class FSDemo
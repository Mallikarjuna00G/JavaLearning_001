/**
 * File: CallByValue.java
 * 
 * Purpose: Primitive types are passed by value.
 * 
 */
/*
 * Purpose: 
 */
class Test {
    /*
     * Purpose: This method causes no change to the arguments used in the call.
     */
    public void noChange(int i, int j) {
        i = i + j;
        j = -j;
    } // method functionName
} // class Test

/*
 * Purpose: 
 */
class CallByValue {
    public static void main(String[] args) {
        var ob = new Test();

        int a = 15, b = 20;
        System.out.println("a and b before call: " + a + " " + b);
        ob.noChange(a, b);
        System.out.println("a and b after call: " + a + " " + b);
    }  // main(String[])
}  // class CallByValue
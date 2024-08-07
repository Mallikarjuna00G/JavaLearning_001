/**
 * File: PassObRef.java
 * 
 * Purpose: Objects are passed through their references.
 * 
 */
/*
 * Purpose: 
 */
class Test {
    int a, b;

    /*
     * Purpose: 
     */
    public Test(int i, int j) {
        a = i;
        b = j;
    } // Constructor
    
    /*
     * Purpose: Pass an object. Now, ob.a and ob.b in object used in the call will be changed.
     */
    public void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    } // method change
} // class Test

/*
 * Purpose: 
 */
class PassObRef {
    public static void main(String[] args) {
        var ob = new Test(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }  // main(String[])
}  // class PassObRef
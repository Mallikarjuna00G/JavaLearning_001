/**
 * File: Override.java
 * @author Mallikarjuna00G
 * Purpose: Method overriding.
 * 
 */
/*
 * Purpose: 
 */
class A {
    /*==================== START: FIELDS ====================*/
    int i, j;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: Display i and j
     */
    public void show() {
        System.out.println("i and j: " + i + " " + j);
    } // method show
    /*==================== END: METHODS ====================*/
} // class A

/*
 * Purpose: 
 */
class B extends A {
    /*==================== START: FIELDS ====================*/
    int k;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    public B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: 
     */
    public void show() {
        System.out.println("k: " + k);
    } // method show
    /*==================== END: METHODS ====================*/
} // class Bextends  A

/*
 * Purpose: 
 */
class Override {
    public static void main(String[] args) {
        var subOb = new B(1, 2, 3);

        subOb.show();  // This calls show() in B.
    }  // main(String[])
} // class Override
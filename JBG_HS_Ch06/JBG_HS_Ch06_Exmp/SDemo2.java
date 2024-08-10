/**
 * File: SDemo2.java
 * 
 * Purpose: Use a static method.
 * 
 */
/*
 * Purpose: 
 */
class StaticMeth {
    static int val = 1024;  // a static variable

    /*
     * Purpose: a static method
     */
    public static int valDiv2() {
        return val/2;
    } // method valDiv2
} // class StaticMeth

/*
 * Purpose: 
 */
class SDemo2 {
    public static void main(String[] args) {
        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

        StaticMeth.val = 4;
        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
        
    }  // main(String[])
}  // class SDemo2
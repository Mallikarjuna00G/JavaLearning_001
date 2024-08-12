/**
 * File: JBG_HS_Ch06_SelfTest_13.java
 * 
 * Purpose: varargs 'sum' method.
 * 
 */
/*
 * Purpose: 
 */
class JBG_HS_Ch06_SelfTest_13 {
    /*
     * Purpose: varargs method
     */
    public static int sum(int ... nums) {
        int s = 0;
        for(int item: nums) {
            s += item;
        }  // for-each loop: 
        return s;
    } // method sum

    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, 3, 4, 5, 6, 7, 8, 9: " + sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Sum of 1, 2, -3, 4, -5, 6, -7, 8, 9: " + sum(1, 2, -3, 4, -5, 6, -7, 8, 9));
        System.out.println("Sum of -1, -2, -3, -4, 5, 6, 7, 8, 9: " + sum(-1, -2, -3, -4, 5, 6, 7, 8, 9));
    }  // main(String[])
    
}  // class JBG_HS_Ch06_SelfTest_13
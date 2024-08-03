/**
 * File: ArrayErr.java
 * 
 * Purpose: Demonstrate an array overrun.
 * 
 */
class ArrayErr {
    public static void main(String[] args) {
        int sample[] = new int[10];

        for(int i = 0; i < 100; i++) {
            sample[i] = i;
        }  // for loop: 
    }  // main(String[])
}  // class ArrayErr
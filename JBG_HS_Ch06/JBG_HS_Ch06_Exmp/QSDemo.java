/**
 * File: QSDemo.java
 * 
 * Purpose: Try This 6-3: A simple version of the quicksort.
 * 
 */
/*
 * Purpose: 
 */
class Quicksort {
    /*
     * Purpose: Set up a call to the actual Quicksort method.
     */
    public static void qsort(char[] items) {
        qs(items, 0, items.length-1);
    } // method qsort

    /*
     * Purpose: A recursive version of Quicksort for characters.
     */
    public static void qs(char[] items, int left, int right) {
        int i, j;
        char x, y;

        i = left;
        j = right;
        x = items[(left + right) / 2];

        do {
            while((items[i] < x) && (i < right)) {
                i++;
            }  // while loop: 
            while((x < items[j]) && (j > left)) {
                j--;
            }  // while loop: 

            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }  // if statement: 
        } while(i <= j);  // do-while loop: 

        if(left < j) {
            qs(items, left, j);
        }  // if statement: 
        if(i < right) {
            qs(items, i, right);
        }  // if statement: 
    } // method qs
} // class Quicksort

/*
 * Purpose: 
 */
class QSDemo {
    public static void main(String[] args) {
        char[] a = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("Original array: ");
        for(i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }  // for loop: 
        
        System.out.println();

        // now, sort the array
        Quicksort.qsort(a);

        System.out.print("Sorted array: ");
        for(i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }  // for loop: 
        System.out.println();
    }  // main(String[])
}  // class QSDemo
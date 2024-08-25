/**
 * File: Series.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate an interface.
 * 
 */
public interface Series {
    int getNext();  // Reeturn next number in series.
    void reset();  // restart
    void setStart(int startValue);  // Set starting value

    /**
     * Purpose: Return an array that contains the next n elements
     * in the series beyond the current element.
     */
    default int[] getNextArray(int n) {
        return getArray(n);
    }  // method getNextArray

    /**
     * Purpose: Return an array that contains the next n elements
     * in the series, after skipping elements.
     */
    default int[] skipAndGetNextArray(int skip, int n) {
        // Skip the specified number of elements.
        getArray(skip);

        return getArray(n);
    }  // method skipAndGetNextArray

    /**
     * Purpose: A private method that returns an array containing
     * the next n elements.
     */
    private int[] getArray(int n) {
        int[] vals = new int[n];

        for(var i = 0; i < n; i++) {
            vals[i] = getNext();
        }  // for loop: 

        return vals;
    }  // method getArray
}  // interface Series


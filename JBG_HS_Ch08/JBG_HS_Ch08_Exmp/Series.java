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
        int[] vals = new int[n];

        for(var i = 0; i < n; i++) {
            vals[i] = getNext();
        }  // for loop: 

        return vals;
    }  // method getNextArray
}  // interface Series


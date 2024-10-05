/**
 * Parts of the for can be empty (initialization).
 * 
 * Call this file "Empty2.java".
 */
class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0;  // Move initialization out of the loop
        for(; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;  // increment loop control var
        }
    }
}

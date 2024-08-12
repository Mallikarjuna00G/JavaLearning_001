/**
 * File: JBG_HS_Ch06_SelfTest_06.java
 * 
 * Purpose: Print the String backwards.
 * 
 */
/*
 * Purpose: 
 */
class Backwards {
    String str;

    /*
     * Purpose: 
     */
    public Backwards(String s) {
        str = s;
    } // Constructor 

    /*
     * Purpose: Display backwards.
     */
    public void displayBackwards() {
        backwardMethod(str.length()-1);
    } // method displayBackwards

    /*
     * Purpose: 
     */
    private void backwardMethod(int index) {
        if(index < 0) {
            return;
        }  // if statement: 

        System.out.print(str.charAt(index));
        backwardMethod(--index);
    } // method backwardMethod

    /*
     * Purpose: Display the string as is.
     */
    public void displayAsIs() {
        System.out.println(str);
    } // method displayAsIs
} // class Backwards

/*
 * Purpose: 
 */
class JBG_HS_Ch06_SelfTest_06 {
    public static void main(String[] args) {
        var ob = new Backwards("Lack of knowledge lead to suffering.");

        System.out.println("Display the string as is: ");
        ob.displayAsIs();

        System.out.println("Display the string in backwards: ");
        ob.displayBackwards();

        System.out.println();
    }  // main(String[])
}  // class JBG_HS_Ch06_SelfTest_06
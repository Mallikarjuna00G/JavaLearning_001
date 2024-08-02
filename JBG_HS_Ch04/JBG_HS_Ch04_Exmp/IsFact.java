/**
 * File: IsFact.java
 * 
 * Purpose: More than one parameter to a method.
 * 
 */
class Factor {
    boolean isFactor(int a, int b) {
        if((b % a) == 0) {
            // if: 
            return true;
        } else {
            // else: 
            return false;
        }  // if-else statement: 
    }
} // class Factor
class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        if(x.isFactor(2, 20)) {
            System.out.println("2 is a factor.");
        }  // if statement: 
        if(x.isFactor(3, 20)) {
            System.out.println("This won't be displayed.");
        }  // if statement: 
    }  // main(String[])
}  // class IsFact
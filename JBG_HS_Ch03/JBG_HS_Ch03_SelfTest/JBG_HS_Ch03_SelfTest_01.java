/**
 * SelfTest01
 * 
 * Call this file "JBG_HS_Ch03_SelfTest_01.java".
 */
class JBG_HS_Ch03_SelfTest_01 {
    public static void main(String[] args)
        throws java.io.IOException {
        char terminatingCharacter = '.', ch;
        int numberOfSpaces = 0;

        System.out.println("Enter a statement ending with a period \nto know the number of spaces in the statement: ");
        
        while((ch = (char) System.in.read()) != '.') {
            if(ch == ' ')
                numberOfSpaces++;
        }

        System.out.println("Number of spaces in your statement: " + numberOfSpaces);
    } 
}

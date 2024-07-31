/**
 * SelfTest10
 * 
 * Call this file "JBG_HS_Ch03_SelfTest_10.java".
 */
class JBG_HS_Ch03_SelfTest_10 {
    public static void main(String[] args)
        throws java.io.IOException {
        char terminatingCharacter = '.', ch;
        int numberOfCaseChanges = 0;

        System.out.println("Enter characters to change the case of the letters (put a period at the end): ");
        
        while((ch = (char) System.in.read()) != terminatingCharacter) {
            if(ch >= 'A' && ch <= 'Z') {
                System.out.print((char)(ch + 32));
                numberOfCaseChanges++;
            } else if(ch >= 'a' && ch <= 'z') {
                System.out.print((char)(ch - 32));
                numberOfCaseChanges++;
            } else System.out.print(ch);
        }
        System.out.println();

        System.out.println("Number of case changes: " + numberOfCaseChanges);
    } 
}

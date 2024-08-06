/**
 * File: StrOps.java
 * 
 * Purpose: Some String Operations.
 * 
 */
class StrOps {
    public static void main(String[] args) {
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful.";

        int result, idx;
        char ch;

        System.out.println("Length of str1: " + str1.length());

        // display str1, one char at a time.
        for(int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }  // for loop: 
        System.out.println();

        if(str1.equals(str2)) {
            // if: 
            System.out.println("str1 equals str2.");    
        } else {
            // else: 
            System.out.println("str1 does not equal str2.");
        }  // if-else statement: 

        if(str1.equals(str3)) {
            // if: 
            System.out.println("str1 equals str3.");
        } else {
            // else: 
            System.out.println("str1 does not equal str3.");
        }  // if-else statement: 

        result = str1.compareTo(str3);
        if(result == 0) {
            // if: 
            System.out.println("str1 and str3 are equal.");
        } else if(result < 0) {
            // else if: 
            System.out.println("str1 is less than str3.");
        } else {
            // else: 
            System.out.println("str1 is greater than str3.");
        }  // if-else-if statement: 

        // assign a new string to str2
        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Index of first occurence of One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of last occurence of One: " + idx);
    }  // main(String[])
}  // class StrOps
/**
 * File: SubStr.java
 * 
 * Purpose: Use SubString().
 * 
 */
class SubStr {
    public static void main(String[] args) {
        String orgStr = "Java makes the web move.";

        // construct a substring
        String subStr = orgStr.substring(5, 18);

        System.out.println("orgStr: " + orgStr);
        System.out.println("subStr: " + subStr);
    }  // main(String[])
}  // class SubStr
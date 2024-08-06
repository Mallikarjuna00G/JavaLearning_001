/**
 * File: Encode.java
 * 
 * Purpose: Use XOR to encode and decode a message.
 * 
 */
class Encode {
    public static void main(String[] args) {
        var msg = "This is a test";
        var encMsg = "";
        var decMsg = "";
        var key = 88;

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        for(var i = 0; i < msg.length(); i++) {
            encMsg = encMsg + (char)(msg.charAt(i) ^ key);
        }  // for loop: 

        System.out.print("Encoded message: ");
        System.out.println(encMsg);

        // decode the message
        for(var i = 0; i < msg.length(); i++) {
            decMsg = decMsg + (char)(encMsg.charAt(i) ^ key);
        }  // for loop: 

        System.out.print("Decoded message: ");
        System.out.println(decMsg);

    }  // main(String[])
}  // class Encode
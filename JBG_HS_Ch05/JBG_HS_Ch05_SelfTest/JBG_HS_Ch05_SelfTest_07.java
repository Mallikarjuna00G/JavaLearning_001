/**
 * File: JBG_HS_Ch05_SelfTest_07.java
 * 
 * Purpose: Use XOR to encode and decode a message.
 * Use an eight­-character string as the key.
 * 
 */
class JBG_HS_Ch05_SelfTest_07 {
    public static void main(String[] args) {
        var msg = "Idu yaaru bareda katheyo.. nanagaagi banda vyatheyo..";
        var encMsg = "";
        var decMsg = "";
        var key = "paasskey";

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        for(var i = 0; i < msg.length(); i++) {
            encMsg = encMsg + (char)(msg.charAt(i) ^ key.charAt(i % key.length()));
        }  // for loop: 

        System.out.print("Encoded message: ");
        System.out.println(encMsg);

        // decode the message
        for(var i = 0; i < msg.length(); i++) {
            decMsg = decMsg + (char)(encMsg.charAt(i) ^ key.charAt(i % key.length()));
        }  // for loop: 

        System.out.print("Decoded message: ");
        System.out.println(decMsg);

    }  // main(String[])
}  // class JBG_HS_Ch05_SelfTest_07
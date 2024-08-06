/**
 * File: StringSwitch.java
 * 
 * Purpose: Use string to control a switch statement.
 * 
 */
class StringSwitch {
    public static void main(String[] args) {
        String command = "cancel";

        switch(command) {
            case "connect":  // case: 
                System.out.println("Connecting");
                break;
            case "cancel":  // case: 
                System.out.println("Cancelling");
                break;
            case "disconnect":  // case: 
                System.out.println("Disconnecting");
                break;
            default:  // caseDefault: 
                System.out.println("Command Error!");
                break;
        }  // switch statement: 
    }  // main(String[])
}  // class StringSwitch
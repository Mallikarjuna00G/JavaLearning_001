/**
 * File: FinalD.java
 * @author Mallikarjuna00G
 * Purpose: Return a string object.
 * 
 */
/*
 * Purpose: 
 */
class ErrorMsg {
    /*==================== START: FIELDS ====================*/
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String[] msgs = {
        "Output Error",
        "Inpout Error",
        "Disk Full",
        "Index Out-of-Bounds"
    };
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: 
     */
    public String getErrorMsg(int i) {
        if(i >= 0 & i < msgs.length) {
            // if: 
            return msgs[i];
        } else {
            // else: 
            return "Invalid Error Code";
        }  // if-else statement: 
    } // method getErrorMsg
    /*==================== END: METHODS ====================*/
} // class ErrorMsg

/*
 * Purpose: 
 */
class FinalD {
    public static void main(String[] args) {
        var err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }  // main(String[])
}  // class FinalD
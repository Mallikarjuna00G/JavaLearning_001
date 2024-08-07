/**
 * File: ErrMsg.java
 * 
 * Purpose: Return a string object.
 * 
 */
/*
 * Purpose: 
 */
class ErrorMsg {
    String[] msgs = {
        "Output Error", 
        "Input Error",
        "Disk Full",
        "Index Out-of-Bounds"
    };

    /*
     * Purpose: Return the error message.
     */
    public String getErrorMsg(int i) {
        if(i >= 0 & i < msgs.length) {
            // if: 
            return msgs[i];
        } else {
            // else: 
            return "Invalid error code";
        }  // if-else statement: 
    } // method getErrorMsg
} // class ErrorMsg

/*
 * Purpose: 
 */
class ErrMsg {
    public static void main(String[] args) {
        var err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }  // main(String[])
}  // class ErrMsg
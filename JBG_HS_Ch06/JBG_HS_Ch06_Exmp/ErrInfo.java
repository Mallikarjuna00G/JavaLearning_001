/**
 * File: ErrInfo.java
 * 
 * Purpose: Return a programmer-defined object.
 * 
 */
/*
 * Purpose: 
 */
class Err {
    String msg;  // error message
    int severity;  // code indicating severity of error
    
    /*
     * Purpose: 
     */
    public Err(String m, int s) {
        msg = m;
        severity = s;
    } // Constructor 
} // class Err

/*
 * Purpose: 
 */
class ErrorInfo {
    String[] msgs = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index-out-of-bounds"
    };
    int[] howBad = {3, 3, 2, 4};

    /*
     * Purpose: 
     */
    public Err getErrorInfo(int i) {
        if(i >= 0 & i < msgs.length) {
            // if: 
            return new Err(msgs[i], howBad[i]);
        } else {
            // else: 
            return new Err("Invalid Error Code", 0);
        }  // if-else statement: 
    } // method getErrorInfo
} // class ErrorInfo

/*
 * Purpose: 
 */
class ErrInfo {
    public static void main(String[] args) {
        var err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);

        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);
    }  // main(String[])
}  // class ErrInfo
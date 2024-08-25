/**
 * File: DefaultMethodDemo.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate default (interface) method.
 * 
 */

/**
 * Purpose: Implement MyIF
 */
class MyIFImp implements MyIF{
    /**
     * Purpose: Only getUserID() defined by MyIF needs to be implemented.
     * getAdminID() can be allowed to default.
     */
    public int getUserID() {
        return 100;
    }  // method getUserID
}  // class MyIFImp

/**
 * Purpose: Implement MyIF
 */
class MyIFImp2 implements MyIF{
    /**
     * Here, implementations for both getUserID() and getAdminID() are provided.
     */
    /**
     * Purpose: Provide User ID.
     */
    public int getUserID() {
        return 100;
    }  // method getUserID

    /**
     * Purpose: Overrride to provide different Admin ID.
     */
    public int getAdminID() {
        return 42;
    }  // method getAdminID
}  // class MyIFImp2


/**
 * Purpose: Use the default method.
 */
class DefaultMethodDemo {
    public static void main(String[] args) {
        var obj = new MyIFImp();

        /* Can call getUserID(), because it is 
         * explicitly implemented by MyIFImp:
         */
        System.out.println("User ID is " + obj.getUserID());

        /* Can also call getAdminID(), because of default
         * implementation.
         */
        System.out.println("Adminstrator ID is " + obj.getAdminID());

        var obj2 = new MyIFImp2();

        /* Can call getUserID(), because it is 
         * explicitly implemented by MyIFImp2:
         */
        System.out.println("User ID is " + obj2.getUserID());

        /* Can also call getAdminID(), because it is overriden
         */
        System.out.println("Adminstrator ID is " + obj2.getAdminID());
    }  // main(String[])
}  // class DefaultMethodDemo
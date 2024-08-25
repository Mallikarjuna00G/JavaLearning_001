/**
 * File: IConstD.java
 * @author Mallikarjuna00G
 * Purpose: Variables in interfaces demo.An interface that contains constants.
 * 
 */

/**
 * Purpose: An interface that contains constants.
 */
interface IConst {
    int MIN = 0;
    int MAX = 10;
    String ERRORMSG = "Boundary Error";
}  // Interface IConst

/**
 * Purpose: 
 */
class IConstD implements IConst{
    public static void main(String[] args) {
        int[] nums = new int[MAX];

        for(var i = MIN; i < 11; i++) {
            if(i >= MAX) {
                // if: 
                System.out.println(ERRORMSG);
            } else {
                // else: 
                nums[i] = i;
                System.out.print(nums[i] + " ");
            }  // if-else statement: 
        }  // for loop: 
    }  // main(String[])
}  // class IConstD
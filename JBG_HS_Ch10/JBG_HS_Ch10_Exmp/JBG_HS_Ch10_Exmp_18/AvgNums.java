/**
 * File: AvgNums.java
 * @author Mallikarjuna00G
 * Purpose: This program averages a list of numbers entered by the user.
 */
import java.io.*;
/**
 * Purpose: 
 */
class AvgNums {
    public static void main(String[] args) 
    throws IOException {
        // Create a BufferedReader using System.in.
        var br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.print("How many numbers will you enter: ");
        str = br.readLine();
        try {
            /**
             * Purpose: 
             */
            n = Integer.parseInt(str);  // Converting string to int.
        }  // try statement
        catch(NumberFormatException exc) {
            /**
             * Purpose: 
             */
            System.out.println("Invalid number format");
            n = 0;
        }  // catch exception type NumberFormatException

        System.out.println("Enter " + n + " values.");
        for(var i = 0; i < n; i++) {
            /**
             * for: 
             */
            System.out.print(": ");
            str = br.readLine();
            try {
                /**
                 * Purpose: 
                 */
                t = Double.parseDouble(str);
            }  // try statement
            catch(NumberFormatException exc) {
                /**
                 * Purpose: 
                 */
                System.out.println("Invalid format");
                t = 0.0;
            }  // catch exception type NumberFormatException
            sum += t;
        }  // for loop: 
        avg = sum / n;
        System.out.println("Average is " + avg);
    }  // main(String[])
}  // class AvgNums
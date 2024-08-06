/**
 * File: Phone.java
 * 
 * Purpose: A simple automated telephone directory.
 * 
 */
class Phone {
    public static void main(String[] args) {
        String[][] numbers = {
            {"Tom", "555-3322"},
            {"Mary", "555-8976"},
            {"Jon", "555-1037"},
            {"Rachel", "555-1400"}
        };
        int i;

        if(args.length != 1) {
            // if: number of command-line arguments not equal to 1.
            System.out.println("Usage: java phone <name>");
        } else {
            // else: 
            for(i = 0; i < numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }  // if statement: 
            }  // for loop: 
            if(i == numbers.length) {
                System.out.println("Name not found.");
            }  // if statement: 
        }  // if-else statement: 
    }  // main(String[])
}  // class Phone
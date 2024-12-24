/**
 * Using break with a label.
 * 
 * Call this file "Break4.java".
 */
class Break4 {
    public static void main(String[] args) {
        int i;

        for(i = 1; i < 4; i++) {
            one: {
                two: {
                    three: {
                        System.out.println("\ni is " + i);
                        if(i == 1) break one;
                        if(i == 2) break two;
                        if(i == 3) break three;

                        System.out.println("won't print");
                    }  // label three: control reaches here when `break three` is detected.
                    System.out.println("After block three.");
                }  // label two: control reaches here when `break two` is detected.
                System.out.println("After block two.");
            }  // label one: control reaches here when `break one` is detected.
            System.out.println("After block one.");
        }
        System.out.println("After for loop.");
    }
}

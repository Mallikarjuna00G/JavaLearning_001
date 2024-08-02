/**
 * File: HelpClassDemo.java
 * 
 * Purpose: Try This 4-1 Convert the help system from Try This 3-3 into a Help class.
 * 
 */
class Help {
    // method purpose: 
    void helpOn(int what) {
        switch(what) {
            case '1':  // if
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':  // switch
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("    case constant:");
                System.out.println("        statement sequence");
                System.out.println("        break;");
                System.out.println("}");
                break;
            case '3': // for
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration)");
                System.out.println("    statement;");
                break;
            case '4': // while
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '5':  // do-while
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println("    statement;");
                System.out.println("} while(condition);");
                break;
            case '6':  // break
                System.out.println("The break:\n");
                System.out.println("break; or break label");
                break;
            case '7':  // continue
                System.out.println("The continue:\n");
                System.out.println("continue; or continue label;");
                break;
        }  // switch
        System.out.println("--------------------------------\n");
        
        return;
    } // method helpOn

    // method purpose: 
    void showMenu() {
        System.out.println("Help on: ");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("  3. for");
        System.out.println("  4. while");
        System.out.println("  5. do-while");
        System.out.println("  6. break");
        System.out.println("  7. continue\n");
        System.out.print("Choose one (q to quit): ");
        
        return;
    } // method showMenu

    // method purpose: 
    boolean isValid(int ch) {
        if(ch < '1' | ch > '7' & ch != 'q') {
            // if: 
            return false;
        } else {
            // else: 
            return true;
        }  // if-else statement: 
    } // method isValid
} // class Help

class HelpClassDemo {
    public static void main(String[] args) 
        throws java.io.IOException {
        char choice, ignore;
        Help hlpObj = new Help();

        for(;;) {
            do {
                hlpObj.showMenu();                

                choice = (char) System.in.read();  // Get the user input

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while(!hlpObj.isValid(choice));

            if(choice == 'q') break;

            System.out.println("\n");
            
            hlpObj.helpOn(choice);
        }  // infinite for loop. 
    }
}  // class HelpClassDemo
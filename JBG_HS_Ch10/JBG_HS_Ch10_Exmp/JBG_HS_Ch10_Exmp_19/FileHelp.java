/**
 * File: FileHelp.java
 * @author Mallikarjuna00G
 * Purpose: Try This 10-2
 * 
 * Creating a Disk-Based Help System.
 */
import java.io.*;
/**
 * Purpose: The Help class opens a help file, searches for a topic,
 * and then displays the information associated with that topic.
 * Notice that it handles all I/O exceptions itself, avoiding the 
 * need for calling code to do so.
 */
class Help {
    /*==================== START: FIELDS ====================*/
    String helpFile;  // name of the file
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    Help(String fileName) {
        helpFile = fileName;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /**
     * Purpose: Display help on topic.
     */
    boolean helpOn(String what) {
        int ch;
        String topic, info;

        try(var helpRdr = new BufferedReader(new FileReader(helpFile))) {
            /**
             * Purpose: Open the help file.
             */
            do {
                /**
                 * do: Read characters until a # is found
                 */
                ch = helpRdr.read();

                // Now, see if topics match
                if(ch == '#') {
                    /**
                     * if: 
                     */
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0) {
                        /**
                         * if: found topic
                         */
                        do {
                            /**
                             * do: 
                             */
                            info = helpRdr.readLine();
                            if(info != null) {
                                /**
                                 * if: 
                                 */
                                System.out.println(info);
                            }  // if statement: 
                        } while((info != null) && (info.compareTo("") != 0));  // do-while loop: 
                        return true;
                    }  // if statement: 
                }  // if statement: 
            } while(ch != -1);  // do-while loop: 
        }  // try-with-resources statement
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            System.out.println("Error accessing help file.");
            return false;
        }  // catch exception type IOException
        return false;  // topic not found
    }  // method helpOn

    /**
     * Purpose: Get a help topic
     */
    String getSelection() {
        String topic = "";

        var br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter topic: ");
        try {
            /**
             * Purpose: 
             */
            topic = br.readLine();
        }  // try statement
        catch(IOException exc) {
            /**
             * Purpose: 
             */
            System.out.println("Error reading console.");
        }  // catch exception type IOException

        return topic;
    }  // method getSelection
    /*==================== END: METHODS ====================*/
}  // class Help
/**
 * Purpose: Demonstrate the file-based Help system.
 */
class FileHelp {
    public static void main(String[] args) {
        var hlpObj = new Help("helpFile.txt");
        String topic;

        System.out.println("Try this help system. Enter 'stop' to end.");

        do {
            /**
             * do: 
             */
            topic = hlpObj.getSelection();

            if(!hlpObj.helpOn(topic)) {
                /**
                 * if: 
                 */
                System.out.println("Topic not found.\n");
            }  // if statement: 
        } while(topic.compareTo("stop") != 0);  // do-while loop: 
    }  // main(String[])
}  // class FileHelp
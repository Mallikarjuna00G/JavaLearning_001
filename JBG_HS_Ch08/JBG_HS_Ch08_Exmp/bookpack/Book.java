/**
 * File: Book.java
 * @author Mallikarjuna00G
 * Purpose: Package access example.
 * Book recorded for public access.
 * 
 */
package bookpack;
/*
 * Purpose: 
 */
public class Book {
    /*==================== START: FIELDS ====================*/
    private String title;
    private String author;
    private int pubDate;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    public Book(String title, String author, int pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: 
     */
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    } // method show
    /*==================== END: METHODS ====================*/
} // class Book
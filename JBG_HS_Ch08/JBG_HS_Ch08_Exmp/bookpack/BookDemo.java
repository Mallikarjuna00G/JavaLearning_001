/**
 * File: BookDemo.java
 * @author Mallikarjuna00G
 * Purpose: A short package demonstration.
 * 
 */
package bookpack;
/*
 * Purpose: 
 */
class Book {
    /*==================== START: FIELDS ====================*/
    private String title;
    private String author;
    private int pubDate;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    Book(String title, String author, int pubDate) {
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
    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    } // method show
    /*==================== END: METHODS ====================*/
} // class Book

/*
 * Purpose: 
 */
class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2019);
        books[1] = new Book("Java: The Complete Reference", "Schildt", 2019);
        books[2] = new Book("Introducing JavaFX 8 Programming", "Schildt", 2015);
        books[3] = new Book("Red Storm Rising", "Clansy", 1986);
        books[4] = new Book("On the Road", "Kerouac", 1955);

        for(var i = 0; i < books.length; i++) {
            books[i].show();
        }  // for loop: 
    }  // main(String[])
}  // class BookDemo
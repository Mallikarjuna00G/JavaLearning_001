/**
 * File: ProtectDemo.java
 * @author Mallikarjuna00G
 * Purpose: Demonstrate protected.
 * 
 */
package bookpackext;

/*
 * Purpose: 
 */
class ExtBook extends bookpack.Book {
    /*==================== START: FIELDS ====================*/
    private String publisher;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    public ExtBook(String title, String author, int pubDate, String publisher) {
        super(title, author, pubDate);
        this.publisher = publisher;
    }  // Constructor
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    /*
     * Purpose: 
     */
    public String getPublisher() {
        return publisher;
    } // method getPublisher

    /*
     * Purpose: 
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    } // method setPublisher

    /* These are OK, because subclass (from other package) can access protected members of superclass */
    /*
     * Purpose: 
     */
    public String getTitle() {
        return title;
    } // method getTitle

    /*
     * Purpose: 
     */
    public void setTitle(String title) {
        this.title = title;
    } // method setTitle

    /*
     * Purpose: 
     */
    public String getAuthor() {
        return author;
    } // method getAuthor

    /*
     * Purpose: 
     */
    public void setAuthor(String author) {
        this.author = author;
    } // method setAuthor

    /*
     * Purpose: 
     */
    public int getPubDate() {
        return pubDate;
    } // method getPubDate

    /*
     * Purpose: 
     */
    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    } // method setPubDate
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: 
     */
    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    } // method show
    /*==================== END: METHODS ====================*/
} // class ExtBook

/*
 * Purpose: 
 */
class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];

        books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2019, "Oracle Press");
        books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2019, "Oracle Press");
        books[2] = new ExtBook("Introducing JavaFX 8 Programming", "Schildt", 2015, "Oracle Press");
        books[3] = new ExtBook("Red Storm Rising", "Clansy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");

        for(var i = 0; i < books.length; i++) {
            books[i].show();
        }  // for loop: 

        // Find books by author
        System.out.println("Showing all books by Schildt");
        for(var i =  0; i < books.length; i++) {
            if(books[i].getAuthor() == "Schildt") {
                System.out.println(" - " + books[i].getTitle());
            }  // if statement: 
        }  // for loop: 
        // books[0].title = "test title";  // Error - protected member not accessible from non-subclass from any package.
    }  // main(String[])
}  // class ProtectDemo
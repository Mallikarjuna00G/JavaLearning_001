/**
 * File: UseBook.java
 * @author Mallikarjuna00G
 * Purpose: Import package demonstration.
 * 
 */
package bookpackext;
import bookpack.*;

/*
 * Purpose: 
 */
class UseBook {
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
}  // class UseBook.Book
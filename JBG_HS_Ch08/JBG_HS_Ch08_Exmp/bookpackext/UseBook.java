/**
 * File: Usebookpack.Book.java
 * @author Mallikarjuna00G
 * Purpose: A short package demonstration.
 * 
 */
package bookpackext;
/*
 * Purpose: 
 */
class UseBook {
    public static void main(String[] args) {
        bookpack.Book[] books = new bookpack.Book[5];

        books[0] = new bookpack.Book("Java: A Beginner's Guide", "Schildt", 2019);
        books[1] = new bookpack.Book("Java: The Complete Reference", "Schildt", 2019);
        books[2] = new bookpack.Book("Introducing JavaFX 8 Programming", "Schildt", 2015);
        books[3] = new bookpack.Book("Red Storm Rising", "Clansy", 1986);
        books[4] = new bookpack.Book("On the Road", "Kerouac", 1955);

        for(var i = 0; i < books.length; i++) {
            books[i].show();
        }  // for loop: 
    }  // main(String[])
}  // class UseBook.Book
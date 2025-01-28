package day01linkedlist.doublylinkedlist.librarymanagementsystem;

class Book {
    String title;
    String author;
    String genre;
    int bookID;
    boolean isAvailable;

    public Book(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Book ID: " + bookID + ", Available: " + isAvailable;
    }
}

package day01linkedlist.doublylinkedlist.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();

        // Adding books
        lms.addBookAtEnd(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 1, true));
        lms.addBookAtEnd(new Book("1984", "George Orwell", "Dystopian", 2, true));
        lms.addBookAtEnd(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 3, true));

        // Display books forward
        lms.displayBooksForward();

        // Display books reverse
        lms.displayBooksReverse();

        // Add book at specific position
        lms.addBookAtPosition(new Book("Moby Dick", "Herman Melville", "Adventure", 4, false), 2);
        lms.displayBooksForward();

        // Remove a book by ID
        lms.removeBookByID(2);
        lms.displayBooksForward();

        // Search books
        lms.searchBook("Harper Lee");
        lms.searchBook("1984");

        // Update availability status
        lms.updateAvailabilityStatus(1, false);
        lms.displayBooksForward();

        // Count books
        System.out.println("Total books in library: " + lms.countBooks());
    }
}


package day01linkedlist.doublylinkedlist.librarymanagementsystem;

class LibraryManagementSystem {
    private Node head;
    private Node tail;

    // Add a book at the beginning
    public void addBookAtBeginning(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Book added at the beginning.");
    }

    // Add a book at the end
    public void addBookAtEnd(Book book) {
        Node newNode = new Node(book);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Book added at the end.");
    }

    // Add a book at a specific position
    public void addBookAtPosition(Book book, int position) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = new Node(book);
        if (position == 1) {
            addBookAtBeginning(book);
            return;
        }

        Node current = head;
        int currentPosition = 1;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            addBookAtEnd(book);
        } else {
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
            if (newNode.next == null) {
                tail = newNode;
            }
            System.out.println("Book added at position " + position + ".");
        }
    }

    // Remove a book by Book ID
    public void removeBookByID(int bookID) {
        Node current = head;

        while (current != null && current.book.bookID != bookID) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Book not found.");
            return;
        }

        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (current == tail) {
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Book removed: " + current.book.title);
    }

    // Search for a book by Title or Author
    public void searchBook(String titleOrAuthor) {
        Node current = head;
        boolean found = false;

        while (current != null) {
            if (current.book.title.equalsIgnoreCase(titleOrAuthor) ||
                    current.book.author.equalsIgnoreCase(titleOrAuthor)) {
                System.out.println(current.book);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No books found matching the criteria.");
        }
    }

    // Update a book's availability status
    public void updateAvailabilityStatus(int bookID, boolean newStatus) {
        Node current = head;

        while (current != null && current.book.bookID != bookID) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Book not found.");
            return;
        }

        current.book.isAvailable = newStatus;
        System.out.println("Updated availability status for book: " + current.book.title);
    }

    // Display books in forward order
    public void displayBooksForward() {
        Node current = head;
        System.out.println("Books in forward order:");
        while (current != null) {
            System.out.println(current.book);
            current = current.next;
        }
    }

    // Display books in reverse order
    public void displayBooksReverse() {
        Node current = tail;
        System.out.println("Books in reverse order:");
        while (current != null) {
            System.out.println(current.book);
            current = current.prev;
        }
    }

    // Count the total number of books
    public int countBooks() {
        Node current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}

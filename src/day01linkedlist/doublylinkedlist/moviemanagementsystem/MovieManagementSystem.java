package day01linkedlist.doublylinkedlist.moviemanagementsystem;

class MovieManagementSystem {
    private Node head;
    private Node tail;

    // Add a movie at the beginning
    public void addMovieAtBeginning(Movie movie) {
        Node newNode = new Node(movie);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Movie added at the beginning.");
    }

    // Add a movie at the end
    public void addMovieAtEnd(Movie movie) {
        Node newNode = new Node(movie);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Movie added at the end.");
    }

    // Add a movie at a specific position
    public void addMovieAtPosition(Movie movie, int position) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = new Node(movie);
        if (position == 1) {
            addMovieAtBeginning(movie);
            return;
        }

        Node current = head;
        int currentPosition = 1;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            addMovieAtEnd(movie);
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
            System.out.println("Movie added at position " + position + ".");
        }
    }

    // Remove a movie by title
    public void removeMovieByTitle(String title) {
        Node current = head;

        while (current != null && !current.movie.title.equalsIgnoreCase(title)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Movie not found.");
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

        System.out.println("Movie removed: " + title);
    }

    // Search for a movie by director or rating
    public void searchMovie(String directorOrRating) {
        boolean isRating;
        double rating = 0;
        try {
            rating = Double.parseDouble(directorOrRating);
            isRating = true;
        } catch (NumberFormatException e) {
            isRating = false;
        }

        Node current = head;
        boolean found = false;

        while (current != null) {
            if ((isRating && current.movie.rating == rating) ||
                    (!isRating && current.movie.director.equalsIgnoreCase(directorOrRating))) {
                System.out.println(current.movie);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No movies found matching the criteria.");
        }
    }

    // Display movies in forward order
    public void displayMoviesForward() {
        Node current = head;
        System.out.println("Movies in forward order:");
        while (current != null) {
            System.out.println(current.movie);
            current = current.next;
        }
    }

    // Display movies in reverse order
    public void displayMoviesReverse() {
        Node current = tail;
        System.out.println("Movies in reverse order:");
        while (current != null) {
            System.out.println(current.movie);
            current = current.prev;
        }
    }

    // Update a movie's rating by title
    public void updateMovieRating(String title, double newRating) {
        Node current = head;

        while (current != null && !current.movie.title.equalsIgnoreCase(title)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Movie not found.");
            return;
        }

        current.movie.rating = newRating;
        System.out.println("Updated rating for movie: " + title);
    }
}
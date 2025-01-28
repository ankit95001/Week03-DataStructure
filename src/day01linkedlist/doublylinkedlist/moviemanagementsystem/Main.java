package day01linkedlist.doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieManagementSystem movie = new MovieManagementSystem();

        // Adding movies
        movie.addMovieAtEnd(new Movie("Inception", "Christopher Nolan", 2010, 9.0));
        movie.addMovieAtEnd(new Movie("The Godfather", "Francis Ford Coppola", 1972, 9.2));
        movie.addMovieAtEnd(new Movie("The Dark Knight", "Christopher Nolan", 2008, 9.1));

        // Display movies forward
        movie.displayMoviesForward();

        // Display movies reverse
        movie.displayMoviesReverse();

        // Add movie at specific position
        movie.addMovieAtPosition(new Movie("Interstellar", "Christopher Nolan", 2014, 8.6), 2);
        movie.displayMoviesForward();

        // Remove a movie by title
        movie.removeMovieByTitle("The Dark Knight");
        movie.displayMoviesForward();

        // Search movies
        movie.searchMovie("Christopher Nolan");
        movie.searchMovie("9.2");

        // Update movie rating
        movie.updateMovieRating("Inception", 9.5);
        movie.displayMoviesForward();
    }
}

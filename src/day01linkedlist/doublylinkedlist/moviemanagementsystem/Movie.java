package day01linkedlist.doublylinkedlist.moviemanagementsystem;

class Movie {
    String title;
    String director;
    int yearOfRelease;
    double rating;

    public Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Director: " + director + ", Year: " + yearOfRelease + ", Rating: " + rating;
    }
}

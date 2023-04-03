import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
    private String title;
    private String director;
    private int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int compareTo(Movie m) {
        return m.releaseYear - this.releaseYear;
    }
}

class Moviesdemo {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("The Shawshank Redemption", "Frank Darabont", 1994));
        movies.add(new Movie("The Godfather", "Francis Ford Coppola", 1972));
        movies.add(new Movie("The Dark Knight", "Christopher Nolan", 2008));
        Collections.sort(movies);
        for (Movie m : movies) {
            System.out.println(m.getTitle() + " (" + m.getReleaseYear() + ") - " + m.getDirector());
        }
    }
}

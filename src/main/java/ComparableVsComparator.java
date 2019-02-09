
import java.util.ArrayList;
import java.util.Collections;
import dataModelComparableVsComparator.Movie;
import dataModelComparableVsComparator.RatingComparator;


public class ComparableVsComparator {

    public static void main (String args[]) {

        ArrayList<Movie> movieComparables = new ArrayList<Movie>();
        movieComparables.add(new Movie("Force Awakens", 8.3, 2015));
        movieComparables.add(new Movie("Star Wars", 8.7, 1977));
        movieComparables.add(new Movie("Empire Strikes Back", 8.8, 1980));
        movieComparables.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(movieComparables);
        System.out.println(" Printing movies via Comparable");
        for (Movie movie : movieComparables) {
            System.out.println(movie);
        }

        System.out.println("=========== Sorting movie by Comparator ===========");
        // Comparators Used when you want to sort based on different criteria.
        // other than the one provided by the Comparable Class implementation
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Force Awakens", 8.3, 2015));
        movies.add(new Movie("Star Wars", 8.7, 1977));
        movies.add(new Movie("Empire Strikes Back", 8.8, 1980));
        movies.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(movies, new RatingComparator());
        System.out.println(" Printing movies via Comparator ");
        for (Movie movie: movies) {
            System.out.println(movie.toString());
        }
    }
}

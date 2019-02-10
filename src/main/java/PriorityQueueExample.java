import dataModelComparableVsComparator.Movie;
import dataModelComparableVsComparator.RatingComparator;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main (String args[]) {
        PriorityQueue<Movie> priorityQueue = new PriorityQueue<Movie>(5, new RatingComparator());

        priorityQueue.add(new Movie("Force Awakens", 8.3, 2015));
        priorityQueue.add(new Movie("Star Wars", 8.7, 1977));
        priorityQueue.add(new Movie("Empire Strikes Back", 8.8, 1980));
        priorityQueue.add(new Movie("Return of the Jedi", 8.4, 1983));

        /*
            Printing movies in ascending order
            of Rating
         */
        while(!priorityQueue.isEmpty()) {
            Movie movie = priorityQueue.poll();
            System.out.println(movie.toString());
        }
    }
}

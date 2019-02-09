package dataModelComparableVsComparator;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {


    /*
        -ve means o1 is smaller than
    */
    public int compare(Movie o1, Movie o2) {
        if  (o1.getRating() <  o2.getRating())
            return -1;
        else if (o1.getRating() > o2.getRating())
            return 1;
        return 0;
    }

}

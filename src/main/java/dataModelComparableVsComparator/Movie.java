package dataModelComparableVsComparator;

public class Movie implements Comparable<Movie> {

    private double rating;
    private String name;
    private int year;

    public Movie(String name, double rating, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    /*
        Shorts in ascending order
        -ve means this is smaller and should come before inp
        +ve means this is greater and should come before inp
        0 means both are equal
     */
    public int compareTo(Movie inp) {
        return this.year - inp.year;
    }

    public String toString() {
        StringBuilder movie = new StringBuilder();
        movie.append("{");
        movie.append("name :" + this.name);
        movie.append(",");
        movie.append("rating :" + this.rating);
        movie.append(",");
        movie.append("year :" + this.year);
        movie.append("}");
        return movie.toString();
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

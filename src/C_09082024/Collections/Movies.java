package C_09082024.Collections;
import java.util.Comparator;
//Comparator class
class SortByName implements Comparator<Movies>{

    //sort Movies by name
    @Override
    public int compare(Movies o1, Movies o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByRating implements Comparator<Movies>{

    //sort Movies by name
    @Override
    public int compare(Movies o1, Movies o2) {
        return Double.compare(o1.getRating(),o2.getRating());
    }
}

public class Movies{

    private double rating;
    private String name;
    private int year;


    public Movies(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Movies{" +"Rating="  +rating+ ", Name='" +name +", Year='" +year + '\'' +'}';
    }
}

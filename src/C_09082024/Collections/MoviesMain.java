package C_09082024.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//main class for Movies
public class MoviesMain {
    public static void main(String[] args) {
        Movies m1=new Movies(3.5,"The Conjuring",2016);
        Movies m2=new Movies(4.2,"The Kantara",2023);
        Movies m3=new Movies(4.0,"The Nun",2023);

        List movies_list=new ArrayList<>();
        movies_list.add(m1);
        movies_list.add(m2);
        movies_list.add(m3);

        System.out.println(movies_list);
//sort movies by rating
        System.out.println("Sorting movies by rating");
        Collections.sort(movies_list,new SortByRating());
        System.out.println(movies_list);

        System.out.println("Sorting movies by name");
        Collections.sort(movies_list,new SortByName());
        System.out.println(movies_list);


    }
}

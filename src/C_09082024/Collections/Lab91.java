package C_09082024.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lab91 {
    public static void main(String[] args) {
        List url_pages= new ArrayList<>();
        url_pages.add("LoginPage");
        url_pages.add("Dashboard");
        url_pages.add("HomePage");

        System.out.println(url_pages);

        for (int i = 0; i < url_pages.size(); i++) {
            System.out.println(url_pages.get(i));
        }

        //using for-each loop
        for (Object list:url_pages){
            System.out.println(list);

        }
    }
}

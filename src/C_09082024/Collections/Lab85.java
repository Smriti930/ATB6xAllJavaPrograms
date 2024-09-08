package C_09082024.Collections;

import java.util.List;

public class Lab85 {
    public static void main(String[] args) {
        List shopping_list= List.of("Milk","Bread","Butter","Cheese");
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());

        List fruits=List.of("orange","apple","banana","apple","watermelon");

        System.out.println(fruits);

        System.out.println(fruits.size());
        System.out.println(fruits.get(0));
        System.out.println(fruits.indexOf("apple"));
//new element can't be added into list,as list is an interface
//        fruits.add("grapes");
//        System.out.println(fruits);
    }
}

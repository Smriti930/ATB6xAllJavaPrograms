package C_09082024.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab88 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Smriti");
        myList.add("Amit");
        myList.add("Person");
        System.out.println("Print arraylist");

        for (String list:myList) {
            System.out.println(list);
        }

        System.out.println("Using for loop");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
//Iterator in case of arraylist
        System.out.println("Using Iterator");

        Iterator<String> itr=myList.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

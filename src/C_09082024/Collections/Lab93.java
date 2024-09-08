package C_09082024.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab93 {
    public static void main(String[] args) {
        List ttacourseList = new ArrayList<>();

        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET classes");
        ttacourseList.add("Java for testers");
        ttacourseList.add(123);
        ttacourseList.add(true);
        ttacourseList.add(3.14f);

        System.out.println(
                "Using iterator"
        );
        Iterator iterator = ttacourseList.iterator();
        while (iterator.hasNext()) {
//            ttacourseList.add("Smriti");
            System.out.println(iterator.next());
        }

        System.out.println("Using for-each loop");
        for (Object course : ttacourseList) {
            System.out.println(course);
        }
        System.out.println("Using for loop");
        for (int i = 0; i < ttacourseList.size(); i++) {
            System.out.println(ttacourseList.get(i));


        }
        System.out.println("Using List iterator");
        ListIterator it = ttacourseList.listIterator();
        {

            while (it.hasNext()) {
                it.add("Gen AI");
                System.out.println(it.next());
            }

            System.out.println(ttacourseList);


        }
    }
}

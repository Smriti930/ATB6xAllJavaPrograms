package C_09082024.Collections;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lab94 {
    public static void main(String[] args) {

        //LinkedList
        List course=new LinkedList();
        course.add("ATB");
        course.add("MTB");
        course.add("LAPIT");
        course.add("SDET classes");
        course.add("Java for testers");
        System.out.println(course);

        //Vector
        Vector<String> v2=new Vector<>();
        v2.add("ATB");
        v2.add("ATB");
        v2.add("MTB");
        v2.add("LAPIT");
        v2.add("SDET classes");

        Enumeration e=v2.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }


    }
}

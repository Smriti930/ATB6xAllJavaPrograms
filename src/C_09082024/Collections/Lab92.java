package C_09082024.Collections;

import java.util.ArrayList;
import java.util.List;
//ArrayList uses collections method ro copy one elements to another
public class Lab92 {
    public static void main(String[] args) {
        List<String> courseList=new ArrayList<>();

        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("LAPIB");
        courseList.add("SDET class");

        List numList=new ArrayList<>();
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        courseList.addAll(numList);
        System.out.println(courseList);


    }
}

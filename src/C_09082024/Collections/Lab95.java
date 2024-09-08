package C_09082024.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab95 {
    public static void main(String[] args) {
//        List stringList=null;
//        stringList.add("ATB");

        List<Integer> myMarks=new ArrayList<>();
        myMarks.add(91);
        myMarks.add(87);
        myMarks.add(80);
//Collections utility to sort the elements
        Collections.sort(myMarks);
        System.out.println(myMarks);
    }
}

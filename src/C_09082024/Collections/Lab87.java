package C_09082024.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab87 {
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<Integer>();
        //String type data can't be added
//        myList.add("SMriit");

        myList.add(123);
        System.out.println(myList);

    }
}

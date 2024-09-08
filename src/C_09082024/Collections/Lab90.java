package C_09082024.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab90 {
    public static void main(String[] args) {
        List myList=new ArrayList<>();
        myList.add("Smriti");
        myList.add("Anusha");
        myList.add("Kiran");
        System.out.println(myList);
//Vector reprentation
        Vector v=new Vector<>();

        v.add("Smriti");
        v.add("Anusha");
        v.add("Kiran");
        v.add("Kiran");
        System.out.println(v);

    }
}

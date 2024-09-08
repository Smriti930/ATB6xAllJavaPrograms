package C_09082024.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab89 {
    public static void main(String[] args) {
        ArrayList myList1 =new ArrayList<>();
        List myList=new ArrayList<>();

        SequencedCollection myList2=new ArrayList();
        Collection myList3=new ArrayList();

        myList.add("Smriti");
        myList.add("Anusha");
        myList.add("Kiran");
        System.out.println(myList);

        myList.add("Smriti");
        myList.add("Smriti");
        myList.add("Smriti");
        myList.add(null);
        myList.add(null);
        System.out.println(myList);
        myList.remove("Smriti");
        System.out.println(myList);
    }
}

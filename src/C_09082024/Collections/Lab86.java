package C_09082024.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab86 {
    public static void main(String[] args) {
        List myList=new ArrayList();
        ArrayList myList1=new ArrayList<>();

        myList.add("Smriti");
        myList.add("Anusha");
        myList.add("Kiran");
        myList.add("Smriti");
        myList.add("Smriti");

        System.out.println(myList);
        System.out.println(myList.size());

        myList.remove("Smriti");
        myList.clear();
        System.out.println(myList.isEmpty());

        //adding elements again

        myList.add("Smriti");
        myList.add("Anusha");
        myList.add("Kiran");
        myList.add("Smriti");
        myList.add("Smriti");

        System.out.println(myList);

        myList.set(1,"SmritiANand");
        System.out.println(myList);


        myList.add(123);

        myList.add(true);

        System.out.println(myList);

        System.out.println("-----------");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
            //print using for-each loop
            for (Object obj:myList){
                System.out.println(obj);
        }




    }
}

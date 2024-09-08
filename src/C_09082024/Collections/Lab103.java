package C_09082024.Collections;

import java.security.Key;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
//Hashtable
public class Lab103 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1=new Hashtable<>();
        ht1.put(1,"one");

        ht1.put(2,"two");
        ht1.put(3,"three");

        Enumeration<Integer> e= ht1.keys();
        while(e.hasMoreElements()){
            Integer key=e.nextElement();
            System.out.println(key + " : " + ht1.get(key));
        }

    }
}

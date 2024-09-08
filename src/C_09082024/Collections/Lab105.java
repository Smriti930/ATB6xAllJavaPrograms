package C_09082024.Collections;

import java.util.*;

//sort hashmap by keys using treemap
public class Lab105 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap();
        map.put("ID",123);
        map.put("Street",2);
        map.put("City", 3);
        map.put("State", 4);

        Iterator <String> it = map.keySet().iterator();
        System.out.println("Before Sorting");
        while(it.hasNext())
        {
            String key=(String) it.next();
            System.out.println("ID:  "+key+"     NUMBER:   "+map.get(key));
        }
        System.out.println("\n");

        System.out.println("After Sorting");
//using TreeMap constructor to sort the HashMap by passing the constructor
        TreeMap<String,Integer> tm=new  TreeMap<String,Integer> (map);
        Iterator itr=tm.keySet().iterator();
        while(itr.hasNext())
        {
            String key=(String) itr.next();
            System.out.println("ID:  "+key+"     NUMBER:   "+map.get(key));

        }
    }

    }


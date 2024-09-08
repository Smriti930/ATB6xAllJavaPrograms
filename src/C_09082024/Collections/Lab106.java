package C_09082024.Collections;

import java.util.*;

//Sort the hashmap elements by value using TreeMap
public class Lab106 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Smriti",1);
        map.put("Shree",4);
        map.put("Archana",3);
        map.put("Anand",8);
        System.out.println("Before sorting");
        Iterator<Integer> it=map.values().iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("\n");
        System.out.println("After sorting");
        TreeMap<String,Integer> ts=new TreeMap<>(map);
//        Iterator itr=ts.values().iterator();
//        while (it.hasNext())
//        {
//            {
//                Integer value=(Integer) itr.next();
//                System.out.println("Name:  "+value+"     id:   "+map.get(value));
//            }
//            System.out.println("\n");


// Iterating over HashMap
        for (Map.Entry<String, Integer> entry : ts.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
    }


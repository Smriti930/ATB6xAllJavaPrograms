package C_09082024.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Map-key value pair
public class Lab100 {
    public static void main(String[] args) {
        Map<String,Object> studentMap=new HashMap<>();
        studentMap.put("firstname","Smriti");
        studentMap.put("age",65);
        studentMap.put("roll",1);
        studentMap.put("course","ATB");
        studentMap.put("lastname","Anand");
        studentMap.put("isFemale",true);
        System.out.println(studentMap);
        //get firstname
        System.out.println(studentMap.get("firstname"));

        //check if map is empty
        System.out.println(studentMap.isEmpty());

        //check if specified key is present
        System.out.println(studentMap.containsKey("age"));

        //check if specified value is present
        System.out.println(studentMap.containsValue(65));

        //Returns all the keys present in map
        System.out.println(studentMap.keySet());

        //Return all the keys present in map
        System.out.println(studentMap.values());

        //iterate through all the key-value pair of the map
        for(Map.Entry<String,Object> item: studentMap.entrySet()){
            System.out.println(item.getKey()+" : "+item.getValue());
        }
    }
}

package C_09082024.Collections;

import java.util.HashMap;
import java.util.Map;

public class Lab102 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("id",1);
        map.put("id4",1);
        map.put("id2",2);
        map.put("id3",34);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(2));
        System.out.println(map.containsValue(34));
        System.out.println(map.containsValue(99));

        System.out.println(map.get("id3"));
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}

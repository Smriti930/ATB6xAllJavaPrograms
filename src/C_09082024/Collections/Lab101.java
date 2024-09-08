package C_09082024.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lab101 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("firstname","Smriti");
        map.put("lastname","Anand");
        map.put("email-id","test@123.com");
        map.put("phone","1234567890");
        map.put("city","Pune");
        map.put("state","maharastra");
        map.put("country","India");
        map.put("zip","411057");

        System.out.println(map);

        Map<String,String> map2=new HashMap<>();
        map2.put("firstname","Smriti");
        map2.put("lastname","Anand");
        map2.put("email-id","test@123.com");
        map2.put("phone","1234567890");
        map2.put("city","Pune");
        map2.put("state","maharastra");
        map2.put("country","India");
        map2.put("zip","411057");
        System.out.println(map2);

        ArrayList list=new ArrayList<>();
        list.add(map);
        list.add(map2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));


    }
}

package C_09082024.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparetorMain {
    public static void main(String[] args) {
        ComperatorClas obj1=new ComperatorClas("CS1002","Physics");
        ComperatorClas obj2=new ComperatorClas("CS16754","Operating System");
        ComperatorClas obj3=new ComperatorClas("CS9865","Data Structor");
        ComperatorClas obj4=new ComperatorClas("CS23412","Chemistry");

        List sub_list=new ArrayList<>();

        sub_list.add(obj1);
        sub_list.add(obj2);
        sub_list.add(obj3);
        sub_list.add(obj4);

        Collections.sort(sub_list,new SortIdByAscSubId());
        System.out.println(sub_list);

        Collections.sort(sub_list,new SortIdByDscSubId());
        System.out.println(sub_list);

        Collections.sort(sub_list,new SortIdBySubName());
        System.out.println(sub_list);

        Collections.sort(sub_list,new SortIdBySubName2());
        System.out.println(sub_list);

    }
}

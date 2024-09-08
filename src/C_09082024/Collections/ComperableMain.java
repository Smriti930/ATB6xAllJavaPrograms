package C_09082024.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComperableMain {
    public static void main(String[] args) {
        ComparebleClas obj1=new ComparebleClas("CS1002","Physics");
        ComparebleClas obj2=new ComparebleClas("CS1089","Operating System");
        ComparebleClas obj3=new ComparebleClas("CS1234","Data Structor");
        ComparebleClas obj4=new ComparebleClas("CS1034","Chemistry");

        List sub_list=new ArrayList<>();

        sub_list.add(obj1);
        sub_list.add(obj2);
        sub_list.add(obj3);
        sub_list.add(obj4);

        System.out.println(sub_list);
        Collections.sort(sub_list);




    }
}

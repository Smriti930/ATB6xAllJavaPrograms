package C_09082024.Collections;

import java.util.Collections;
import java.util.Vector;

public class Lab96 {
    public static void main(String[] args) {

        //vector
        Vector v2=new Vector<>();
        v2.add(87);
        v2.add(81);
        v2.add(91);

        Collections.sort(v2);
        System.out.println(v2);

    }
}

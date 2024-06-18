package A06052024;

import jdk.dynalink.beans.StaticClass;

public class Lab53 {
    static int SumofTwo(int a,int b)
    {
        return a+b;
    }

    static  String sumofTwo(String a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        String r1=sumofTwo("Smriti",5);
        System.out.println(r1);

        int r2=SumofTwo(2,6);
        System.out.println(r2);

        String r3=sumofTwo("Anand",5);
        System.out.println(r3);


    }
}

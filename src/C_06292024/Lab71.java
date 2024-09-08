package C_06292024;

public class Lab71 {
    //static method,variables,function
    public static void main(String[] args) {
        A a=new A();
        A b=new A();
//        System.out.println(A.age);

        System.out.println(A.common);
        System.out.println(a.common);
        System.out.println(b.common);
        A.m1();
        a.m1();
        b.m1();

        A.m2();
        a.m2();
        b.m2();

        A c=null;
        A.m1();
        c.m2();
    }


}

class  A {
    int age = 10;
    static String common = "ABC";

    static {
        System.out.println("SIB-A");
    }

    {
        System.out.println("IIB");
    }

    static void m1() {
        System.out.println("m1");
    }

    static void m2() {
        System.out.println("m2");
    }
}

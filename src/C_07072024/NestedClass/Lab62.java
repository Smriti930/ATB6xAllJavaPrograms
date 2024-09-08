package C_07072024.NestedClass;
class main1{
    public static void main(String[] args) {
        Lab62 lab=new Lab62();
//        Lab62.inner1  inn= lab.new inner1();
//        inn.show();

    }
}
public class Lab62 {
    static int a=10;
     static class inner1{
        static int b=11;
        void show()
        {
            System.out.println(a);
            System.out.println(b);
        }
    }
}

package C_06292024;
//Nested class
public class Lab72 {
    public static void main(String[] args) {
        OC inner=new OC();
//        OC IC=new inner.outer();
    }
}

class OC{
    int a=10;
    class IC{
        void m2()
        {
            System.out.println("Hi,IC"+a);
        }
    }
}



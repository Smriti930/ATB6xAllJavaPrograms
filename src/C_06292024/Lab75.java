package C_06292024;
//overriding the interface and abstract methods in main
//method
public class Lab75 {
    public static void main(String[] args) {
        ABC abc=new ABC(){
            void m1(){
                System.out.println("M1");
            }
        };
        abc.m1();

        I1 i=new I1() {
            @Override
            public void m2() {
                System.out.println("M2");
            }
        };
    }
}

abstract class ABC{
    abstract void m1();

}
interface I1{
    void m2();
}


package C_07072024.NestedClass;

public class Inherit1 extends Abst1{


    @Override
    void sum(int a, int b) {
        int sum=a+b;
        System.out.println(sum);
    }

    @Override
    void subtract(int a, int b) {
int sub=a-b;
        System.out.println(sub);
    }
}

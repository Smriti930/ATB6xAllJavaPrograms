package A06052024;

//maximum among three numbers(ternary operator)
public class Lab04 {
    public static void main(String[] args) {
        double x=101.3,y=203.1,z=32.4;

       double d= (x>y)?(x>z?x:z):(y>z?y:z);

        System.out.println(d);
    }
}

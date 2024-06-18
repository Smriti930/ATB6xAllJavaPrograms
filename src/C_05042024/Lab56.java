package A06052024;

public class Lab56 {

    static int sum(int a,int b)
    {
        return a+b;
    }

    static int sub(int a,int b)
    {
        return a-b;
    }

    static int mul(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        int r_sum=sum(+3,4);
        System.out.println("Sum is:"+r_sum);
        int r_sub=sub(10,5);
        System.out.println("Sub is: "+r_sub);
        int r_mul=mul(2,4);
        System.out.println("Multiplication is"+" "+r_mul);
    }
}

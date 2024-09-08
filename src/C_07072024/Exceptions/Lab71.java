package C_07072024.Exceptions;

public class Lab71 {
    public static void main(String[] args) {
        //NullPointerException
        String s1=null;
        s1.trim();
//ArithmeticException
        int a=10;
        int c=a/0;
        System.out.println(c);
    }
}

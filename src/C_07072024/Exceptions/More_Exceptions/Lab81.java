package NotUploaded002.Exceptions;

public class Lab81 {
    public static void main(String[] args) {
        ProblemA problema=new ProblemA();
       int x= problema.show();
        System.out.println(x);
    }
}
class ProblemA {
    int a=10;
    int show(){
        try{
            System.out.println(a);
            return a;
        }catch (Exception e)
        {
            System.out.println("Catch");
            a=20;
            return a;
        }finally {
            System.out.println("I am final");
        }
    }
}

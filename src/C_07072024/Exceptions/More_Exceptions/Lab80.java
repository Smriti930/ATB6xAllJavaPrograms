package NotUploaded002.Exceptions;

public class Lab80 {
    public static void main(String[] args) {
      ProblemA problem=new ProblemA();
     int x= problem.show();
        System.out.println(x);
    }
}
class ProblemF{
    int a=10;
    int show()
    {
        try{
            System.out.println("In class -> "+a);
            return a;
        }catch (Exception e){
            System.out.println("Catch");
            a=20;
            return a;
        }finally {
            System.out.println("I am Final");
        }

    }
}

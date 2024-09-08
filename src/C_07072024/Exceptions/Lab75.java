package C_07072024.Exceptions;

public class Lab75 {
    public static void main(String[] args) {
        final double pi=3.14;
        try{
            int a=0;
            int x=10/a;
        }catch (Exception e)//Exception is parent class of all exception better to not use this class,instead of this we can use the exception that is going to throw for example:NullPointerException
        {
            System.out.println("Exit");
        }
        finally {
            System.out.println("I am final");
        }
    }
}

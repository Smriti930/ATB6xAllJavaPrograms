package C_07072024.Exceptions;

public class Lab73 {
    public static void main(String[] args) {
        try {
            String sh = args[0];//arrayIndexOutofBoundException
            int x = Integer.parseInt(sh);//NumberFormatException

            int a = 10 / x;//ArithmaticException


            System.out.println(x);
            System.out.println(a);

        } catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please enter input!");
        }
    }
}

package C_07072024.Exceptions;

public class Lab72 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            System.out.println(ip);
            int a = Integer.parseInt(args[0]);

            int b = 10 / a;

            System.out.println(a);
            System.out.println(b);
//        }catch (ArithmeticException|NumberFormatException|ArrayIndexOutOfBoundsException e){
//            System.out.println("Problem with the code!!");
//        }
        }  catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

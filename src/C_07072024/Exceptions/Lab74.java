package C_07072024.Exceptions;

public class Lab74 {
    public static void main(String[] args) {
        try {
            String s1 = "Smriti";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        }catch(NullPointerException|ArrayIndexOutOfBoundsException e)
        {
            System.out.println("something went wrong!!");
        }

        System.out.println("End of program");
    }
}

package Questions;

import java.util.Scanner;

/*Find if the number is positive negative or zero*/
public class PositiveNegative {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();

        if (a>0)
        {
            System.out.println("Entered number is positive");
        }

        else if (a<0)
        {
            System.out.println("Entered number is negative");
        }
        else
        {
            System.out.println("0 has been entered");
        }

    }


}

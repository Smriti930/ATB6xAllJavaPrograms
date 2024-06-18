package Questions;

import java.util.Scanner;

//Find the largest number among 3 numbers
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);

        System.out.println("Enter x value" );
        int x=sc.nextInt();

        System.out.println("Enter y value" );
        int y=sc.nextInt();

        System.out.println("Enter z value" );
        int z=sc.nextInt();

        if (x>y||x>z)
        {
            System.out.println("x is largest"+" "+x);
        }
        else if (y>z) {
            System.out.println("y is largest" + " " + y);
        }
            else {
                System.out.println("z is largest"+" "+z);

        }


    }
}

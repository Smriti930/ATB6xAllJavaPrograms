package Practise;
//Take positive user input from keyboard and find multiplication table of all  numbers
import java.util.Scanner;

public class Quest25 {
    public static void main(String[] args) {
        int i=1;
        int mult=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        if (number<=0)
        {
            System.out.println("Please enter positive number");
        }
        else {
            while(number>=1 && i<=10)
            {
                mult=number*i;
                System.out.println(number+"*"+i+"="+mult);
                i++;
            }
        }
    }


}

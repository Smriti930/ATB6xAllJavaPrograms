package Questions;

import java.util.Scanner;
//find if year is leap or not
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the year");
        long year =sc.nextLong();

        if (year%4==0||year%400==0)
        {
            System.out.println("The year is leap");
        } else if (year%4==0 && year%100==0)
        {
            System.out.println("The year is not leap");

        }
        else
        {
            System.out.println("The year is not leap");
        }
    }
}

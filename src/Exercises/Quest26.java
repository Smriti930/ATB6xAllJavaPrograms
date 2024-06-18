package Practise;
//Write a program to find the factorial value of any number entered through the keyboard
import java.util.Scanner;

public class Quest26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");

int num=sc.nextInt();
int fact=1;
while(num>=1)
{
    fact=fact*num;
    num--;
}
        System.out.println("Factorial is: "+fact);
    }
}

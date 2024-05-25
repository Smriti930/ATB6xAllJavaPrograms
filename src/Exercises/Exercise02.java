package Exercises;

import java.util.Scanner;
//Take a input from user, input1, input2 as int and ask the user what
//you want to do, enter char +,*,/ ,%, - , you will share the result
//by using the switch.
public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first input");
        int input1=sc.nextInt();
        System.out.println("Enter second input");
        int input2=sc.nextInt();
        System.out.println("Enter the operation you want to perform");
        char operation=sc.next().charAt(0);
        int result;

        switch (operation)
        {
            case '+':
                result=input1+input2;
                System.out.println(result);
                break;
            case '-':
                result=input1-input2;
                System.out.println(result);
                break;
            case '*':
                result=input1*input2;
                System.out.println(result);
                break;
            case '/':
                result=input1/input2;
                System.out.println(result);
                break;
            case '%':
                result=input1%input2;
                System.out.println(result);
                break;
        }

    }
}

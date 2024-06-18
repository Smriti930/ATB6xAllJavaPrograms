package Practise;

import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        double a = sc.nextDouble();
        System.out.println("Enter b value");
        double b = sc.nextDouble();
        System.out.println("Enter the c value");
        double c = sc.nextDouble();

        double sqrt1=Math.sqrt(b*2-4*a*c);
        System.out.println(sqrt1);
        double equation=(-b+sqrt1)/2*a;
        System.out.println(equation);
    }
}

package Practise;

import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter the side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter the side 3");
        int side3 = sc.nextInt();
        int tri=side1+side2+side3;
        if(tri==180&side1>0&&side2>0&&side3>0)
        {
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Invalid Triangle");
        }

    }
}

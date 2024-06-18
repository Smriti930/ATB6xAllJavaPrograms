package Practise;

import java.util.Scanner;

public class Quest03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter the side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter the side 3");
        int side3 = sc.nextInt();

        if(side1==side2&&side2==side3&&side1==side3)
        {
            System.out.println("equilateral triangle");
        } else if (side1==side2||side2==side3||side1==side3) {
            System.out.println("Isosceles triangle");
        } else if (side1!=side2&&side1!=side3&&side2!=side3) {
            System.out.println("Scalene triangle");

        }

    }
    }

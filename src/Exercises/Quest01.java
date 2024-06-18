package Practise;

import java.util.Scanner;
//take user input of month number and print the month
public class Quest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int input = sc.nextInt();

        if (input == 1) {
            System.out.println("January");
        } else if (input == 2) {
            System.out.println("February");
        } else if (input == 3) {
            System.out.println("March");
        } else if (input == 4) {
            System.out.println("April");
        } else if (input == 5) {
            System.out.println("May");
        } else if (input == 6) {
            System.out.println("June");
        } else if (input == 7) {
            System.out.println("July");
        } else if (input == 8) {
            System.out.println("August");
        } else if (input == 9) {
            System.out.println("September");
        } else if (input == 10) {
            System.out.println("October");
        } else if (input == 11) {
            System.out.println("November");
        } else if(input==12){
            System.out.println("December");
        }
        else {
            System.out.println("Invalid month");
        }


    }
}


package A06052024;

import java.util.Scanner;

public class Lab47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string,to check whether it's a palindrome or not:");
        String user_input=sc.nextLine();

        StringBuilder sb=new StringBuilder(user_input);
        String rev_sb=sb.reverse().toString();
        if(user_input.equalsIgnoreCase(rev_sb))
        {
            System.out.println("Palindrome-->"+ user_input);
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}

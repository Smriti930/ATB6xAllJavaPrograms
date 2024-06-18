package A06052024;

import java.util.Scanner;

//verify vowels and consonent using switch statement
public class Lab10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a char value");
        char input=sc.next().toCharArray()[0];

        switch(input){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonent");

        }
    }
}

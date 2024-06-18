package Practise;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        char input=sc.next().charAt(0);

        if (input=='a'||input=='b'||input=='c'||input=='d'||input=='e'||input=='f'||input=='g'||input=='h'
        ||input=='i'||input=='j'||input=='k'||input=='l'||input=='m'||input=='n'||input=='o'||input=='p'||
                input=='q'||input=='r'||input=='s'||input=='t'||input=='u'||input=='v'||input=='w'||input=='x'||
                input=='y'||input=='z')
        {
            System.out.println("Entered input is character");
        }
        else
        {
            System.out.println("Entered input is not  a character");
        }
    }
}

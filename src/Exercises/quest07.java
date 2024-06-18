package Practise;
//Print the tables of any multiples
import java.util.Scanner;

public class quest07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+"*"+number+"="+i*number);
        }
    }
}

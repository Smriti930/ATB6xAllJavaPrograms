package Practise;

import java.util.Scanner;

public class quest08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        for (int i = 10; i >=1; i--) {
            System.out.println(i+"*"+number+"="+i*number);
        }
    }
}

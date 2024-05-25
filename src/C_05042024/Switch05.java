package C_05042024;
//print the grade according to number using switch statement
import java.util.Scanner;

public class Switch05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");

        int marks=sc.nextInt();
        marks =marks/10;
        System.out.println(marks);

        switch(marks){
            default:
                System.out.println("F-Failed");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;


        }


    }
}

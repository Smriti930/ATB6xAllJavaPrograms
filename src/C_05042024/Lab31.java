package A06052024;
//print the marks of all subjects by taking input from the user
import java.util.Scanner;

public class Lab31 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
float[] marks=new float[5];
        System.out.println("Enter the 1st subject's mark:");
        marks[0]=sc.nextFloat();
        System.out.println("Enter the 2nd subject's mark:");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the 3rd subject's mark:");
        marks[2]=sc.nextFloat();
        System.out.println("Enter the 4th subject's mark:");
        marks[3]=sc.nextFloat();
        System.out.println("Enter the 5th subject's mark:");
        marks[4]=sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i]<30)
            {
                System.out.println("Failed in this subject:"+" "+marks[i]);
            }
            else {
                System.out.println(marks[i]);
            }
        }
    }
}

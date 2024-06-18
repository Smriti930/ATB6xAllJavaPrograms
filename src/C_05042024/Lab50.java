package A06052024;

//find out if a string is an anagram
import java.util.Arrays;
import java.util.Scanner;

public class Lab50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1=sc.nextLine();

        System.out.println("Enter second string:");
        String str2=sc.nextLine();
if (str1.length()!=str2.length()) {
    System.out.println("Not an anagram");
}
           else{
                char[] c1 = str1.toCharArray();
                Arrays.sort(c1);
                char[] c2 = str2.toCharArray();
                Arrays.sort(c2);
    if (Arrays.equals(c1,c2)){
        System.out.println("Given string is an anagram");
            }
    else{
        System.out.println("Not an anagram");
    }
        }



    }
}

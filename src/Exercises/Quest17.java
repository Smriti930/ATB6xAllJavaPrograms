package Practise;
//Factorial of any number
public class Quest17 {
    public static void main(String[] args) {
        int n=12;
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
            System.out.println("Factorial of "+i+"is "+fact);
        }
    }
}

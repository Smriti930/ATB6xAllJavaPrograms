package Practise;
//Sum of all odd numbers between 1 to n
public class Quest15 {
    public static void main(String[] args) {
        int n=100;
        int i;
        int sum=0;
        for ( i = 1;i <=n ; i++) {
            if(i%2!=0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of all odd numbers"+" "+sum);
    }
}

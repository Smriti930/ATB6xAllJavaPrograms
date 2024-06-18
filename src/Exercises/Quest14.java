package Practise;
//Sum of all even number between 1 to n
public class Quest14 {
    public static void main(String[] args) {
        int n=100;
        int i;
        int sum=0;
        for ( i = 1;i <=n ; i++) {
            if(i%2==0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of all even numbers"+" "+sum);
    }
}

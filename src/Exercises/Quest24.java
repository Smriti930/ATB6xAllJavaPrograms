package Practise;
//While-loop--->print sum of given positive numbers
public class Quest24 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i>=0 && i<=10)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}

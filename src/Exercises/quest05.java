package Practise;

import java.util.Scanner;

public class quest05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount of electricity bill:");
        double units=sc.nextDouble();
        if(units<=50)
        {
            System.out.println("Bill is:"+.50*units);;

        }
        else if(units<=150)
        {
            System.out.println("Bill is:"+.75*units);
        }

        else if(units<=250)
        {
            System.out.println("Bill is:"+1.20*units);
        }
        else
        {

            System.out.println("Bill is:"+1.50*units);

        }
        double surcharge=units*0.20;
        System.out.println("Additional Charges:"+surcharge);
    }
}

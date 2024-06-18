package Practise;

public class Quest22 {
    public static void main(String[] args) {
        String str="This is testing";
        StringBuilder input1=new StringBuilder();
        input1.append(str);
        input1.reverse();
        if (input1.equals(str))
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

package Practise;

public class Quest20 {
    public static void main(String[] args) {
        String str="Smriti";
      String  nstr=" ";
        char ch;

        System.out.println("Original word"+" "+str);
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            nstr=ch+nstr;

        }
        System.out.println("Reversed word:"+" "+nstr);
    }
}

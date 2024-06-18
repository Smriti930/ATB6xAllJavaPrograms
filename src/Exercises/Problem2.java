package Questions;
//Reverse a string without using any predefined function
public class Problem2 {
    public static void main(String[] args) {
        String str="Madam";
        char ch;
        String new_str=" ";
        for (int i = 0; i < str.length(); i++) {
        ch=str.charAt(i);
        new_str=ch+new_str;
        }
        System.out.println("Reversed String= "+new_str.toLowerCase());
    }
}

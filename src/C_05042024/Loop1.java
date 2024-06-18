package C_05042024;
//
public class Loop1 {
    public static void main(String[] args) {
        String str="Madam";
        String new_str=" ";
        char str1;
        for (int i = 0; i <str.length(); i++) {
            str1= str.charAt(i);
            new_str=str1+new_str;
        }
        System.out.println(new_str);
    }
}

package A06052024;

public class Lab51 {
    public static void main(String[] args) {
        String str="This is Java";
        char[] chars = str.toCharArray();
        StringBuilder str_new=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if(chars[i]==chars[j])
                {
                    break;

                }
                else {
                    str_new.append(chars[i]);

                }
            }
        }
    }
}

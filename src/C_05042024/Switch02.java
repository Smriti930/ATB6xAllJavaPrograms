package C_05042024;

public class Switch02 {
//switch statement without break keyword
    public static void main(String[] args) {
        int itemCode=001;

        switch (itemCode)
        {
            case 001-> System.out.println("It is a laptop");
            case 002-> System.out.println("It is a desktop");
            case 003,004-> System.out.println("It is a mobile phone");
            default-> System.out.println("hello");
        }
    }
}

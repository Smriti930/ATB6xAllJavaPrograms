package C_05042024;
//Switch statement with multiple conditions
//JDK > 13
public class Switch01 {
    public static void main(String[] args) {
        int itemcode=006;
        switch (itemcode){
            case 001,002,003:
                System.out.println("It is electronic gdget");
                break;
            case 004,005,007:
                System.out.println("It is mechanical gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}

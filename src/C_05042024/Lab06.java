package A06052024;

public class Lab06 {
    public static void main(String[] args) {
        String pass_u="qwerty@123";
        String password="Qwerty@123";

        System.out.println(pass_u==password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf("e"));
    }
}

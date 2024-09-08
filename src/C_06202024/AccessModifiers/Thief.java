package C_06202024.AccessModifiers;

public class Thief {
    public static void main(String[] args) {
        Cop cop=new Cop(10);
        System.out.println(cop.gun);
//        cop.canIshoot();
    }
}

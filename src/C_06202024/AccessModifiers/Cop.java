package C_06202024.AccessModifiers;
//Access Modifiers
public class Cop {
    public int gun;
    private String idCard;

    public Cop(int gun)
    {
        this.gun=gun;
    }

    protected void canIshoot()
    {
        System.out.println("Ofcourse,Shoot!!");
    }
}

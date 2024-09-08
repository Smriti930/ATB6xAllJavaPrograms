package C_06202024.Polymorphism;
//method Overloading
public class Lab62 {

    void gift(String s)
    {
        System.out.println("Message is: "+s);
    }
    void gift(int  a)
    {
        System.out.println("Message is: "+a);
    }

    void gift(float f)
    {
        System.out.println("Message is: "+f);
    }
    void gift(double x)
    {
        System.out.println("Message is: "+x);
    }

    public static void main(String[] args) {
        Lab62 p=new Lab62();
        p.gift(10);
        p.gift(2.1);
        p.gift(2.0f);
        p.gift("Smriti");
    }
}

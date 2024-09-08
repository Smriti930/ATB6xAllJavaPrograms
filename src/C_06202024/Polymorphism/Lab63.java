package C_06202024.Polymorphism;

public class Lab63 {
    public static void main(String[] args) {
        Dog g=new Dog();
        g.Bark();

        Hound h=new Hound();
        h.Bark();

        Dog d1=new Hound();//Runtime polymorphism
        d1.Bark();
    }


}

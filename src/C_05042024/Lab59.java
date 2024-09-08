package C_05042024;
// Using "super()" and "this()" keywords
public class Lab59 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.message();
s1.display();

    }
}

class Student extends Person{
    void message()
    {
        System.out.println("I am student message");
    }
    void display()
    {
        this.message();
        super.message();
    }
}
class Person{
    void message()
    {
        System.out.println("I am person messgae");
    }
}

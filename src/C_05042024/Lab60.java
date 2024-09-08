package C_05042024;
// Using "super()" and "this()" keywords
public class Lab60 {
    public static void main(String[] args) {
        Student1 sc1=new Student1();

    }
}
class Person1{
    Person1()
    {
        System.out.println("Person-default const");
    }

    Person1(String a)
    {
        System.out.println("Person1-Parameterized constructor");
    }
}
class Student1 extends  Person1
{
    Student1()
    {
        super("smriti");

        System.out.println("Student-default const");
    }

}
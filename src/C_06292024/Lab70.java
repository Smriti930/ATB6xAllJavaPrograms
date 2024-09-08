package C_06292024;
//Static methods and variables
public class Lab70 {
    public static void main(String[] args) {
        Person p1=new Person("Smriti");
        Person p2=new Person("Anand");
//calling static variable
        System.out.println(Person.footballClub);
        //calling static function
        Person.m1();

        p1.m1();
        p2.m2();
//        Person.m2();
    }
}
class Person{
    static String footballClub="Arsenal";
//static block
    static{
        System.out.println("Once,when class is loaded");
    }
    {
        System.out.println("IIB");
    }

    //static function
    static void m1()
    {
        System.out.println("I am a common function");
    }

    //non static function
    void  m2()
    {
        System.out.println("Person--> "+this.name);
    }

    String name;

    public Person(String name)
    {
        this.name=name;
    }
}
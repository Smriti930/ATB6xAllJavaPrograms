package C_05042024;
//Inheritance
public class Lab58 {
    public static void main(String[] args) {

Car c =new Car() ;
c.display();

    }



}
class Car extends Vehicle{
 void display()
 {
     System.out.println("Max speed of car can be:"+ super.maxSpeed);
 }
}
class Vehicle{
    int maxSpeed=100;

    void message()
    {
        System.out.println("It is vehicle class");
    }
}

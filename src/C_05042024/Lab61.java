package C_05042024;
//Constructor chaining
public class Lab61 {
    public static void main(String[] args) {
        Dog d1=new Dog();
        Dog d2=new Dog("huskey","Australian");
        d2.display();
    }


}
class  Animal{
    String type;
    Animal()
    {
        System.out.println("Aninal-Defaut const");
    }

    Animal(String type)
    {
        System.out.println("ANimal-param const");
    }
}

class Dog extends  Animal{
    String breed="huskey";

    public Dog(String breed,String type) {
        super(type);
        this.breed = breed;
    }
    void display()
    {
        System.out.println("Type"+" "+type+" "+"Breed  "+this.breed);
    }

    Dog()
    {
        System.out.println("Dog-DC");
    }
}

package C_06292024;

public class Lab73 {
    public static void main(String[] args) {
        Car c=new Car("Lambo");

        Car.Engine engine=c.new Engine("400CC");
engine.start();
        c.drive();


//        Car.Engine.GearBox gearBox=c.new GearBox();
    }
}

class Car{
    String make;

    public Car(String make) {
        this.make = make;
    }

    void drive()
    {
        System.out.println("You can drive car");
    }

    class Engine{

        String hoursepower;

        public Engine(String hoursepower) {
            this.hoursepower = hoursepower;
        }

        void start(){
            System.out.println("ENgine is started!!--> "+ make);
        }
class GearBox{
            void m2()
            {
                System.out.println("m2");
            }

            class PP{

                class oo{

                }
            }
}

    }
}

package C_06242024.Abstraction.CarEx;

public  abstract class Car  extends Engine{
    @Override
    void start() {
        System.out.println("Starting the car");
    }

    @Override
    void stop() {
        System.out.println("Stop the car");
    }

    @Override
    void partGearBox() {
        System.out.println("Assemble the gearbox");
    }

    @Override
    void openCar() {

    }

    abstract void brakeMech();
}

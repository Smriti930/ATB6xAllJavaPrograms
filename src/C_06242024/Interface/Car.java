package C_06242024.Interface;

public class Car implements Brake,Engine {
    @Override
    public void applyBrake() {
        System.out.println("Applying Brake");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine");
    }
}

package C_06242024.Interface;

public class Lab65 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.startEngine();
        c1.stopEngine();
        c1.applyBrake();

        c1.haltingEngineStops();
        c1.haltingEngineJustStart();
    }
}

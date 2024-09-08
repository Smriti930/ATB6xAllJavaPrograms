package C_06242024.Interface;

public interface Engine {
    void startEngine();
    void stopEngine();


    default void haltingEngineJustStart()
    {
        System.out.println("Halt the engine");
    }

    default void haltingEngineStops()
    {
        System.out.println("Halt the engine");
    }

    static void M1(){
        System.out.println("M1");
    }
}

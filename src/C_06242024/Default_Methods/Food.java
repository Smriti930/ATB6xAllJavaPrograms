package C_06242024.Default_Methods;

public interface Food {
  void rice();
 void chapati();

    default void curry() {
        System.out.println("Curry");
    }
}

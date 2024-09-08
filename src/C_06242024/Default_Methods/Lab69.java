package C_06242024.Default_Methods;

public class Lab69 {
    public static void main(String[] args) {
        prepare_food food=new prepare_food();
        food.chapati();
        food.rice();
        //calling default methods
        food.curry();
    }
}

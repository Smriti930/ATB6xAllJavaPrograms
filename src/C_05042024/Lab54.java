package A06052024;

public class Lab54 {
    public static void main(String[] args) {
        //without any return type and parameter
        saySomethingPlease();

        //no return type with parameter
        sayHelloToYou("Smriti");

        // parameters with no return type
        sumTwoBad(4,5);

        //Return with parameter
        sumofTwoGood(3,4);

    }

     static int sumofTwoGood(int a,int b) {
         return a+b;
    }

    static void sumTwoBad(int a,int b) {
         System.out.println(a+b);
    }

    private static void sayHelloToYou(String name) {
        System.out.println("Hello"+" ");
    }

    private static void saySomethingPlease() {
        System.out.println("No return type no parameter");
    }
}

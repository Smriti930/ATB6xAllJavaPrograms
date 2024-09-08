package C_07072024.NestedClass;

public class anoyMain {
    public static void main(String[] args) {
        anoy an=new anoy() {
            @Override
            void A() {
                System.out.println("Printing A");
            }

            @Override
            void B() {
                System.out.println("Printing B");
            }
        };

        an.A();
        an.B();
    }
}

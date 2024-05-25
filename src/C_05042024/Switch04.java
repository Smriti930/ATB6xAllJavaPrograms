package C_05042024;

public class Switch04 {
    public static void main(String[] args) {
        char code='A';
       int var =  switch (code){
            case 'A':
                yield 65;

            case 'B':
                yield 66;

            default:
                System.out.println("Not able to find");
                throw new IllegalStateException("Error");
        };


    }
}

package C_05042024;

public class Switch03 {
    public static void main(String[] args)  {
        int a, b, exp = 10;
        a = b = 5;
        exp *= ++a * 10 / b++ + --a;
        System.out.println("exp = " +exp);
        System.out.println(b++ + --a);
        System.out.println(exp*++a * 10 );
        System.out.println(b++);
        System.out.println(--a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(++b);
    }
//    public static void main(String[] args) {
//        char value = 'z';
//        switch (value) {
//            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowel");
//            default -> System.out.println("consonent");
//
//        };
//    }
    }

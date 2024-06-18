package A06052024;
//Functions
public class Lab55 {
    public static void main(String[] args) {
main(5);
main("Smriti");
String[] name={"1","2","3"};
main(name,"Smriti");
    }
    static void main(int a)
    {
        System.out.println(a);
    }

    static void main(String a)
    {
        System.out.println(a);
    }

    static String main(String[] a, String b)
    {
        System.out.println(a);
        return "Hello";
    }

    static void new_fun()
    {
        main(new String[]{"12"});
    }
}

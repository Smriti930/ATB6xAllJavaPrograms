package C_09082024.Collections;
//Generics example apart from collection
public class Lab104 {
    public static void main(String[] args) {
printF(3,4);
printF("Smriti","Anand");
printF(true,false);
printF(3.4, 4.5);
    }

    private  static <Smriti> void printF(Smriti i,Smriti i1)
    {
        System.out.println(i);
        System.out.println(i1);
    }
}

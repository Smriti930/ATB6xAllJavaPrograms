package A06052024;
//Stringbuilder and stringbuffer use
public class Lab46 {
    public static void main(String[] args) {
        String s1="Smriti";
        String s2=new String("Smriti");

        StringBuffer strngbuff=new StringBuffer("Smriti");
        strngbuff.append("Anand");

        System.out.println(" "+strngbuff);

        StringBuilder strngbuid=new StringBuilder("Smriti");
        strngbuid.append("Anand");
        System.out.println(" "+strngbuid);
    }
}

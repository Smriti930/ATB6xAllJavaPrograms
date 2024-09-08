package C_07072024.EnumAndWrapperClasses;
//wrapper class
public class Lab64 {

    public static void main(String[] args) {
        int x=123;
//    String s1=x;
//    String s2=(String)x;
        String s1=String.valueOf(x);

        System.out.println(s1);//123

        Character ch='a';
        char ch2=ch;//wrapper to primitive

        Boolean b=true;
        Long l1=34l;
        Double d1=90.0;
        Float f1=90.89f;

        Integer intObj=Integer.valueOf(5);

        System.out.println(intObj);//5

        //primitive to wrapper
        Integer a2=89;

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483648
        System.out.println(Integer.max(4,5));//5
        System.out.println(Integer.min(4,5));//4
    }
}

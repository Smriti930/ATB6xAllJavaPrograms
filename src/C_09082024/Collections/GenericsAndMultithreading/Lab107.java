package GenericsAndMultithreading;
//find maximum of 3 numbers using generics
public class Lab107 {
    public static<T extends Comparable> T fun1(T a,T b,T c)
    {
        T max=a;
        if(b.compareTo(max)>0)
            max=b;
        if(c.compareTo(max)>0)
            max=c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(fun1(23, 54, 67));
        System.out.println(fun1(2.3, 4.5, 6.7));
        System.out.println(fun1("Smriti", "Raj", "Rahul"));

    }

    }


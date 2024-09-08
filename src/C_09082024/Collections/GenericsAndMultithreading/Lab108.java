package GenericsAndMultithreading;
//Generics
public class Lab108 {
    public static void main(String[] args) {
Test<Integer> i=new Test<>(10);
        System.out.println(i.getObject());

        Test<String> i1=new Test<>("Smriti");
        System.out.println(i1.getObject());
    }

}
class Test<T>{
    T obj;
    Test(T obj)
    {
        this.obj=obj;
    }
    public T getObject()
    {
        return this.obj;
    }
}
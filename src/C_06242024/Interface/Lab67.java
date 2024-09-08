package C_06242024.Interface;

public class Lab67 {

}


class test extends B1{

    @Override
    void mtb() {
        System.out.println("MTB");
    }

    @Override
    public void atb() {
        System.out.println("ATB");
    }
}

abstract class B1 implements Course{
    abstract  void mtb();
}
interface Course{
    void atb();
}
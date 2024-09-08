package Threading12Aug;

public class Sync02 {
    public static void main(String[] args) {
        Case1 c=new Case1("A");
        c.start();
        Case1 c1=new Case1("B");
        c1.start();
    }
}

class Case1 extends Thread{
    public Case1(String name){
        super(name);
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"->"+Thread.currentThread().getName());
        }
    }
    void m1(){
        System.out.println("m1 method");
    }

    void m2(){
        System.out.println("m2 method");
    }
}

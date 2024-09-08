package Threading21Aug.CASES;

public class SyncDemo4 {
    public static void main(String[] args) {
        Sync4 s1=new Sync4();
        A3 a=new A3(s1,"A3");
        a.start();
        B3 b=new B3(s1,"B3");
        b.start();
    }
}
class A3 extends Thread{
    Sync4 s;

    public A3(Sync4 s, String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}
class B3 extends Thread{
    Sync4 s;

    public B3(Sync4 s, String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Sync4{
    synchronized void m1(){
        Thread th=Thread.currentThread();
        for (int i = 1; i <=5; i++) {
            System.out.println(th.getName()+"called by m1"+" "+i+" "+"time");
        }
        try{
            Thread.sleep(1000);
        }catch (Exception exception){

        }
    }

    void m2(){
        Thread th=Thread.currentThread();
        for (int i = 101; i <=105; i++) {
            System.out.println(th.getName()+"called by m2"+" "+i+" "+"time");
        }
        try{
            Thread.sleep(1000);
        }catch (Exception exception){

        }
    }
}




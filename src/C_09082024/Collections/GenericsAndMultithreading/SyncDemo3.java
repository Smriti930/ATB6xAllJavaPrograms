package Threading21Aug.CASES;

public class SyncDemo3 {
    public static void main(String[] args) {
        Sync3 s=new Sync3();
        A2 a=new A2(s,"A2");
        a.start();
        B2 b=new B2(s,"B2");
        b.start();
    }
}
class A2 extends Thread{
    Sync3 s;

    public A2(Sync3 s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}
class B2 extends Thread{
    Sync3 s;

    public B2(Sync3 s, String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Sync3{
    synchronized void m1(){
        Thread th=Thread.currentThread();
        for (int i = 0; i <=5; i++) {
            System.out.println(th.getName()+"called by m1"+" "+i+" "+"time");
        }
        try{
            Thread.sleep(1000);
        }catch (Exception exception){

        }
    }

    synchronized void m2(){
        Thread th=Thread.currentThread();
        for (int i = 1; i <=5; i++) {
            System.out.println(th.getName()+"called by m2"+" "+i+" "+"time");
        }
        try{
            Thread.sleep(1000);
        }catch (Exception exception){

        }
    }
}

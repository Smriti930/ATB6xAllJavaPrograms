package Threading21Aug.CASES;

public class SyncDemo5 {
    public static void main(String[] args) {
        Sync5 s=new Sync5();
        A4 a=new A4(s,"A4");
        a.start();

        B4 b=new B4(s, "B4");
        b.start();
    }
}

class A4 extends Thread{
    Sync5 s;

    public A4(Sync5 s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}

class B4 extends Thread{
    Sync5 s;

    public B4(Sync5 s, String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Sync5{
    synchronized void m1(){
       Thread th=Thread.currentThread();
       for (int i = 1; i <=5; i++) {
            System.out.println(th.getName()+"called by m1"+" "+i+" "+"time");
        }
       try {
            Thread.sleep(1000);
        }catch (Exception exception){

        }
    }

    static synchronized void m2(){
        Thread th=Thread.currentThread();
        for (int i = 101; i <=105; i++) {
            System.out.println(th.getName()+"called by m2"+" "+i+" "+"time");
        }
        try {
            Thread.sleep(1000);
        }catch (Exception exception){

        }
    }
}

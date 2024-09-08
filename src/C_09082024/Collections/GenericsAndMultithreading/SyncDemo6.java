package Threading21Aug.CASES;

public class SyncDemo6 {
    public static void main(String[] args) {
        Sync6 s=new Sync6();
        A6 a=new A6(s,"Thread1");
        a.start();
        B6 b=new B6(s, "Thread2");
        b.start();
    }
}
class A6 extends Thread{
    Sync6 s;
    A6(Sync6 s,String name){
        super(name);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}

class B6 extends Thread{
    Sync6 s;
    B6(Sync6 s, String name){
        super(name);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Sync6{
    static synchronized void m1(){
        Thread th=Thread.currentThread();
        for (int i = 0; i <=5; i++) {
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

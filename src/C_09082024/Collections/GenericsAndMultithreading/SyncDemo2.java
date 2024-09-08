package Threading21Aug.CASES;
//Case of multithreading when all the methods(not synchronized) are called by seperate thread.
public class SyncDemo2 {
    public static void main(String[] args) {
        Sync1 s=new Sync1();
        A1 a=new A1(s,"A1");
        a.start();
        B1 b=new B1(s,"B1");
        b.start();
    }
}
class A1 extends Thread{
    Sync1 s;
    A1(Sync1 s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}

class B1 extends Thread{
    Sync1 s;
    B1(Sync1 s, String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Sync1{
    void m1(){
        Thread th=Thread.currentThread();
        for (int i = 1; i <=5; i++) {
            System.out.println("m1 called by "+th.getName()+" "+ i +"time");
        }
        try{
            Thread.sleep(1000);
        }catch (Exception exception){

        }
    }

    void m2(){
        Thread th=Thread.currentThread();
        for (int i = 1; i <=5; i++) {
            System.out.println("m2 called by "+th.getName()+" "+ i +"time");
        }
        try{
            Thread.sleep(1000);
        }catch (Exception exception){

        }
    }
}

package Threading21Aug.CASES;
//Case of multithreading when all the methods(not synchronized) are called by seperate thread.
public class SyncDemo1 {
    public static void main(String[] args) {
        Sync s1=new Sync();
        Sync s2=new Sync();
        A t1=new A(s1,"Thread1");
        t1.start();
        B t2=new B(s2, "Thread2");
    t2.start();
    }
}
//Extending thread class and calling the method by using object of Sync class
class A extends Thread{
    Sync s;

    public A(Sync s,String tname){
super(tname);
this.s=s;
    }
    public void run(){
        s.m1();
    }
}
//Extending thread class and calling the method by using object of Sync class
class B extends Thread{
    Sync s;

    public B(Sync s, String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
//Create the task-1 to perform by thread inside a method
class Sync{
    void m1(){
        Thread th=Thread.currentThread();
        for (int i = 0; i <=5 ; i++) {
            System.out.println(th.getName() + " - m1 -" +i);
            try {
                Thread.sleep(1000);
            }catch (Exception ex){

            }
        }
    }
    //Create the task-2 to perform by thread inside a method
    void m2(){
        Thread th=Thread.currentThread();
        for (int i = 0; i <=5 ; i++) {
            System.out.println(th.getName() + " - m2 -" +i);
            try {
                Thread.sleep(1000);
            }catch (Exception ex){

            }
        }
    }

}

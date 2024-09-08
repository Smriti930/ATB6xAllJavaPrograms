package Threading12Aug;

public class ThreadDeadlock {
    public static void main(String[] args) {
        final String resource1="ATB";
        final String resource2="MTB";
//resouce1 and resource2 are locked by thread1
        Thread t1=new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Thread 1: Locked resource 1");
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){}
                    synchronized (resource2){
                        System.out.println("Thread 1: Locked resource 2");
                    }
                }
            }
        };
//resouce1 and resource2 are locked by thread2
        Thread t2=new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread 2: Locked resource 2");
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){}
                    synchronized (resource1){
                        System.out.println("Thread 2: Locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

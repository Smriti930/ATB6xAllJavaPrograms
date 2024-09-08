package Threading12Aug;

public class FixwithThreadLocal {
    public static void main(String[] args)throws Exception  {
        safeCounter counter=new safeCounter();
        FixwithThreadLocal threadLocal = new FixwithThreadLocal();
        Thread[] tasks= new Thread[100];

        for (int i = 0; i <100 ; i++) {
            Thread t=new Thread(()->{
                for (int j = 0; j <100 ; j++) {
                    counter.increment();
                }
            });

            tasks[i]=t;
            t.start();
        }

        for (int i = 0; i <100 ; i++) {
            tasks[i].join();
        }
        System.out.println(counter.count);
    }

}


class safeCounter{

    int count = 0;
    private final Object lock = new Object();

    void increment() {
        synchronized (lock) {
            count++;
        }
    }
}

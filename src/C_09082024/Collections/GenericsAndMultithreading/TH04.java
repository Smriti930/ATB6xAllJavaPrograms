package Threading21Aug;

public class TH04 {
    public static void main(String[] args) {
        Runnable  w1=new workerTh04();
        Thread t1=new Thread(w1);

        t1.start();
        for (int i = 0; i < 5; i++) {

                System.out.println(Thread.currentThread().getName());

            }
        }
    }




class workerTh04 implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

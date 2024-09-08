package GenericsAndMultithreading;
//Create a thread using runnable interface
public class Lab113 {

        public static void main(String[] args) {
            //Task1-- go from 1 to 5
            //Task2-- go from 1 to 10

           Runnable w1=new workerThread04();
            Thread t1=new Thread(w1);
            t1.start();

            Runnable w2=new workerThread04();
            Thread t2=new Thread(w2);
            t2.start();
        }
    }

    class workerThread04 implements Runnable {


        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }






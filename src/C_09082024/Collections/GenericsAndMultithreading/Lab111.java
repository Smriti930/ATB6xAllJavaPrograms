package GenericsAndMultithreading;

import java.lang.invoke.MethodHandles;

public class Lab111 {
    public static void main(String[] args) {
        //Task1-- go from 1 to 5
        //Task2-- go from 1 to 10

        ThreadGroup threadGroup = new ThreadGroup(("Workers"));
        workerThread w1 = new workerThread(threadGroup, "W1");
        w1.start();

        workerThread w2 = new workerThread(threadGroup, "W2");
        w2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

     class workerThread extends Thread {

        public workerThread(ThreadGroup threadGroup, String name) {
            super(threadGroup, name);
        }

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




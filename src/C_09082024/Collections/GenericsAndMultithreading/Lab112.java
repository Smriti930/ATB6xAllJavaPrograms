package GenericsAndMultithreading;

public class Lab112 {



        public static void main(String[] args) {
            //Task1-- go from 1 to 5
            //Task2-- go from 1 to 10
Runnable w1=new workerThread1();
            Runnable w2=new workerThread1();



        }
    }

     class workerThread1 implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    Thread.sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

//        public workerThread1(ThreadGroup threadGroup, String name) {
//            super(threadGroup,name);
//        }
//
//        @Override
//        public void run() {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + " " + i);
//                    Thread.sleep(2000);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//            }
//        }





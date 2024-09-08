package Threading12Aug;

public class ThreadLockSolved {
    public static void main(String[] args) {

ThreadLockSolved tdSolution=new ThreadLockSolved();

final Resource1 a=tdSolution.new Resource1();

final Resource2 b=tdSolution.new Resource2();

//Thread1
        Runnable b1=new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    try {
                        Thread.sleep(100);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }

                    //Thread 1 has resource1 but needs resource2 also
                    synchronized (a){
                        System.out.println("In block 1");
                    }
                }
            }
        };

        //Thread 2
        Runnable b2=new Runnable() {
            @Override
            public void run() {
                synchronized (b)
                {
                    //Thread 2 has resource2 but needs resource1 also
                    synchronized (a){
                        System.out.println("In block 2");
                    }
                }
            }
        };
    }
    private class Resource1{
        private int i=10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    private class Resource2{
private int i=20;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}


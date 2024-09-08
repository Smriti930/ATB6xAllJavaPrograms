package Threading12Aug;

public class NotifyDemo {
    public static void main(String[] args) {
Stack st=new Stack();
B obj2=new B(st,"B");
B obj1=new B(st, "A");
    }
}

class Stack {
    int x;
    boolean flag = false;

    synchronized  void push(int x) {
        if (flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.x = x;
        System.out.println("Pushed: " + x);
        flag = true;
        notify();
    }


    synchronized public int pop() {
        if (!flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Popped: " + x);
        try {
            Thread.sleep(1000);
        }catch (Exception exception){
            System.out.println(exception);
        }
        flag = false;
        notify();
        return x;
    }
}

    class A implements Runnable {
        Stack st = null;

        A(Stack st, String name) {
            this.st = st;
            Thread t1 = new Thread(this, name);
            t1.start();
        }

        @Override
        public void run() {
            int a = 1;
            for (int i = 0; i < 10; i++) {
                st.push(a++);
            }
        }
    }

    class B implements Runnable {
        Stack st = null;

        B(Stack st, String name) {
            this.st = st;
            Thread t2 = new Thread(this, name);
            t2.start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                st.pop();
            }
        }

    }





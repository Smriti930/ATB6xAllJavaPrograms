package Threading12Aug;


class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        System.out.println(getName());
    }
}

public class JavaThreadsQuiz
{
    public static void main(String[] args)
    {
        MyThread thread = new MyThread("My_Thread_1.0");

        thread.start();

        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        thread.setName("My_Thread_2.0");
    }
}


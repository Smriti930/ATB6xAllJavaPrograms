package Threading12Aug;

public class Lab115 {
    public static void main(String[] args) {
        WaitforMe waitforMe=new WaitforMe();

        CustomThread customThread=new CustomThread(waitforMe,"Thread-1");
        CustomThread customThread2=new CustomThread(waitforMe,"Thread-2");
customThread.start();
customThread2.start();


    }
}

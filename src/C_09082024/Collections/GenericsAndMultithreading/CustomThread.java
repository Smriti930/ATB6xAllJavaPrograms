package Threading12Aug;

public class CustomThread extends Thread{
WaitforMe wait;
    public CustomThread(WaitforMe wait,String name){
        super(name);
        this.wait=wait;

    }
    public void run(){
        wait.show();
    }
}

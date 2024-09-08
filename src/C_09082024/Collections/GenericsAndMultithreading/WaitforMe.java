package Threading12Aug;

public class WaitforMe {
    synchronized void show(){
        Thread thread= new Thread().currentThread();

        for(int i=0;i<5;i++){
            System.out.println("Name -> " +thread.getName()+ "->"+i);
            try{
                this.wait(1000);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package Threading12Aug;

import java.util.ArrayList;

public class Sync01 {
    public static void main(String[] args) {
        Sync s = new Sync();
        Sync s1 = new Sync();
        s.m1();
        s1.m1();
        s.m2();
        s1.m2();
        s.m3();
        s1.m3();
        s.m4();
        s1.m4();
    }
}



class Sync{
    void m1(){
        synchronized (this.getClass()){
            System.out.println("m1");
            System.out.println("Default object of the class will be locked");
        }
    }
static void m2(){
        synchronized (Sync.class){
            System.out.println("m2");
            System.out.println("Default object of the class will be locked");
        }
}
void m3() {
    synchronized (this) {
        System.out.println("m3");
        System.out.println("Current object of the class will be locked");
    }
}

    void m4(){
        ArrayList l = new ArrayList();
synchronized (l){
    System.out.println("m4");
    System.out.println("Third party object will be locked");
}
    }

}




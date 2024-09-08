package C_06202024.Encapsulation;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass t1=new Test1();
        t1.setBrowser("edge",true);
        t1.openBrowser();
        t1.closeBrowser();
    }
}

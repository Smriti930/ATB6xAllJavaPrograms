package C_06292024;

public class Lab74 {
    public static void main(String[] args) {
       //calling inner class
        OOC.SNIC snic=new OOC.SNIC();
        snic.show();
    }
}

class OOC{
    static int o=10;
    int oa=20;
    static class SNIC{
       void show()
       {
           System.out.println(o);
       }
    }
}

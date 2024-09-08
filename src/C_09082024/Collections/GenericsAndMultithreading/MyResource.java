package Threading12Aug;
//finalize method
import java.io.File;

public class MyResource {
    private File file;
    protected  void finalize() throws Throwable{
        try{
            file.delete();
        }finally {
            super.finalize();
        }
    }
}

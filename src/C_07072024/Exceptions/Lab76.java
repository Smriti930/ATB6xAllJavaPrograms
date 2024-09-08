package C_07072024.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab76 {
    public static void main(String[] args) {
        try{
            String path="c://a.txt";
            File file=new File(path);
            FileReader fileReader=new FileReader(file);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

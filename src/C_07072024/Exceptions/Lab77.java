package C_07072024.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab77 {
    public static void main(String[] args) throws FileNotFoundException{
readFile("c://a.txt");
    }
    static  void readFile(String fileName) throws FileNotFoundException
    {

        FileReader f=new FileReader(new File("c://a.txt"));

    }

}

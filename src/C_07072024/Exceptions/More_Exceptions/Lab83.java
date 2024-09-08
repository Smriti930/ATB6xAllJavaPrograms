package NotUploaded002.Exceptions;

public class Lab83 {
    public static void main(String[] args) {
extracted02();
        System.out.println("main execute");
    }

    private  static void extracted02()
    {
        extracted01();
        System.out.println("Extracted2 executed");
    }
    private  static void extracted01()
    {
        extracted();
        System.out.println("Extracted1 executed");
    }


    private static void extracted()
    {
        try{
            Integer[] i=new Integer[2];
            System.out.println(i[3]);
        }catch (NumberFormatException e)
        {
            System.out.println("Null");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out");
            e.printStackTrace();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

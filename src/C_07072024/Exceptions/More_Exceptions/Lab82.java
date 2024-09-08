package NotUploaded002.Exceptions;

public class Lab82 {
    public static void main(String[] args) {
        try{
            int a=10/10;

        }
        catch (Exception e)
        {
            System.out.println("Catch 01");
        }
        finally {
            System.out.println("Finally 01");
        }
        try{
            int a=10/0;
        }catch (Exception e)
        {
            System.out.println( "Catch 02");
        }finally {
            System.out.println("Finally 02");
        }
        try{
            int a=10/0;
        }catch (Exception e)
        {
            System.out.println( "Catch 03");
        }finally {
            System.out.println("Finally 03");
        }
        try{
            int a=10/20;
        }catch (Exception e)
        {
            System.out.println( "Catch 04");
        }finally {
            System.out.println("Finally 04");
        }
    }
}

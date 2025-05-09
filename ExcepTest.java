import java.io.*;
public class ExcepTest
{
    static inta[]={44,55};
    public static void main(String args[])
    {
        try
        {
            System.out.println("Access Element 3:"+a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown:"+e);
        }
        finally
        {
            

        }
    }
}
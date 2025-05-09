public class ExcepTest1
{
    static int a=7,b=0;
    public static void main(String args[])
    {
        try
        {
            int q=a/b;
            System.out.println("Quotient="+q);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception thrown:"+e);

        }
        finally{
            int q=a/(b+1);
            System.out.println("quotient="+q);
        }
    }
}
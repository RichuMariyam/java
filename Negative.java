import java.util.Scanner;
public class Negative
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=s.nextInt();
        try{
            if(a>0)
            {
                System.out.println("Number Accepted");
            }
            else
            {
                throw new NumberException("You have entered an invalid number");
            }

        }
        catch(NumberException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
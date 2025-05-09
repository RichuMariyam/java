import java.util.Scanner;
public class Authentication
{
    public static void main(String args[])
    {
        String username="Ashish";
        String password="@Ashish123";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the username");
        String u1=s.nextLine();
        System.out.println("Enter the password");
        String u2=s.nextLine();
        try
        {
            if((u1.equals(username))&&(u2.equals(password)))
            {
                System.out.println("Access Granted");
            }
            else
            {
                throw new CredentialException("Invalid Credentials");
            }
        }
        catch(CredentialException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
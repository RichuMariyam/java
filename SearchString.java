import java.util.Scanner;
public class SearchString
{
    public static void main(String args[])
    {
        int i,pos=0;
        boolean state=false;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int num=s.nextInt();
        String word[]=new String[num];
        System.out.println("\nEnter"+num+"\twords:");
        s.nextLine();
        for(i=0;i<num;i++)
        {
            word[i]=s.nextLine();
        
        }
        System.out.println("Enter the element to be searched:");
        String search=s.nextLine();
        for(i=0;i<num;i++)
        {
            if(word[i].equals(search))
            {
                pos=i+1;
                state=true;
                break;

            }
        }
        if(state)
        {
            System.out.println("Elemnts found at position="+pos);
        }
        else
        {
            System.out.println("Element not found!");
        }

    }
}
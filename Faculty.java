import java.util.Scanner;
public class Faculty
{
    int age;
    String name;
    void getdata()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("\nEnter the Faculty Name:");
        name=ob.nextLine();
        System.out.println("Enter the age:");
        age=ob.nextInt();
    
    }
    void display()
    {
        System.out.println("Namee="+name);
        System.out.println("Age="+age);

    }
    public static void main(String args[])
    {
        Faculty f=new Faculty();
        f.getdata();
        System.out.println("\nFaculty Details\n");
        f.display();
    }
    }


import java.util.Scanner;
public class Emp1
{
    int empno;
    String name;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEnter Employee Name:");
        name=scan.nextLine();
        System.out.println("\n\nEnter Employee number:");
        empno=scan.nextInt();
    }
    void display()
    {
        System.out.println("Employee NAme:"+name);
        System.out.println("Employee No:"+empno);
    }
    public static void main(String args[])
    {
     
        Emp1 e=new Emp1();
        e.getdata();
        System.out.println("\n\nEmployee Details\n");
        System.out.println("\n\n.................\n");
        e.display();
    }
}
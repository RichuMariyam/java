import java.util.Scanner;
class Sports
{
    String sport;
    int rating;
    Sports(String sp,int rt)
    {
        sport=sp;
        rating=rt;

    }
}
class Student extends Sports
{
    String grade;
    double overall_per;
    Student(String sp,int rt,String gd,double per)
    {
        super(sp,rt);
        grade=gd;
        overall_per=per;
    }
}
class Result extends Student
{
    Result(String sp,int rt,String gd,double per)
    {
        super(sp,rt,gd,per);
    }
    void display()
    {
        System.out.println("\nSports Details of Student");
        System.out.println("----------------------");
        System.out.println("Sport:"+sport);
        System.out.println("Rating:"+rating);
        System.out.println("\nAcademic Details of Students:");
        System.out.println("----------------------");
        System.out.println("Academic Grade:"+grade);
        System.out.println("Overall PErcentage:"+overall_per);

    }
}
public class School
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sports Details off Students:");
        System.out.print("Sport:");
        String s=sc.next();
        System.out.println("Sport Ratiing out of 10:");
        int r=sc.nextInt();
        System.out.print("Academic Grade a-D:");
        String g=sc.next();
        System.out.println("Overall Percentage:");
        double p=sc.nextDouble();
        sc.close();
        Result obj=new Result(s,r,g,p);
        obj.display();
    }




    }

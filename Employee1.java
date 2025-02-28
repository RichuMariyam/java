class Emp
{
    String empname;
    int empno;
    Emp(int id,String name)
    {
        empno=id;
        empname=name;
    }
    void display()
    {
        System.out.println("Employee Details");
        System.out.println("--------------------");
        System.out.println("Employee ID:"+empno);
        System.out.println("Employee Name:"+empname);
    }
}
public class Employee1 
{
    public static void main(String args[])
    {
        Emp e=new Emp(123,"Riya");
        e.display();
    }
    
}

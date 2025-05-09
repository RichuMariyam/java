class Emp
{
    int empno;
    String empname;
    Emp(int no,String name)
    {
        empno=no;
        empname=name;
    }
    void display()
    {
        System.out.println("Employee Details:");
        System.out.println("-----------------------");
        System.out.println("Employee Name:"+empname);
        System.out.println("Emplyee No:"+empno);
    }
}
public class Employee
{
    
        public static void main(String args[])
        {
            Emp e=new Emp(123,"Riya");
            e.display();
        }
    
    
}

class InheritanceDemo
{
    int id=101;
    String ename="Rini";
}
class Child extends InheritanceDemo
{
    int age=22;
    void putdata()
    {
        System.out.println("ID="+id);
        System.out.println("Name="+ename);
        System.out.println("Age="+age);
    }
}
public class SingleInheritance1
{
    public static void main(String args[])
    {
        Child ob=new Child();
        ob.putdata();
    }
}
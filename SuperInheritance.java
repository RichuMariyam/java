


class Parent
{
    int pid;
    Parent(int id)
    {
        pid=id;
    }
}
class Child extends Parent
{
    String course;
    Child(int pid,String course1)
    {
        super(pid);
        course=course1;
    }
    void putdata()
    {
        System.out.println("ID="+pid);
        System.out.println("Course="+course);
    }
}
public class SuperInheritance
{
    public static void main(String args[])
    {
        Child ob=new Child(101,"MCA");
        ob.putdata();
    }
}
interface Shape
{
    int length=10;
    void display();
}
class Rectangle implements Shape 
{
    int breadth=5;
    public void display()
    {
        System.out.println("Length="+length);
        System.out.println("Breadth="+breadth);
    }
}
public class InterfaceDemo1
{
    public static void main(String args[])
    {
        Rectangle ob=new Rectangle();
        ob.display();
    }
}
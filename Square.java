public class Square
{
    int s;
    void getinput(int side)
    {
        s=side;

    }
    int calArea()
    {
        return s*s;
    }
    public static void main(String args[])
    {
        Square ob=new Square();
        ob.getinput(5);
        System.out.println("Area of square="+ob.calArea());
    }
}
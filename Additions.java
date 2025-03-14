import java.util.Scanner;
class Additions
{
    void sum(int a)
    {
        System.out.println("The sum is:"+(a+a));
    }
    void sum(int a1,int b1)
    {
        System.out.println("The sum is:"+(a1+b1));
    }
    void sum(double x,double y)
    {
        System.out.println("The sum="+(x+y));
    
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Enter two double data type number:");
        double x=s.nextDouble();
        double y=s.nextDouble();
        Additions ob=new Additions();
        ob.sum(a);
        ob.sum(a,b);
        ob.sum(x,y);
    }
}
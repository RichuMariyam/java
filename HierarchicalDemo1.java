import java.util.Scanner;
class Hospital
{
    String hptlname;
    Hospital(String hname)
    {
        hptlname=hname;
    }
}
class Doctor extends Hospital
{
    String DocName;
    Doctor(String hname,String Dname)
    {
        super(hname);
        DocName=Dname;
    }
        void putdata()
        {
            System.out.println("Hospital Name:"+hptlname);
            System.out.println("Doctor Name:"+DocName);
        }
    }

class Nurse extends Hospital
{
    String nuname;
    Nurse(String hname,String nname)
    {
        super(hname);
        nuname=nname;
    }
        void putdata()
        {
            System.out.println("Hospital Name:"+hptlname);
            System.out.println("Nurse Name:"+nuname);
        }
    }

public class HierarchicalDemo1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Details");
        System.out.println("------------------------");
        System.out.println("Hospital:");
        String h=s.nextLine();
        System.out.println("Doctor:");
        String d=s.nextLine();
        System.out.println("Nurse");
        String n=s.nextLine();
        Doctor ob1=new Doctor(h,d);
        System.out.println("Hospial-Doctor Details");
        System.out.println("---------------------------");
        ob1.putdata();
        Nurse ob2=new Nurse(h,n);
        System.out.println("Nurse Details");
        System.out.println("-----------------------------");
        ob2.putdata();
        s.close();
    }
}


class Manager
{
    int salary=100000;
}
class TeamLead extends Manager
{
    String teamname="deVops";
}
class Developer extends TeamLead
{
    int prjcid=1001;
    void putdata()
    {
        System.out.println("Salary:-"+salary);
        System.out.println("Team Name:-"+teamname);
        System.out.println("Project ID:-"+prjcid);
    }
}
public class CompanyDetails
{
    public static void main(String args[])
    {
        Developer ob=new Developer();
        ob.putdata();
    }
}
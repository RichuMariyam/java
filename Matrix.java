import java.util.Scanner;
public class Matrix
{
    public static void main(String args[])
    {
        int row,cols,m,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows\n");
        row=s.nextInt();
        System.out.println("Enter the number of columns\n");
        cols=s.nextInt();
        int matA[][]=new int[row][cols];

        System.out.println("Enter the elements\n");
        for(m=0;m<row;m++)
        {
            for(n=0;n<cols;n++)
            {
                matA[m][n]=s.nextInt();

            }
        }
        System.out.println("Matrix");
        System.out.println("--------------");
        for(m=0;m<row;m++)
        {
            for(n=0;n<cols;n++)
            {
                System.out.print(matA[m][n]+"\t");
            
            }
            System.out.println();
        }
    }
}
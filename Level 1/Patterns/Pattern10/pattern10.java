//this pattern resembles swastika
import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1)
                {
                    if(j<=n/2+1 || j==n)
                    {
                        System.out.print("*\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
                else if(i>1 && i<n/2+1)
                {
                    if(j==n/2+1 || j==n)
                    {
                        System.out.print("*\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
                else if(i==n/2+1)
                {
                    System.out.print("*\t");
                }
                else if(i>n/2+1 && i<n)
                {
                    if(j==1 || j==n/2+1)
                    {
                        System.out.print("*\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
                else
                {
                    if(j>=n/2+1 || j==1)
                    {
                        System.out.print("*\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}

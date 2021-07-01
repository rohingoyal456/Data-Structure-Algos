import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int n=input.nextInt();
        for(int i=1;i<=n/2+1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<n/2+1)
                {
                    if(j==1 || j==n)
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
                    if(j==1 || j==n/2+1 || j==n)
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
        int space=1;
        int star=n/2;
        for(int i=1;i<n/2+1;i++)
        {
            for(int j=1;j<=star;j++)
            {
                if(j==1 || j==star)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++)
            {
                if(j==1 || j==star)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            space+=2;
            star--;
            System.out.println();
        }   
    }
}

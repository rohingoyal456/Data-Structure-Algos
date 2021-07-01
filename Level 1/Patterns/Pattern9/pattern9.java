//This pattern resembles arrow
import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n=input.nextInt();
        int space=n/2;
        int star=1;
        int a=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=space;j++)
            {
                if(i!=n/2+1)
                {
                    System.out.print("\t");
                }
            }
            if(i==n/2+1)
            {
                a=star;
                star=n;
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*\t");
            }
            if(i==n/2+1)
            {
                star=a;
            }
            if(i<n/2+1)
            {
                star++;
            }
            else
            {
                star--;
            }
            System.out.println();
        }
    }
}

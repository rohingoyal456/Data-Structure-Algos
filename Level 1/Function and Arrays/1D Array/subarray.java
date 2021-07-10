import java.util.Scanner;
public class subarray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.println("The output is:");
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]+"\t");
                }
                System.out.println();
            }
        }
    }
}

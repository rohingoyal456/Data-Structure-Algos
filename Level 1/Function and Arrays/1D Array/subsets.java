import java.util.Scanner;
import java.lang.*;
public class subsets {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        int tns=(int)Math.pow(2, n);
        int i=0;
        while(i<tns)
        {
            int binary_number=bn(i,2);
            int div=(int)Math.pow(10, n-1);
            for(int j=0;j<n;j++)
            {
                int q=binary_number/div;
                int r=binary_number%div;
                if(q==1)
                {
                    System.out.print(a[j]+"\t");
                }
                else
                {
                    System.out.print("-\t");
                }
                div/=10;
                binary_number=r;
            }
            System.out.println();
            i++;
        }
    }
    public static int bn (int n, int b)
    {
        int ans=0;
        int power=1;
        while(n!=0)
        {
            int rem=n%b;
            n/=b;
            ans+=rem*power;
            power*=10;
        }
        return ans;
    }
}

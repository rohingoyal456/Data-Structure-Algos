// this pattern is also known as Pascal Triangle
import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n=input.nextInt();
        int a=1;
        int b=1;
        int c=0;
        for(int i=0;i<=n-1;i++)
        {
            int val=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(val+"\t");
                val=val*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}

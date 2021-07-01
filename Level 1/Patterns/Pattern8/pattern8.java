import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n=input.nextInt();
        int space=2*n-3;       //Number of space in first row= Number of columns-2
        for(int i=1;i<=n;i++)
        {
            int ival=1;
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.print(ival+"\t");
                    break;
                }
                System.out.print(ival+"\t");
                ival++;
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print("\t");
            }
            if(i==n)
            {
                ival--;
            }
            for(int j=ival;j>=1;j--)
            {
                System.out.print(ival+"\t");
                ival--;
            }
            space-=2;
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n=input.nextInt();
        int space=n/2;
        int star=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*\t");
            }
            if(i<n/2+1)
            {
                space--;
                star+=2;
            }
            else
            {
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
}

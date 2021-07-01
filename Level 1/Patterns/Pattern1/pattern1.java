import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n=input.nextInt();
        int space=0;
        int star=n;
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
            System.out.println();
            star--;
            space++;
        }
    }
}

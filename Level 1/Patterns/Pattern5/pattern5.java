// The strategy for this pattern is first try to make a solid diamond and then try to remove those stars which are required to make it 
// as hollow diamond.
import java.util.Scanner;
public class pattern5 {
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
                //this if condition will help to make it hollow
                if(j==1 || j==star)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
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

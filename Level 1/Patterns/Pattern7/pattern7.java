import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n=input.nextInt();
        int space=n/2;
        int star=1;
        int oval=1;
        for(int i=1;i<=n;i++)
        {
            int ival=oval;
            for(int j=1;j<=space;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print(ival+"\t");
                if(j<=star/2)
                {
                    ival++;
                }
                else
                {
                    ival--;
                }
            }
            if(i<n/2+1)
            {
                space--;
                star+=2;
                oval++;
            }
            else
            {
                space++;
                star-=2;
                oval--;
            }
            System.out.println();
        }
    }
}

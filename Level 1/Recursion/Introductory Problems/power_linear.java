import java.util.Scanner;

public class power_linear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        System.out.println("Enter the exponent:");
        int x=input.nextInt();
        int ans=power(n,x);
        System.out.println(ans);
    }
    public static int power(int n,int x)
    {
        if(x==0)
        {
            return 1;
        }
        int ans= n*power(n,x-1);
        return ans;
    }
}

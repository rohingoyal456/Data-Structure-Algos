import java.util.*;
public class power_logarithmic {
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
        int npxby2=power(n, x/2);
        int npx=npxby2*npxby2;
        if(x%2!=0)
        {
            npx*=n;
        }        
        return npx;
    }
}

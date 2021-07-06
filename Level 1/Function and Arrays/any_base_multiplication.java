import java.util.Scanner;

public class any_base_multiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the base:");
        int b=input.nextInt();
        System.out.println("Enter the first number:");
        int n1=input.nextInt();
        System.out.println("Enter the second number:");
        int n2=input.nextInt();
        int result=getProduct(n1, n2, b);
        System.out.println(result);

    }
    public static int getProduct(int n1,int n2,int b)
    {
        int ans=0;
        int power=1;
        while(n2!=0)
        {
            int rem=n2%10;
            n2/=10;
            int pwsd=getSingleValueProduct(n1, rem, b);
            ans=anyBaseAddition(ans, pwsd*power, b);
            power*=10;
        }
        return ans;
    }
    public static int getSingleValueProduct(int n1,int n2,int b)
    {
        int ans=0;
        int power=1;
        int carry=0;
        while(n1!=0 || carry!=0)
        {
            int rem1=n1%10;
            n1/=10;
            int mul=rem1*n2+carry;
            if(mul>b)
            {
                carry=mul/b;
                mul=mul%b;
            }
            else
            {
                carry=0;
            }
            ans+=mul*power;
            power*=10;
        }
        return ans;
    }
    public static int anyBaseAddition(int n1,int n2,int b)
    {
        int ans=0;
        int power=1;
        int carry=0;
        while(n1!=0 || n2!=0 || carry!=0)
        {
            int rem1=n1%10;
            int rem2=n2%10;
            n1/=10;
            n2/=10;
            int sum=rem1+rem2+carry;
            int q=sum/b;
            int r=sum%b;
            ans+=r*power;
            carry=q;
            power*=10;
        }
        return ans;
    }
}

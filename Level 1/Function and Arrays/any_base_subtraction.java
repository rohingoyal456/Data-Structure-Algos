import java.util.*;
public class any_base_subtraction {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the base:");
        int b=input.nextInt();
        System.out.println("Enter the first number:");
        int n1=input.nextInt();
        System.out.println("Enter the second number:");
        int n2=input.nextInt();
        int result=anyBaseSubtraction(n1, n2, b);
        System.out.println(result);
    }
    public static int anyBaseSubtraction(int n1,int n2,int b)
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
            int diff=rem2+carry-rem1;
            if(diff<0)
            {
                diff=diff+b;
                carry=-1;
            }
            else
            {
                carry=0;
            }
            ans+=diff*power;
            power*=10;
        }
        return ans;
    }
}

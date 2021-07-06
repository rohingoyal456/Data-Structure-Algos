// For converting any number from a particular base to any other base, first you have to convert the number into decimal and then from
// decimal to destination base.

import java.util.Scanner;
public class any_base_to_any_base {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the source base:");
        int s=input.nextInt();
        System.out.println("Enter the destination base:");
        int d=input.nextInt();
        System.out.println("Enter the number:");
        int n=input.nextInt();
        int temp=anyBaseToDecimal(n, s);
        int result=DecimalToAnyBase(temp, d);
        System.out.println(result);
    }
    public static int DecimalToAnyBase(int n,int d)
    {
        int ans=0;
        int power=1;
        while(n!=0)
        {
            int rem=n%d;
            n/=d;
            ans+=rem*power;
            power*=10;
        }
        return ans;
    }
    public static int anyBaseToDecimal(int n,int s)
    {
        int ans=0;
        int power=0;
        while(n!=0)
        {
            int rem=n%10;
            n/=10;
            ans+=rem*(int)Math.pow(s,power);
            power++;
        }
        return ans;
    }
}

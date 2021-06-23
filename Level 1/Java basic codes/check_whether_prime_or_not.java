import java.util.Scanner;

public class check_whether_prime_or_not {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            boolean prime=true;
            int num=input.nextInt();
            for(int j=2;j*j<=num;j++)
            {
                if(num%j==0)
                {
                    prime=false;
                    break;
                }
            }
            if(prime)
            {
                System.out.println("prime number");
            }
            else
            {
                System.out.println("Not a prime number");
            }
        } 
    }
}

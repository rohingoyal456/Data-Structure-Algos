import java.util.Scanner;

public class print_all_primes_till_N {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the range:");
        int low=input.nextInt();
        int high=input.nextInt();
        for(int i=low;i<=high;i++)
        {
            boolean prime=true;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    prime=false;
                    break;
                }
            }
            if(prime)
            {
                System.out.println(i);
            }
        }
    }
}

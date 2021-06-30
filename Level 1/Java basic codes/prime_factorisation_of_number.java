import java.util.Scanner;

public class prime_factorisation_of_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        for(int div=2;div*div<num;div++)
        {
            while(num%div==0)
            {
                System.out.print(div+" ");
                num/=div;
            }
        }
        if(num!=1)
        {
            System.out.println(num);
        }
    }
}

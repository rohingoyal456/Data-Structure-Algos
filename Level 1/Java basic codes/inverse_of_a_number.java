import java.util.Scanner;

public class inverse_of_a_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int i=1;
        int ans=0;
        while(num!=0)
        {
            int last_digit=num%10;
            ans+=i*(int)Math.pow(10, last_digit-1);
            num/=10;
            i++;
        }
        System.out.println("The inverse is "+ans);
    }
}

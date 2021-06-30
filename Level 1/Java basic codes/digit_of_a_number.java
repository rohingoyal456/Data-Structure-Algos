import java.util.Scanner;

public class digit_of_a_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int temp=num;
        int power=1;
        while(temp!=0)
        {
            if(temp>=10)
            {
                power=power*10;
            }
            temp/=10;
        }
        while(power!=0)
        {
            int digit=num/power;
            System.out.println(digit);
            num%=power;
            power/=10;
        }
    }
}

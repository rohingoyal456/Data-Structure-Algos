//sample input num=567845 k=2 
//sample output ans=455678
import java.util.Scanner;
import java.lang.*;
public class rotate_a_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to be rotated:");
        int num=input.nextInt();
        System.out.println("Enter the value to how many digits to be rotated to right:");
        int k=input.nextInt();
        int temp=num;
        int count=0;

        //find the number of digits
        while(temp!=0)
        {
            temp/=10;
            count++;
        }

        //bring value of k in range
        k=k%count;
        if(k<0)
        {
            k+=count;
        }

        //set value of div and mul
        int div=(int)Math.pow(10, k);
        int mul=(int)Math.pow(10, count-k);

        //find q and r
        int q=num/div;
        int r=num%div;

        //update ans and print it
        int ans=(r*mul)+q;
        System.out.println(ans);

    }
}

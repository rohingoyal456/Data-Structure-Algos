import java.util.Scanner;

public class Print_Decreasing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        Print_Decreasing(n);
    }
    public static void Print_Decreasing(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        Print_Decreasing(n-1);
    }
}

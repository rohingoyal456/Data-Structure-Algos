import java.util.Scanner;

public class Print_increasing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        Print_increasing(n);
    }
    public static void Print_increasing(int n)
    {
        if(n==0)
        {
            return;
        }
        Print_increasing(n-1);
        System.out.println(n);
    }
}

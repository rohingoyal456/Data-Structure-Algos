import java.util.Scanner;

public class Factorial_using_recursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fac=n*factorial(n-1);
        return fac;
    }
}

import java.util.Scanner;

public class display_Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        display(a, 0);          
    }
    public static void display(int arr[],int idx)
    {
        if(idx==arr.length)
        {
            return;
        }
        System.out.println(arr[idx]);
        display(arr, idx+1);
    }
}

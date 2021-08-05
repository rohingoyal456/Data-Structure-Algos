import java.util.Scanner;

public class display_Reverse_Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();    
        }
        display(a, 0);
    }
    public static void display(int arr[], int idx)
    {
        if(idx==arr.length)
        {
            return;
        }
        display(arr, idx+1);
        System.out.println(arr[idx]);
    }
}

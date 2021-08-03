import java.util.Scanner;
public class maxElement_in_Array {
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
        System.out.println(maxElement(a, 0));
    }
    public static int maxElement(int arr[],int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
        int max=maxElement(arr, idx+1);
        if(max<arr[idx])
        {
            max=arr[idx];
        }
        return max;
    }
}

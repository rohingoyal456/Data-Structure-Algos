import java.util.Scanner;

public class all_indices_of_array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=input.nextInt();
        System.out.println("Enter the elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.println("Enter the element for which index to be found:");
        int x=input.nextInt();
        int arr[]=allIndices(a, 0, x, 0);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static int[] allIndices(int arr[],int idx,int x,int fsf)
    {
        if(idx==arr.length)
        {
            int a[]=new int[fsf];
            return a;
        }
        if(arr[idx]==x)
        {
            fsf=fsf+1;
        }
        int rr[]=allIndices(arr, idx+1, x, fsf);
        if(arr[idx]==x)
        {
            rr[fsf-1]=idx;
        }
        return rr;
    }
}

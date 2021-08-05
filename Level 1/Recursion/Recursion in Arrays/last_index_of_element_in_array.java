import java.util.Scanner;

public class last_index_of_element_in_array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.println("Enter the element to search:");
        int x=input.nextInt();
        System.out.println(last_index(a,0,x));
    }
    public static int last_index(int arr[],int idx,int x)
    {
        if(idx==arr.length)
        {
            return -1;
        }
        int lindex=last_index(arr, idx+1, x);
        if(lindex==-1)
        {
            if(arr[idx]==x)
            {
                return idx;
            }
            else 
            {
                return -1;
            }
        }
        else
        {
            return lindex;
        }
    }
}

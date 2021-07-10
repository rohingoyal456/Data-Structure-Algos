//You are given a number n, representing the size of array a. You are given n numbers, representing elements of the array a.
//You are given another number d. You are required to find the ceil and floor of d in array a.
import java.util.Scanner;
public class Broken_Economy {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.println("Enter the number for the denomination:");
        int data=input.nextInt();
        int left=0;
        int right=n-1;
        int ceil=-1, floor=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(a[mid]==data)
            {
                ceil=a[mid];
                floor=a[mid];
                break;
            }
            else if(a[mid]>data)
            {
                ceil=a[mid];
                right=mid-1;
            }
            else
            {
                floor=a[mid];
                left=mid+1;
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }
}

import java.util.Scanner;
public class search_in_sorted2Darray_by_BinarySearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n for the square matrix");
        int n=input.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the element to be searched:");
        int data=input.nextInt();
        int i=n-1;
        int j=0;
        boolean found=false;
        while(i<n && j<n)
        {
            if(a[i][j]>data)
            {
                i--;
            }
            else if(a[i][j]<data)
            {
                j++;
            }
            else
            {
                System.out.println(i+"\n"+j);
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Not Found");
        }
    }
}

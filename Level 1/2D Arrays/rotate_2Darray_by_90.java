import java.util.Scanner;

public class rotate_2Darray_by_90 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n for square matrix:");
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

        //Taking transpose of the matrix

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }

        //Swapping the columns now
        int left=0;
        int right=n-1;
        while(left<right)
        {
            for(int row=0;row<n;row++)
            {
                int temp=a[row][left];
                a[row][left]=a[row][right];
                a[row][right]=temp;
            }  
            left++;
            right--; 
        }

        //Printing the matrix
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

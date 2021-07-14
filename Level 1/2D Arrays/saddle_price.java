//The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.

import java.util.Scanner;
public class saddle_price {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n for the square matrix:");
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
        saddleprice(a, n);
    }
    public static void saddleprice(int a[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            int min=a[i][0];
            int cno=0;
            for(int j=1;j<n;j++)
            {
                if(min>a[i][j])
                {
                    min=a[i][j];
                    cno=j;
                }
            }

            boolean ans=true;
            for(int row=0;row<n;row++)
            {
                if(min<a[row][cno])
                {
                    ans=false;
                    break;
                }
            }

            if(ans==true)
            {
                System.out.println(min);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}

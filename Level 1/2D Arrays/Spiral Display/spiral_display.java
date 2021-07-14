import java.util.Scanner;
public class spiral_display {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=input.nextInt();
        System.out.println("Enter number of columns");
        int m=input.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=input.nextInt();
            }
        }
        spiral(a, n, m);
    }
    public static void spiral(int a[][] ,int n, int m)
    {
        int rmin=0;
        int cmin=0;
        int rmax=n-1;
        int cmax=m-1;
        int counter=0;
        while(counter<n*m)
        {
            //Left Boundary
            for(int row=rmin;row<=rmax && counter<n*m;row++)
            {
                System.out.println(a[row][cmin]);
                counter++;
            }
            cmin++;

            //Bottom Boundary
            for(int col=cmin;col<=cmax && counter<n*m;col++)
            {
                System.out.println(a[rmax][col]);
                counter++;
            }
            rmax--;

            //Right Boundary
            for(int row=rmax;row>=rmin && counter<n*m;row--)
            {
                System.out.println(a[row][cmax]);
                counter++;
            }
            cmax--;

            //Top Boundary
            for(int col=cmax;col>=cmin && counter<n*m;col--)
            {
                System.out.println(a[rmin][col]);
                counter++;
            }
            rmin++;
        }
    }
}

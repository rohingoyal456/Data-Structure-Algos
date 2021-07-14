import java.util.Scanner;

public class ring_rotate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=input.nextInt();
        System.out.println("Enter number of columns:");
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
        System.out.println("Enter the shell no:");
        int s=input.nextInt();
        System.out.println("Enter the  rotation number to rotate shell in an anticlockwise manner:");
        int r=input.nextInt();
        ringRotate(a,s,r);
        display(a);
    }
    public static void ringRotate(int a[][], int s,int r)
    {
            int[] la=fill1Dfrom2D(a, s, r);
            rotate(la, r);
            fill2Dfrom1D(a, la, s);
    }
    public static int[] fill1Dfrom2D(int a[][],int s,int r)
    {
        int rmin=s-1;
        int rmax=a.length-s;
        int cmin=s-1;
        int cmax=a[0].length-s;
        int size=2*(rmax+cmax-rmin-cmin);
        int la[]=new int[size];
        int index=0;
        
        //Left Boundary
        for(int row=rmin;row<=rmax;row++)
        {
            la[index]=a[row][cmin];
            index++;
        }
        cmin++;

        //Bottom Boundary
        for(int col=cmin;col<=cmax;col++)
        {
            la[index]=a[rmax][col];
            index++;
        }
        rmax--;

        //Right Boundary
        for(int row=rmax;row>=rmin;row--)
        {
            la[index]=a[row][cmax];
            index++;
        }
        cmax--;

        //Top Boundary
        for(int col=cmax;col>=cmin;col--)
        {
            la[index]=a[rmin][col];
            index++;
        }

        return la;
    }

    public static void rotate(int a[],int r)
    {
        r=r%a.length;
        if(r<0)
        {
            r=r+a.length;
        }
        reverse(a, 0, a.length-1);
        reverse(a, 0, r-1);
        reverse(a, r, a.length-1);
        
    }
    public static void reverse(int a[],int left,int right)
    {
        while(left<right)
        {
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
    public static int[][] fill2Dfrom1D(int a[][],int la[],int s)
    {
        int rmin=s-1;
        int rmax=a.length-s;
        int cmin=s-1;
        int cmax=a[0].length-s;
        int index=0;
        
        //Left Boundary
        for(int row=rmin;row<=rmax;row++)
        {
            a[row][cmin]=la[index];
            index++;
        }
        cmin++;

        //Bottom Boundary
        for(int col=cmin;col<=cmax;col++)
        {
            a[rmax][col]=la[index];
            index++;
        }
        rmax--;

        //Right Boundary
        for(int row=rmax;row>=rmin;row--)
        {
            a[row][cmax]=la[index];
            index++;
        }
        cmax--;

        //Top Boundary
        for(int col=cmax;col>=cmin;col--)
        {
            a[rmin][col]=la[index];
            index++;
        }
        return a;
    }
    public static void display(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

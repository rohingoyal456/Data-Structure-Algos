import java.util.*;
public class differenece_of_two_arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of elements you want to insert in the first array:");
        int n1=input.nextInt();
        int a1[]=new int[n1];
        System.out.println("Enter the elements:");
        for(int i=0;i<n1;i++)
        {
            a1[i]=input.nextInt();
        }
        System.out.println("Enter number of elements you want to insert in the second array:");
        int n2=input.nextInt();
        int a2[]=new int[n2]; 
        System.out.println("Enter the elements:");
        for(int i=0;i<n2;i++)
        {
            a2[i]=input.nextInt();
        }
        int a3[]=new int[Math.max(n1, n2)];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=a3.length-1;
        int carry=0;
        while(k>=0)
        {
            int diff=0;
            if(j>=0)
            {
                diff=a2[j]+carry;
            }
            if(i>=0)
            {
                diff=diff-a1[i];
            }
            if(diff<0)
            {
                carry=-1;
                diff=diff+10;
            }
            else
            {
                carry=0;
            }
            a3[k]=diff;
            k--;
            i--;
            j--;
        }
        System.out.println("The difference of two arrays is:");
        for(i=0;i<a3.length;i++)
        {
            if(i==0 && a3[i]==0)
            {
                continue;
            }
            else
            {
                System.out.println(a3[i]);
            }
        }
    }
}

import java.util.*;
import java.io.*;
import java.lang.*;
public class rotate_an_array {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
           a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
        rotate(a, k);
        display(a);
    }
    public static void display(int[] a)
    {
        StringBuilder sb = new StringBuilder();
        for(int val: a)
        {
          sb.append(val + " ");
        }
        System.out.println(sb);
    }
    public static void rotate(int a[],int k)
    {
        reverse(a, 0, a.length-1);
        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
    }
    public static void reverse(int a[],int left, int right)
    {
        while(left<=right)
        {
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
}

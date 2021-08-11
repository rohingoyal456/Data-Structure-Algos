// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number "tar".
// 4. Complete the body of printTargetSumSubsets function - without changing signature - to calculate and print all subsets of given elements, the contents of which sum to "tar". Use sample input and output to get more idea.
// Sample Input -> 5 10 20 30 40 50 60
// Sample Output -> 10, 20, 30, . || 10, 50, .  || 20, 40, .

import java.util.Scanner;
public class target_Sum_Subsets {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=input.nextInt();
        System.out.println("Enter the elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.println("Enter the target value:");
        int target=input.nextInt();
        printTargetSumSUbsets(a, 0, "", 0, target);
    }
    public static void printTargetSumSUbsets(int arr[],int idx,String asf, int ssf, int target)
    {
        if(ssf>target)
        {
            return;
        }
        if(idx==arr.length)
        {
            if(ssf==target)
            {
                System.out.println(asf+".");
                return;
            }
            else 
            {
                return;
            }
        }
        //Yes
        printTargetSumSUbsets(arr, idx+1, asf+arr[idx]+", ", ssf+arr[idx], target);
        // No
        printTargetSumSUbsets(arr, idx+1, asf, ssf, target);
    }
}

// 1. You are given a string str.
// 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
// Sample Input -> yvTA
// Sample Output ->yvTA yvT yvA yv yTA yT yA y vTA vT vA v TA T A

import java.util.Scanner;
public class print_Subsequence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.nextLine();
        printSubsequence(str, "");
    }
    public static void printSubsequence(String str,String asf)
    {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        //yes 
        printSubsequence(ros, asf+ch);

        //no
        printSubsequence(ros, asf);
    }
}

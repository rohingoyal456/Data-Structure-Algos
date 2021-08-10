// 1. You are given a string str.
// 2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
// Sample Input -> abc
// Sample Output -> abc acb bac bca cab cba

import java.util.Scanner;
public class print_Permutations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.nextLine();
        printPermutations(str,"");
    }
    public static void printPermutations(String str,String asf)
    {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);
            printPermutations(ros, asf+ch);
        }
    }
}

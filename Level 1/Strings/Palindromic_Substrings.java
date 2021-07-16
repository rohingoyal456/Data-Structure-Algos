import java.util.Scanner;

public class Palindromic_Substrings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.nextLine();
        System.out.println("The following are the Palindromic Substrings:");
        solution(str);
    }
    public static void solution(String str)
    {
        for(int si=0;si<str.length();si++)
        {
            for(int ei=si;ei<str.length();ei++)
            {
                if(isPalindrome(str.substring(si,ei+1)))
                {
                    System.out.println(str.substring(si,ei+1));
                }
            }
        }
    }
    public static boolean isPalindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


// First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//For "aaabbccdee", the compressed string will be "abcde".
//Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//For "aaabbccdee", the compressed string will be "a3b2c2de2".
import java.util.Scanner;
public class String_Compression {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.next();
        String anscomp1=compression1(str);
        System.out.println(anscomp1);
        String anscomp2=compression2(str);
        System.out.println(anscomp2);
    }
    public static String compression1(String str)
    {
        StringBuilder ans=new StringBuilder();
        ans.append(str.charAt(0));
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)!=ans.charAt(ans.length()-1))
            {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    public static String compression2(String str)
    {
        StringBuilder ans=new StringBuilder();
        ans.append(str.charAt(0));
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==ans.charAt(ans.length()-1))
            {
                count++;
            }
            else
            {
                if(count>1)
                {
                    ans.append(count);
                }
                ans.append(str.charAt(i));
                count=1;
            }
        }
        if(count>1)
        {
            ans.append(count);
        }
        return ans.toString();
    }
}

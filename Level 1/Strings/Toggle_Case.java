//You have to toggle the case of every character of the given string.
import java.util.Scanner;
public class Toggle_Case {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.next();
        toggle(str);
    }
    public static void toggle(String str)
    {
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch >='a' && ch<='z')
            {
                System.out.print((char)(ch-'a'+'A'));
            }
            else
            {
                System.out.print((char)(ch-'A'+'a'));
            }
        }
    }
}

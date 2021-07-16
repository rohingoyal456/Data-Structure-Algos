//You are given a string. You have to print all permutations of the given string iteratively.
import java.util.Scanner;
public class printing_permutations_of_a_string {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.next();
        System.out.println("The following are the permutations of the string:");
        permutation(str);
    }
    public static void permutation(String str)
    {
        int tnp=1;
        for(int i=1;i<=str.length();i++)
        {
            tnp*=i;
        }
        for(int i=0;i<tnp;i++)
        {
            StringBuilder sb=new StringBuilder(str);
            int div=str.length();
            int dvd=i;
            while(div>0)
            {
                int r=dvd%div;
                dvd/=div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                div--;
            }
            System.out.println();
        }
    }
}

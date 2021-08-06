import java.util.ArrayList;
import java.util.Scanner;

public class get_subsequence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=input.nextLine();
        System.out.println(gss(str));
    }
    public static ArrayList<String> gss(String str) 
    {
        if(str.length()==0)
        {
            ArrayList<String> bans=new ArrayList<>();
            bans.add("");  
            return bans;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rr=gss(ros);
        ArrayList<String> mr=new ArrayList<>();
        for(int i=0;i<rr.size();i++)
        {
            mr.add(rr.get(i));
        }
        for(int i=0;i<rr.size();i++)
        {
            mr.add(ch+rr.get(i));
        }
        return mr;
    }
}

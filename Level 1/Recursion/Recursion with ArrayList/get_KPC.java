import java.util.ArrayList;
import java.util.Scanner;

// The following list is the key to characters map :
//     0 -> .;
//     1 -> abc
//     2 -> def
//     3 -> ghi
//     4 -> jkl
//     5 -> mno
//     6 -> pqrs
//     7 -> tu
//     8 -> vwx
//     9 -> yz
public class get_KPC {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.nextLine();
        System.out.println(getKPC(str));
    }
    public static ArrayList<String> getKPC(String str)
    {
        String arr[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        if(str.length()==0)
        {
            ArrayList<String> bans=new ArrayList<>();
            bans.add("");
            return bans;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rr=getKPC(ros);
        ArrayList<String> mr=new ArrayList<>();
        String ans=arr[ch-'0'];
        for(int i=0;i<ans.length();i++)
        {
            for(int j=0;j<rr.size();j++)
            {
                mr.add(ans.charAt(i)+rr.get(j));
            }
        }
        return mr;
    }
}

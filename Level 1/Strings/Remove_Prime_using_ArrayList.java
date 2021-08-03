import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Prime_using_ArrayList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=input.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(input.nextInt());
        }
        solution(al);
    }
    public static void solution(ArrayList<Integer> al)
    {
        for(int i=0;i<al.size();i++)
        {
            boolean prime=true;
            for(int j=2;j*j<=al.get(i);j++)
            {
                if(al.get(i)%j==0)
                {
                    prime=false;
                    break;
                }
            }
            if(prime)
            {
                al.remove(i);
            }
        }
        System.out.println(al);
    }
}

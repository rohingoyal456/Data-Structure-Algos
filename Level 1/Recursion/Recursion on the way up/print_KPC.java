// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map
//     0 -> .;
//    1 -> abc
//    2 -> def
//    3 -> ghi
//    4 -> jkl
//    5 -> mno
//    6 -> pqrs
//    7 -> tu
//    8 -> vwx
//    9 -> yz
// 3. Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.
// Sample Input -> 78 
// Sample Output -> tv tw tx uv uw ux

import java.util.Scanner;
public class print_KPC {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.nextLine();
        printKPC(str, "");
    }
    static String arr[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void  printKPC(String str, String asf) 
    {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        String temp=arr[ch-'0'];
        for(int i=0;i<temp.length();i++)
        {
            printKPC(ros, asf+temp.charAt(i));
        }
    }
}

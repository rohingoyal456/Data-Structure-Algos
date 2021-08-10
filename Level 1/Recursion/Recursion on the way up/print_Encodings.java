// 1. You are given a string str of digits. (will never start with a 0)
// 2. You are required to encode the str as per following rules
//     1 -> a
//     2 -> b
//     3 -> c
//     ..
//     25 -> y
//     26 -> z
// 3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
// Use the input-output below to get more understanding on what is required
// 123 -> abc, aw, lc
// 993 -> iic
// 013 -> Invalid input. A string starting with 0 will not be passed.
// 103 -> jc
// 303 -> No output possible. But such a string maybe passed. In this case print nothing.
// Sample Input -> 655196
// Sample Output -> feeaif feesf

import java.util.Scanner;
public class print_Encodings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.nextLine();
        printEncodings(str, "");
    }
    public static void printEncodings(String str, String asf)
    {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        if(str.charAt(0)=='0')
        {
            return;
        }
        String ch0=str.substring(0,1);
        String ros1=str.substring(1);
        printEncodings(ros1,asf+(char)('a'+Integer.parseInt(ch0)-1));
        if(str.length()>=2)
        {
            String ch01=str.substring(0,2);
            String ros2=str.substring(2);
            if(Integer.parseInt(ch01)<=26)
            {
                printEncodings(ros2,asf+(char)('a'+Integer.parseInt(ch01)-1));
            }
        }
    }
}

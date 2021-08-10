// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up.
// Sample Input -> 3
// Sample Output -> 111 12 21 3

import java.util.Scanner;
public class print_Stair_Path {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        printStairPathI(n, "");
    }
    public static void printStairPathI(int n, String asf)
    {
        if(n==0)
        {
            System.out.println(asf);
            return;
        }
        if(n<0)
        {
            return;
        }
        printStairPathI(n-1, asf+"1");
        printStairPathI(n-2, asf+"2");
        printStairPathI(n-3, asf+"3");

    }
}

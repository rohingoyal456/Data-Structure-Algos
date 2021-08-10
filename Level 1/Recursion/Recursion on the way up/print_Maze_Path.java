// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
// 3. Complete the body of pri tMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.
// Sample Input -> 2 2
// Sample Output -> hv vh

import java.util.Scanner;
public class print_Maze_Path {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=input.nextInt();
        System.out.println("Enter number of columns:");
        int m=input.nextInt();
        printMazePath(0,0,n-1,m-1,"");
    }
    public static void printMazePath(int sr,int sc,int dr,int dc, String asf)
    {
        if(sr==dr && sc==dc)
        {
            System.out.println(asf);
            return;
        }
        if(sr>dr || sc>dc)
        {
            return;
        }
        printMazePath(sr, sc+1, dr, dc, asf+"h");
        printMazePath(sr+1, sc, dr, dc, asf+"v");
    }
}

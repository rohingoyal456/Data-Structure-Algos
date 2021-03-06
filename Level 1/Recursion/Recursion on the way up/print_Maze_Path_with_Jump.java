// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of printMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.
// Sample Input -> 3 3
// Sample Output -> h1h1v1v1 h1h1v2 h1v1h1v1 h1v1v1h1 h1v1d1 h1v2h1 h1d1v1 h2v1v1 h2v2 v1h1h1v1 v1h1v1h1 v1h1d1 v1h2v1 v1v1h1h1 v1v1h2 v1d1h1 v2h1h1 v2h2 d1h1v1 d1v1h1 d1d1 d2

import java.util.Scanner;
public class print_Maze_Path_with_Jump {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=input.nextInt();
        System.out.println("Enter number of columns:");
        int m=input.nextInt();
        printMazePathwithJump(0, 0, n-1, m-1, "");
    }
    public static void printMazePathwithJump(int sr,int sc,int dr,int dc,String asf)
    {
        if(sr==dr && sc==dc)
        {
            System.out.println(asf);
            return;
        }
        for(int jump=1;jump<=dc-sc;jump++)
        {
            printMazePathwithJump(sr, sc+jump, dr, dc, asf+"h"+jump);
        }
        for(int jump=1;jump<=dr-sr;jump++)
        {
            printMazePathwithJump(sr+jump, sc, dr, dc, asf+"v"+jump);
        }
        for(int jump=1;jump<=dc-sc && jump<=dr-sr;jump++)
        {
            printMazePathwithJump(sr+jump, sc+jump, dr, dc, asf+"d"+jump);
        }
    }
}

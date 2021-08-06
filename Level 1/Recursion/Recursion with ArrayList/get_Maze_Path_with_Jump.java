// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Sample Input -> 2 2
// Sample Output -> [h1v1, v1h1, d1]

import java.util.ArrayList;
import java.util.Scanner;

public class get_Maze_Path_with_Jump {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=input.nextInt();
        System.out.println("Enter number of columns:");
        int m=input.nextInt();
        System.out.println(getMazePathWithJump(0, 0, n-1, m-1));
    }
    public static ArrayList<String> getMazePathWithJump(int sr,int sc,int dr,int dc)
    {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> bans=new ArrayList<>();
            bans.add("");
            return bans;
        }
        ArrayList<String> mr=new ArrayList<>();
        for(int jump=1;jump<=dc-sc;jump++)
        {
            ArrayList<String> rr2=getMazePathWithJump(sr, sc+jump, dr, dc);
            for(int i=0;i<rr2.size();i++)
            {
                mr.add("h"+jump+rr2.get(i));
            }
        }
        for(int jump=1;jump<=dr-sr;jump++)
        {
            ArrayList<String> rr1=getMazePathWithJump(sr+jump, sc, dr, dc);
            for(int i=0;i<rr1.size();i++)
            {
                mr.add("v"+jump+rr1.get(i));
            }
        }
        for(int jump=1;jump<=dr-sr && jump<=dc-sc;jump++)
        {
            ArrayList<String> rr3=getMazePathWithJump(sr+jump, sc+jump, dr, dc);
            for(int i=0;i<rr3.size();i++)
            {
                mr.add("d"+jump+rr3.get(i));
            }
        }
        return mr;
    }
}

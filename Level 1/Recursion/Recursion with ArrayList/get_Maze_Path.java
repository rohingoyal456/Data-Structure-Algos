// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
// 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Sample input -> 3 3
// Sample output -> [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]

import java.util.ArrayList;
import java.util.Scanner;
public class get_Maze_Path {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=input.nextInt();
        System.out.println("Enter number of columns:");
        int m=input.nextInt();
        System.out.println(getMazePaths(0, 0, n-1, m-1));
    }
    public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc)
    {
        if(sr>dr || sc>dc)
        {
            ArrayList<String> bans=new ArrayList<>();
            return bans;
        }
        if(sr==dr && sc==dc)
        {
            ArrayList<String> bans=new ArrayList<>();
            bans.add("");
            return bans;
        }
        ArrayList<String> rr1=getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> rr2=getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> mr=new ArrayList<>();
        for(int i=0;i<rr1.size();i++)
        {
            mr.add("h"+rr1.get(i));
        }
        for(int i=0;i<rr2.size();i++)
        {
            mr.add("v"+rr2.get(i));
        }
        return mr;
    }
}

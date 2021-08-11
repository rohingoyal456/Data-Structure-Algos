// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a. The numbers can be 1 or 0 only.
// 4. You are standing in the top-left corner and have to reach the bottom-right corner. 
// Only four moves are allowed 't' (1-step up), 'l' (1-step left), 'd' (1-step down) 'r' (1-step right). You can only move to cells which have 0 value in them. You can't move out of the boundaries or in the cells which have value 1 in them (1 means obstacle)
// 5. Complete the body of floodfill function - without changing signature - to print all paths that can be used to move from top-left to bottom-right.
// Sample Input -> 3 3 0 0 0 1 0 1 0 0 0
// Sample Output -> rddr

import java.util.Scanner;
public class flood_Fill {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=input.nextInt();
        System.out.println("Enter number of columns:");
        int m=input.nextInt();
        System.out.println("Enter the elements:");
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=input.nextInt();
            }
        }
        boolean[][] visited= new boolean[n][m];
        floodFill(a, 0, 0, "",visited);
    }
    public static void floodFill(int maze[][],int sr,int sc,String psf, boolean visited[][])
    {
        if(sr<0 || sr>=maze.length || sc<0 || sc>=maze[0].length || maze[sr][sc]==1 || visited[sr][sc]==true)
        {
            return;
        }
        if(sr==maze.length-1 && sc==maze[0].length-1)
        {
            System.out.println(psf);
            return;
        }
        visited[sr][sc]=true;
        floodFill(maze, sr-1, sc, psf+"t",visited);
        floodFill(maze, sr, sc-1, psf+"l",visited);
        floodFill(maze, sr+1, sc, psf+"d",visited);
        floodFill(maze, sr, sc+1, psf+"r",visited);
        visited[sr][sc]=false;
    }
}

// 1. You are given a number n, the size of a chess board.
// 2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
// Note - Queens kill at distance in all 8 directions
// 3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.
// Sample Input -> 4
// Sample Output ->0-1, 1-3, 2-0, 3-2, .
//                 0-2, 1-0, 2-3, 3-1, .

import java.util.Scanner;
public class n_Queens {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of chess board:");
        int n=input.nextInt();
        boolean chess[][]=new boolean[n][n];
        printNQueens(chess, "", 0);
    }
    public static void printNQueens(boolean chess[][],String asf, int row)
    {
        if(row==chess.length)
        {
            System.out.println(asf+".");
            return;
        }

        for(int col=0;col<chess.length;col++)
        {
            if(isItSafe(chess,row,col)==true)
            {
                chess[row][col]=true; //place the queen
                printNQueens(chess, asf+row+"-"+col+", ", row+1);
                chess[row][col]=false; //unplace the queen
            }
        }
    }
    public static boolean isItSafe(boolean chess[][],int row,int col)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(chess[i][col]==true)
            {
                return false;
            }
        }
        for(int i=row-1, j=col+1; i>=0 && j<chess.length;i--,j++)
        {
            if(chess[i][j]==true)
            {
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0;i--,j--)
        {
            if(chess[i][j]==true)
            {
                return false;
            }
        }
        return true;
    }
}

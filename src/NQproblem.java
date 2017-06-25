import java.util.*;
public class NQproblem
{
     final static int n=4;
     public static boolean issafe(int[][] board , int row , int col)
     {
    	 int i,j;
    	 for( i=0 ; i<col;i++)
    	 {
    		 if(board[row][i]==1)
    			 return false;
    	 }
    	 for(i=row , j=col ; i>=0 && j>=0 ; i--,j--)
    	 {
    		 if(board[i][j]==1)
    			 return false;
    	 }
    	 for(i=row , j=col ; i<n && j>=0 ; i++,j--)
    	 {
    		 if(board[i][j]==1)
    			 return false;
    	 }
    	 return true;
     }
	public static boolean solveNQutil(int[][] board , int col)
	{
		if(col>=n)
			return true;
		
		for(int i=0 ; i<n ; i++)
		{
			if(issafe(board,i,col)==true)
			{
				board[i][col]=1;
				if(solveNQutil(board, col+1)==true)
					return true;
				
				board[i][col]=0;
			}
		}
		return false;
	}

	static void printsolution(int[][] board)
	{
		for(int i=0;i<board.length ; i++)
		{
			for(int j=0 ;j<n ; j++)
			{
			System.out.print(board[i][j]);
		}
		System.out.println();
	}
	}
	public static boolean SolveNQ()
	{
		int board[][] = {{0, 0, 0, 0},
	                     {0, 0, 0, 0},
	                     {0, 0, 0, 0},
	                     {0, 0, 0, 0}};
		if(solveNQutil(board,0)==false)
		{
			System.out.println("no solution");
			return false;
		}
		printsolution(board);
		return true;
			
	}
	
	public static void main(String[] args)
	{
		SolveNQ();
	}
}

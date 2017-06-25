import java.util.*;
public class booleanmatrix 
{
	public static void modifyarray(int[][] arr , int col , int row)
	{
		int r[] = new int[row];
		int c[] = new int[col];
		
		for(int i=0 ; i<row ; i++)
		{
			r[i]=0;
		}
		for(int j=0 ; j<col ;j++)
		{
			c[j]=0;
		}
		
		for(int i=0 ; i<row ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				if(arr[i][j] == 1)
				{
					r[i]=1;
					c[j]=1;
				}
			}
		}
		
		for(int i=0 ; i<row ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				if(r[i]==1 || c[j]==1)
				{
					arr[i][j]=1;
				}
			}
		}
	}
	public static void printarray(int[][] arr , int col , int row)
	{
		for(int i=0 ; i<row ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int[][] arr = { {1, 0, 0, 1},
		                {0, 0, 1, 0},
		                {0, 0, 0, 0}};
		int col = arr[0].length;
		int row = arr.length;
		printarray(arr,col,row);
		modifyarray(arr,col,row);
		System.out.println();
		printarray(arr,col,row);
	}
}

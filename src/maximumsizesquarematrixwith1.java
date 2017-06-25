import java.util.*;
public class maximumsizesquarematrixwith1 
{
	public static void submatrix(int[][] M)
	{
		int[][] s = new int[6][5];
		
		for(int i=0 ; i<6 ; i++)
		{
			s[i][0] = M[i][0];
		}
		for(int j=0 ; j<5 ; j++)
		{
			s[0][j] = M[0][j];
		}
		
		for(int i=1 ; i<6 ; i++ )
		{
			for(int j=1 ; j<5 ; j++)
			{
				if(M[i][j]==1)
				s[i][j] = Math.min(Math.min(s[i-1][j] , s[i][j-1]) , s[i-1][j-1])+1;
				
				else
					s[i][j]=0;
			}
		}
	
		int max_s = s[0][0];
		int max_i =0;
		int max_j = 0;
		for(int i=0 ; i<6 ; i++)
		{
			for(int j=0 ; j<5 ; j++)
			{
				if(max_s < s[i][j])
				{
					max_s = s[i][j];
					max_i = i;
					max_j = j;
				}
			}
			
		}
		
		for(int i=max_i ; i>max_i-max_s ; i--)
		{
			for(int j=max_j ; j>max_j-max_s ; j--)
			{
				System.out.print(M[i][j]);
				
			}
			System.out.println();
		}
	}
	
	/*public static int min(int a , int b , int c)
	{
		if(a>b && b>c)
			return c;
		
		else if(a<b && b<c)
		{
			return a;
		}
		else
			return b;
	}*/
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[][] M = {{0, 1, 1, 0, 1}, 
                     {1, 1, 0, 1, 0}, 
                     {0, 1, 1, 1, 0},
                     {1, 1, 1, 1, 0},
                     {1, 1, 1, 1, 1},
                     {0, 0, 0, 0, 0}};
		submatrix(M);
	}
}

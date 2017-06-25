import java.util.*;
public class longestcommonsubsequence 
{
	public static void longest(char[] x , char[] y , int m , int n)
	{
		int[][] ls = new int[m+1][n+1];
		int i,j;
		
		for(i=0 ; i<=m ; i++)
		{
			for(j=0 ; j<=n ; j++)
			{
				if(i==0 || j==0)
					ls[i][j]=0;
				
				else if(x[i-1]==y[j-1])
					ls[i][j]=ls[i-1][j-1]+1;
				
				else
					ls[i][j] = Math.max(ls[i-1][j], ls[i][j-1]);
			}
		}
		for(int k=0 ; k<=m ; k++)
		{
			for( i = 0 ; i<=n ; i++ )
			{
			System.out.print(ls[k][i]);
			}
			System.out.println();
		}
		
		//System.out.println(ls[m][n]);
	}
	
	public static void main(String[] args)
	{
		String x = "AGGTAB";
		  String y = "GXTXAYB";
		  
		  int m = x.length();
		  int n = y.length();
		  
		  longest(x.toCharArray() , y.toCharArray() , m , n);
	}
	
}

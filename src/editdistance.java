import java.util.*;
public class editdistance 
{
	public static void operation(char[] str1 , char[] str2 , int m , int n)
	{
		int[][] ed = new int[m+1][n+1];
		int i,j;
		
		for(i=0 ; i<=m ; i++)
		{
			for(j=0 ; j<=n ; j++)
			{
				if(i==0)
				ed[i][j]=j;
				
				else if(j==0)
					ed[i][j]=i;
				
				else if(str1[i-1]==str2[j-1])
					ed[i][j] = ed[i-1][j-1];
				
				else
					ed[i][j] = 1+Math.min(ed[i][j-1], Math.min(ed[i-1][j], ed[i-1][j-1]));
			}
		}
		System.out.println(ed[m][n]);
	}
	public static void main(String[] args)
	{
		String str1 = "sunday";
        String str2 = "saturday";
        
        operation(str1.toCharArray() , str2.toCharArray() , str1.length() , str2.length());
	}
}

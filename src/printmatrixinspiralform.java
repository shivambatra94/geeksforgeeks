import java.util.*;
public class printmatrixinspiralform 
{
	public static void toprintvalues(int[][] arr , int n , int m)
	{
		int i , l=0 , k=0;
		
		while(k<n && l<m)
		{
		//first row
		for(i=l ; i<n ; ++i)
		{
			System.out.println(arr[k][i]);
		}
		k++;
		
		//last coloumn
		for(i=k ; i<m ; ++i)
		{
			System.out.println(arr[i][n-1]);
		}
		n--;
		//last row
		if(k<m)
		{
			for(i=n-1 ; i>=l ; --i)
			{
				System.out.println(arr[m-1][i]);
			}
			m--;
		}
		//firstcoloumn
		
		if(l<n)
		{
			for(i=m-1 ; i>=k ;--i)
			{
				System.out.println(arr[i][l]);
			}
			l++;
		}
		}
	}
	public static void main(String[] args)
	{
		
		int arr[][] = {{1,  2,  3,  4,  5,  6},
		                {7,  8,  9,  10, 11, 12},
		                {13, 14, 15, 16, 17, 1}};
		int row=arr[0].length;
		int col = arr.length;
		toprintvalues(arr,row,col);
		
                                   		 
	}
}

import java.util.*;
public class findminimumdistancetwonumbers 
{
	/*public static void  mindistance(int[] arr , int x , int y , int n)
	{
		int i,j;
		int min_distance=Integer.MAX_VALUE;
		for(i=0 ; i<n ; i++)
		{
			for(j=1 ; j<n ; j++)
			{
				if((x==arr[i] && y==arr[j]) || (y==arr[i] && y==arr[j]) && (min_distance > Math.abs(i-j)))
				{
					min_distance = Math.abs(i-j);
				}
			}
		}
		System.out.println(min_distance);
	}*/
	
	public static void mindistance(int[] arr , int x , int y , int n)
	{
		int i;
		int prev = 0;
		int min_distance=Integer.MAX_VALUE;
		
		for(i=0 ; i<n ;i++)
		{
			if(x==arr[i] || y==arr[i])
			{
				prev=i;
				break;
			}
		}
		
		for( ; i<n ; i++)
		{
			if(x==arr[i] || (y==arr[i]))
			{
				if(arr[prev]!=arr[i] && i-prev<min_distance)
				{
					min_distance=i-prev;
					prev=i;
				}
				else
					prev=i;
			}
		}
		System.out.println(min_distance);
	}
	
	public static void main(String[] args)
	
	{
		int[] arr =  {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
		int n = arr.length;
		int x = 3;
		int y = 6;
		mindistance(arr , x , y ,n);
	}
}

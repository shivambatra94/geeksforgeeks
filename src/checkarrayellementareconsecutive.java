import java.util.*;
public class checkarrayellementareconsecutive 
{
	public static boolean areconsecutive(int[] arr , int n)
	{
		if(n<1)
			return false;
		int max = getmax(arr);
		int min = getmin(arr);
		
		if((max-min+1)==n)
		{
			boolean[] visited = new boolean[n];
			for(int i=0 ;i<n ;i++)
			{
				if(visited[arr[i]-min]!=false)
					return false;
				
				else
					visited[arr[i]-min]=true;
			}
			return true;
		}
		return false;
	}
	static int getmin(int[] arr)
	{
		int min = arr[0];
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] < min)
				min=arr[i];
		}
		return min;
	}
	static int getmax(int[] arr)
	{
		int max = arr[0];
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] > max)
				max=arr[i];
		}
		return max;
	}
	public static void main(String[] args)
	{
		int[] arr = {5, 4, 2, 3, 1, 8};
		int n = arr.length;
		if(areconsecutive(arr,n)==true)
			System.out.println("consecutive");
		else
			System.out.println("not");
	}
}

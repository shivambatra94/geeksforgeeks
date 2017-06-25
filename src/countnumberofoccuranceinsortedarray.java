import java.util.*;
public class countnumberofoccuranceinsortedarray 
{
	public static int count(int[] arr , int x , int n)
	{
		int i;
		int j;
		
		i = firstelement(arr , 0 , n-1 , x , n);
		
		if(i==-1)
			return i ;
		
		j = lastelement(arr, i , n-1 , x , n);
		return j-i+1;
	}
	public static int firstelement(int[] arr , int low , int high , int x , int n)
	{
		if(high>=low)
		{
			int mid = (high+low)/2;
			if(mid==0 || (x==arr[mid] && x>arr[mid-1]))
				return mid;
			else if(x>arr[mid])
				return firstelement(arr , mid+1 , high , x , n);
			else
				return firstelement(arr , low, mid-1 , x , n);
		}
		return -1;
	}
	
	public static int lastelement(int[] arr , int low , int high , int x , int n)
	{
		if(high>=low)
		{
			int mid = (high + low)/2;
			if(mid==n-1 || (x<arr[mid+1] && arr[mid]==x))
				return mid;
			
			else if(x<arr[mid])
				return lastelement(arr , low , (mid-1) , x , n);
			else
				return lastelement(arr , (mid+1) , high , x , n);
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 2, 3, 3, 3, 3};
		int x = 3;
		int n = arr.length;
		int a = count(arr , x , n);
		if(a>0)
			System.out.println(a);
		else
			System.out.println("no rep");
	}
}

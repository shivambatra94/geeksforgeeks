import java.util.*;
public class findmaxjminusi 
{
	public static void findmax(int[] arr , int n)
	{
		int[] lmin = new int[n];
		int[] rmax = new int[n];
		
		lmin[0] = arr[0];
		for(int i=1 ; i<n ; i++)
		{
			lmin[i] = Math.min(arr[i], lmin[i-1]);
		}
		rmax[n-1] = arr[n-1];
		for(int J=n-2 ; J>=0 ; J--)
		{
			rmax[J] = Math.max(arr[J], rmax[J+1]); 
		}
		int i=0 , j=0;
		int maxdiff=-1;
		while(i<n && j< n)
		{
			if(lmin[i]<rmax[j])
			{
				maxdiff = Math.max(maxdiff, j-i);
				j=j+1;
			}
			else
				i=i+1;
		}
		
		System.out.println(maxdiff);
	}
	public static void main(String[] args)
	{
		int[] arr = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
		findmax(arr , arr.length);
	}
}

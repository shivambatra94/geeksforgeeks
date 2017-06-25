import java.util.*;
public class longestincreasingssubsequence 
{
	public static void longestseq(int[] arr , int n)
	{
		int max =0;
		int[] lis = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			lis[i]=1;
		}
		for(int i=1 ; i<n ; i++)
		{
			for(int j=0 ; j<i ; j++)
			{
				if(arr[j]<arr[i] && lis[i]<lis[j]+1)
				{
					lis[i] = lis[j]+1;
				}
			}
		}	
		for(int i=0 ; i<n ;i++)
		{
			if(lis[i]>max)
				max=lis[i];
			
		}
		System.out.println(max);
	}
	public static void main(String[] args)
	{
		int[] arr =  { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		longestseq(arr,n);
	}
}

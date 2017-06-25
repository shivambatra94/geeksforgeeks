import java.util.*;
public class segregatezeroandoneinanarray 
{
	public static void segregate(int[] arr , int n)
	{
		int left=0 , right=n-1;
		while(left < right)
		{
			while(arr[left]==0 && (left < right))
				left++;
			while(arr[right]==1 && (left<right))
			  right--;
			if(left<right)
			{
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
			}
		}
	}
	public static void printarray(int[] arr)
	{
		for(int i=0 ;i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String...s)
	{
		int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		segregate(arr,arr.length);
		printarray(arr);
	}
}

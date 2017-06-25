import java.util.*;
public class segregateevenandoddnumbers 
{
	public static void segregate(int[] arr , int n)
	{
		int left=0;
		int right=n-1;
		while(left<right)
		{
			while((arr[left]%2==0) && (left<right))
				left++;
			while((arr[right]%2!=0) && (left<right))
				right--;
			
			if(left<right)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		
	}
	public static void printarray(int[] arr)
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {12, 34, 45, 9, 8, 90, 3};
		
		segregate(arr , arr.length);
		printarray(arr);
	}
}

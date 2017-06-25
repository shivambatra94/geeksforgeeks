import java.util.*;
public class sortanarraydutchnationalflagalgorithm 
{
	public static void arraysort(int[] arr , int len)
	{
		int low=0;
		int mid =0;
		int high = len-1;
		int temp;
		while(high>=mid)
		{
			switch(arr[mid])
			{
			case 0:
			{
				temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
				break;
			}
			
			case 1:
			{
				mid++;
				break;
			}
			
			case 2:
			{
				temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
				break;
			}
			}
		}
	}
	
	public static void printarray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		arraysort(arr, arr.length);
		printarray(arr);
	}
}

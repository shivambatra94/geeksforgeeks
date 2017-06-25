import java.util.*;
public class findduplicatesincomplexityn
{
	public static void sortedarray(int[] arr , int n)
	{
		for(int i=0 ; i<n ; i++)
		{
			if(arr[Math.abs(arr[i])]>=0)
				arr[Math.abs(arr[i])]= -arr[Math.abs(arr[i])];
			
			else
				System.out.println(Math.abs(arr[i]));
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 1, 3, 6, 6};
		sortedarray(arr , arr.length);
	}
}


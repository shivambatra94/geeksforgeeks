import java.util.*;
public class maximumdifferencebetweentwoelementsinanarray 
{
	public static int finddiff(int[] arr)
	{
		int len = arr.length;
		int max = arr[1]-arr[0];
		int min = arr[0];
		for(int i=1 ; i<len ; i++)
		{
			if(arr[i]-min > max)
				max = arr[i]-min;
			if(arr[i]<min)
				min = arr[i];
		}
		return max;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] arr = {2,1, 90, 10, 110};
		int x = finddiff(arr);
		System.out.println(x);
	}
}

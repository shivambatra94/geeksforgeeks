import java.util.*;
public class largestcontiguossubarray 
{
	/*public static void largestsubarray(int[] arr)
	{
		int max_have=0;
		int max_So = 0;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			max_have = max_have + arr[i];
			if(max_have < 0 )
				max_have=0;
			
			else if(max_So<max_have)
				max_So = max_have;		
		}
		System.out.println( max_So);
	}*/
	public static void largestsubarray(int[] arr)
	{
		int max= arr[0];
		int curr = arr[0];
		for(int i=1; i<arr.length ; i++)
		{
			curr = Math.max(arr[i], curr+arr[i]);
			max = Math.max(max, curr);
		}
		System.out.println(max);
		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
			arr[i] = scan.nextInt();
		largestsubarray(arr);
	}
}


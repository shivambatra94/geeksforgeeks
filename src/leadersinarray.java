import java.util.*;
public class leadersinarray 
{
	public static void leaders(int[] arr , int n)
	{
		int maxfromright = arr[n-1];
		System.out.println(maxfromright);
		for(int i=n-2 ; i>=0 ; i--)
		{
			if(maxfromright < arr[i])
			{
				maxfromright = arr[i];
				System.out.println(arr[i]);
			}
		}
		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = scan.nextInt();
		}
		leaders(arr , arr.length);
	}
}

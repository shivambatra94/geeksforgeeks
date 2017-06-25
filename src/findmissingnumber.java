import java.util.*;
public class findmissingnumber 
{
	/*public static void missing(int[] arr , int n)
	{
		int temp;
		temp = ((n+1)*(n+2))/2;
		for(int i=0 ; i<n ;i++)
			temp -= arr[i];
		
		System.out.println(Math.abs(temp));
	}*/
	public static int missing(int[] arr , int n)
	{
		
		int x1 = arr[0];
		int x2 = 1;
		for(int i=1 ; i<n ; i++)
		{
		   x1 = x1^arr[i];
		}
		for(int i=2 ; i<=n+1 ;i++)
		{
			x2 =x2 ^i;
		}
		return x1^x2;
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
		int a = missing(arr , n);
		System.out.println(a);
	}
}

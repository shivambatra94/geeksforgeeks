import java.util.*;
public class maxsumnotwoelementadjacentarray 
{
	public static void findsum(int[] arr)
	{
		int inc = arr[0];
		int exc = 0;
		int ex_new;
		for(int i=1 ; i<arr.length ;i++)
		{
			ex_new = (inc>exc)? inc : exc;
			inc = exc+arr[i];
			exc = ex_new;
		}
		int a = (inc>exc) ? inc : exc;
		System.out.println(a);
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
		findsum(arr);
	}
}

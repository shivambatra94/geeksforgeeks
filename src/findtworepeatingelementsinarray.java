import java.util.*;
public class findtworepeatingelementsinarray 
{
	public static void findelement(int[] arr , int len)
	{
		int sum=0;
		int pro=1;
		int n = len-2; 
		for(int i=0 ; i<len ; i++)
		{
			sum  = sum+arr[i];
			pro *= arr[i];
		}
		 sum = sum-(n*(n+1)/2);
		 pro = pro/fac(n);
		
		int d  = (int) Math.sqrt((sum*sum) - 4*pro);
		int x = (sum+d)/2;
		int y = (sum-d)/2;
		System.out.println(x+" "+y);
	}
	public static int fac(int n)
	{
		return (n == 0) ? 1 : n * fac(n - 1);
	}
	public static void main(String[] args)
	{
		int[] arr = {4, 2, 4, 5, 2, 3, 1};
		findelement(arr,arr.length);
	}
	
}

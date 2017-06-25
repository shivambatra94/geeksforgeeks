import java.util.*;
public class dynamicprogrfibonacciseries 
{
	//using memoization
	/*public static void initialize(int n)
	{
		int[] lookup = new int[100];
		int a = findnumber(n,lookup);
		System.out.println(a);
	}
	public static int findnumber(int n , int[] lookup)
	{
		if(lookup[n]==0)
		{
			if(n<=1)
				lookup[n]=n;
			else
				lookup[n]=findnumber(n-1,lookup) + findnumber(n-2,lookup);
		}
		return lookup[n];
	}*/
	//using tabulation
	public static int findnumber(int n)
	{
		int[] f = new int[n+1];
	     f[0] = 0;
	     f[1] = 1;
	     for(int i=2 ; i<f.length ; i++)
	     {
	    	 f[i] = f[i-1] + f[i-2];
	     }
	     return f[n];
		
	}
	public static void main(String[] args)
	{
		int n = 9;
		// initialize(n);
		int a = findnumber(n);
		System.out.println(a);
	}
}

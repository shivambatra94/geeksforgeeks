import java.util.*;
public class twowlwmentssumisclosetozero 
{
	public static void findelements(int[] arr , int n)
	{
		int i,j;
		int l = 0;
		int r = n-1;
		int minval = 0, maxval = 0;
		int sum , ref = Integer.MAX_VALUE;
		if(n < 1)
			System.out.println("insuff");
		
		 Arrays.sort(arr);
			while(l < r)
			{
					 sum = arr[l] + arr[r];
					 if(Math.abs(ref)>Math.abs(sum))
					 {
						 ref = sum;
						// System.out.println("sum:-"+ref);
						 minval=l;
						 maxval=r;
					 }
					 if(sum<0)
						 l++;
					 else
						 r--;
			}
			System.out.println(arr[minval]+" "+arr[maxval]);
		
	}
	public static void main(String[] args)
	{
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int[] arr = new int[n];
	    for(int i=0 ; i<n ;i++)
	    {
	    	arr[i] = scan.nextInt();
	    }
	    findelements(arr , arr.length);
	}
}

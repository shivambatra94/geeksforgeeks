import java.util.*;
public class findsuminarray 
{
	public static final int max = 10000;
	/*public static int findsum(int[] arr , int sum)
	{
		Arrays.sort(arr);
		int l=0;
		int r= arr.length-1;
	
		while(l<r)
		{
			if(arr[l]+arr[r]==sum)
			{
				System.out.println(arr[l]+" "+arr[r]);
				return 1;
			}
			else if(arr[l]+arr[r]>16)
				r--;
			else
				l++;
		}
		
		return 0;
	}*/
	public static void findsum(int[]arr , int sum)
	{
		boolean[] bool = new boolean[max];
		for(int i=0 ; i<arr.length ; i++)
		{
			int temp = sum-arr[i];
			if(temp>=0 && bool[temp])
			{
				System.out.println(arr[i]+" "+temp);
			}
			bool[arr[i]]=true;
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
			arr[i] = scan.nextInt();
		int sum = scan.nextInt();
	findsum(arr,sum);
	//	if(x==1)
		//	System.out.println("Array has elements");
		//else
			//System.out.println("Array has no element");
	}
}

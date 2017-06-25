import java.util.*;
public class ceilingofagivenarray 
{
	public static int findnumber(int[] arr , int low , int high , int x)
	{
		if(x<=arr[low])
			return low;
		
		int mid = (low+high)/2;
		
		if(x == mid)
			return arr[mid];
		
		else if(arr[mid] < x )
		{
			if(mid+1<=high && x<arr[mid+1])
				return arr[mid+1];
			else
				return findnumber(arr,mid+1,high , x);
		}
		
		else
		{
			if(mid-1>=low && x<arr[mid-1])
				return arr[mid-1];
			else
				return findnumber(arr , low , mid-1 , x);
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
		int x = scan.nextInt();
		int number=findnumber(arr , 0 , arr.length-1 , x);
		System.out.println(number);
	}
}

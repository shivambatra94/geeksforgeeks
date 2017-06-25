import java.util.*;
public class arrayfirstandsecondsmallest 
{
	public static void findelements(int[] arr , int n)
	{
		int first,second;
		if(n<2)
			System.out.println("less");
		first=second=Integer.MAX_VALUE;
		for(int i=0 ;i<n ;i++)
		{
			if(arr[i]<first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]<second && arr[i]!=first)
				second=arr[i];
		}
		System.out.println(first+" "+second);
	}
	public static void main(String[] args)
	{
		Scanner scan =  new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n; i++)
		{
			arr[i]=scan.nextInt();
		}
		findelements(arr,arr.length);
	}
}

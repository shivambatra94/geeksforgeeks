import java.util.*;
public class printallcombinationofpointcangivwanumber 
{
	static int maxpoint = 3;
	
	static int arr[] = new int[1000];
	public static void printnumbers(int n , int i)
	{
			if(n==0)
			printarray(arr , i);
		
		else if(n>0)
		{
			int k;
			for( k=1 ; k<=maxpoint ; k++)
			{
				arr[i]=k;
				printnumbers(n-k, i+1);
			}
		}
	}
	
	public static void printarray(int[] arr , int i)
	{
		for(int j=0 ; j<i ; j++)
		{
			System.out.print(arr[j]);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printnumbers(n , 0);
	}
}

import java.util.*;
public class productarraypuzzle 
{
	public static void product(int[] arr , int n)
	{
		int temp=1;int i;
		int[] prod = new int[n];
		
		for(int j=0 ; j<n ; j++)
			prod[j] = temp;
		
		//left
		for( i=n-1 ; i>=0 ; i--)
		{
			prod[i] = temp;
			temp *= arr[i];
		}
		temp=1;
		//right
		for( i=0 ; i<n ; i++)
		{
			prod[i] *= temp;
			temp *= arr[i];
		}
		
		for( i=0 ; i<n ; i++)
		{
			System.out.println(prod[i]);
		}
	}
	public static void  main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = scan.nextInt();
		}
		product(arr , arr.length);
		
	}
}

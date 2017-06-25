import java.util.*;
public class rotatearray 
{
	//using juggling method
	/*public static void rotate(int[] arr , int d ,int n)
	{
		int gcd = GCD(n ,d);
		for(int i=0 ; i<gcd ; i++)
		{
			int temp = arr[i];
			int j=i;
			while(1!=0)
			{
				int k = j+d;
				if(k>=n)
					k=k-n;
				if(k==i)
					break;
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;
			
		}
	}
	public static int GCD(int a , int b)
	{
		if(b==0)
			return a;
		else
			return GCD(b , a%b);
	}*/
	//reversal algorithm
	public static void leftrotate(int[] arr , int d , int n)
	{
		reverse(arr , 0 , d-1);
		reverse(arr , d , n);
		reverse(arr , 0 , n);	
	}
	public static void reverse(int[] arr , int start , int end)
	{
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void printarray(int[] arr)
	{
		for(int i=0 ;i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{ 
			arr[i] = scan.nextInt();
		}
		n=arr.length-1;
		int d = scan.nextInt();
		leftrotate(arr ,d , n);
		printarray(arr);
	}
	
}

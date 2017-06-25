import java.util.*;
public class majorityelement 
{
	public static void printmajority(int[] arr)
	{
		int cand =  findcandidate(arr);
		if(majority(cand , arr)==1)
			System.out.println("array has element");
		
		else
			System.out.println("no element");
	}
	private static int findcandidate(int[] arr)
	{
		int index=0;
		int count=1;
		for(int i=1 ; i<arr.length ; i++)
		{
			if(arr[index]==arr[i])
				count++;
			else
				count--;
			if(count==0)
			{
				index=i;
				count=1;
			}
		}
		return arr[index];
	}
	public static int majority(int cand , int[] arr)
	{
		int count=0;
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]==cand)
				count++;
		}
		if(count > arr.length/2)
			return 1;
		else return 0;
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
        printmajority(arr);

	}   
}
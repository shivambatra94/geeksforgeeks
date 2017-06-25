import java.util.*;
public class reverseanarray 
{
	/*public static void reverse(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
	     while(start!=arr.length-1 && end>=0)
	   		{
				int temp = arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
				
			}
		
	}*/
	//using recursion
	public static void reverse(int[] arr , int start , int end)
	{
		if(start>=end)
			return;
		int temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		reverse(arr , start+1 , end-1);
	}
	public static void printarray(int[] arr)
	{
		for(int i =0; i<arr.length ;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] arr={2,4,6,8,10};
		printarray(arr);
		//reverse(arr);
		reverse(arr , 0 , 4);
		printarray(arr);
	}
}

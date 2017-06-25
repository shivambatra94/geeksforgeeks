import java.util.*;
public class nextgreaterelement 
{
	public static boolean next(int[] arr , int n)
	{
		int i = n-1;
		while(i>0 && arr[i]<=arr[i-1])
			i--;
		if(i<=0)
			return false;
		int j = n-1;
		
		while(arr[j]<arr[i-1])
			j--;
		
		int temp = arr[i-1];
		arr[i-1]=arr[j];
		arr[j] = temp;
		
		j=n-1;
		while(i<j)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return  true;
	}
    
	public static void printarray(int[] arr)
	{
		for(int i : arr)
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		int[] arr = {4,3,2,1};
		boolean x = next(arr,arr.length);
		if(x==true)
			printarray(arr);
		else
			System.out.println("no greater element");
	}
}

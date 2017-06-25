import java.util.*;
public class findmissingelement 
{
	
    //linear search
	/*public static int findnumbers(int[] arr , int m,int n)
	{
		if(arr[0]!=0)
			return 0;
		for(int i=0 ; i<n-1 ; i++)
		{
			if(arr[i+1]-arr[i]>1)
				return arr[i]+1;
		}
		if(m>n)
			return arr[n-1]+1;
		else
		return 0;
	}*/
	//modified binary search
	public static int findnumbers(int[] arr , int start , int end)
	{
		if(start>end)
			return end+1;
		if(arr[start]!=start)
			return start;
		int mid = (start+end)/2;
		if(arr[mid]>mid)
		{
			return findnumbers( arr , start , mid);
	    }
		else 
			return findnumbers( arr , mid+1 , end);
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {0,1,2,3};
		int m = 11;
		int a =findnumbers(arr,0,arr.length-1);
		System.out.println("First Missing element is : "
                +findnumbers(arr, 0, arr.length - 1));
	}
}

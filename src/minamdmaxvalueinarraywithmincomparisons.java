import java.util.*;
class minmax
{
	int min;
	int max;
	
}
public class minamdmaxvalueinarraywithmincomparisons 
{
	public static minmax minandmaxvalue(int[] arr , int n)
	{
		minmax p = new minmax();
		
		int i;
		if(n%2==0)
		{
			if(arr[0]<arr[1])
			{
			p.min=arr[0];
			p.max=arr[1];
			}
			else
			{
				p.max=arr[0];
				p.min=arr[1];
			}
			i=2;
			
		}
		else
		{
			p.min=arr[0];
			p.max=arr[0];
			i=1;
		}
		while(i<n-1)
		{
			if(arr[i]>arr[i+1])
			{
				if(arr[i+1]<p.min)
				p.min=arr[i+1];
				if(arr[i]>p.max)
				p.max=arr[i];
			}
			else
			{
				if(arr[i]<p.min)
				p.min=arr[i];
				if(arr[i+1]>p.max)
				p.max=arr[i+1];
			}
			i=i+2;
		}
		return p;
	}
	public static void main(String[] args)
	{
		int[] arr = {1000, 11, 445, 1, 330, 3000};
		int n = arr.length;
		minmax a=minandmaxvalue(arr , n);
		System.out.println(a.max);
		System.out.println(a.min);
	}
}

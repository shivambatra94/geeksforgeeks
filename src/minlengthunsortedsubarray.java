import java.util.*;
public class minlengthunsortedsubarray 
{
	public static void subarray(int[] arr , int n)
	{
		int s=0 , e=n-1 , max , min;
		for(s=0 ; s<n ; s++)
		{
			if(arr[s]>arr[s+1])
				break;
		}
		
		if(s==n-1)
		{
		   System.out.println("completed array is sorted");
		   return;
		}
		
		for(e=n-1 ; e>0 ; e--)
		{
			if(arr[e]<arr[e-1])
				break;
		}
		 max =arr[s];
		 min = arr[s];
		 for(int i=s+1 ; i<e ; i++)
		 {
			 if(arr[i]>max)
				 max=arr[i];
			 if(arr[i]<min)
				 min=arr[i];
		 }
		 
		 for(int i=0 ; i<s ; i++)
		 {
			 if(arr[i]>min){
				 s=i;
			 break;}
		 }
		 
		 for(int i=n-1 ; i>e ; i--)
		 {
			 if(arr[i]<max)
			 {
				 e=i;
				 break;
			 }
		 }
		 
		 System.out.println(s+" "+e);
	}
	public static void main(String[] args)
	{
		int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		subarray(arr , arr.length);
	}
}

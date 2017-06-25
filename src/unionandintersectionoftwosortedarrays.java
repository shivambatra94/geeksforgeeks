import java.util.*;
public class unionandintersectionoftwosortedarrays 
{
	public static void union(int[] arr1 , int[] arr2, int m ,int n)
	{
		int i=0,j=0;
		while(i<m && j <n)
		{
		if(arr1[i]<arr2[j])
		{
			System.out.print(arr1[i]);
			i++;
		}
		
		else if(arr1[i]>arr2[j])
		{
			System.out.print(arr2[j]);
			j++;
		}
		
		else
		{
			System.out.print(arr2[j]);
			j++;
			i++;
		}
		}
		while(i<m)
		{
			System.out.print(arr1[i]);
		    i++;
		}
		while(j<n)
		{
			System.out.print(arr2[j]);
			j++;
		}
	}
	public static void intersection(int[] arr1 , int[] arr2 , int m , int n)
	{
		int i=0,j=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			i++;
			else if(arr1[i] > arr2[j])
				j++;
			else
			{
				System.out.print(arr2[j]);
				i++;
				j++;

			}
			}
	}
	public static void main(String[] args)
	{
		int[] arr1 = {1, 3, 4, 5, 7};
		int[] arr2 = {2, 3, 5, 6};
		System.out.println("union of array");
		union(arr1 , arr2 , arr1.length , arr2.length);
		System.out.println();
		System.out.println("intersection of array");
		intersection(arr1 , arr2 , arr1.length , arr2.length);
	}
}


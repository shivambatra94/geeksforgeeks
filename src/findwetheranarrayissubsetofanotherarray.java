import java.util.*;
public class findwetheranarrayissubsetofanotherarray 
{
	public static boolean checkarray(int[] arr1 , int[] arr2 , int m , int n)
	{
		if(m<n)
			return false;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0;
		while(i<n && j<m)
		{
			if(arr2[i] > arr1[j])
				j++;
			else if(arr1[i]==arr2[j])
			{
				i++;
				j++;
			}
			else if(arr2[j]>arr1[i])
				return false;
		}
		if(i<n)
			return false;
		else
			return true;
	}
	public static void main(String[] args)
	{
		int arr1[] = {11, 1, 13, 21, 3, 7};
		int arr2[] =  {11, 3, 8, 1};
		
		if(checkarray(arr1 , arr2 , arr1.length , arr2.length)==true)
			System.out.println("is a subset");
		else
			System.out.println("not a subset");
	}
}

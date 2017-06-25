import java.util.*;
public class findrepeatedandmissingelement 
{
	public static void printtwoelement(int[] arr , int n)
	{
		int i;
		for(i=0 ; i<n ; i++)
		{
			if(arr[Math.abs(arr[i])-1]>0)
			arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
			
			else
				System.out.println("the repeated element is: "+Math.abs(arr[i]));
		}
			for(i=0 ; i<n ; i++)
			{
				if(arr[i]>0)
					System.out.println("the missing element is: "+ (i+1));
			}
				
		
	} 
	public static void  main(String[] args)
	{
		int[] arr = {1, 3, 4, 5, 5, 6, 2};
		printtwoelement(arr,arr.length);
	}
}

import java.util.*;
public class findnooccuroddtimes 
{
	//method 1(nested loops)
	/*public static void findnumber(int[] arr)
	{
		int a = 0;
		
		for(int i=0 ; i<arr.length ;i++)
		{
			
			int x=0;
			
			for(int j=0 ; j<arr.length ; j++)
			{
				if(arr[i]==arr[j])
				{
					x++;
					
				}
			}
			if(x%2!=0)
			   a=arr[i];
			
		}
		System.out.println(a);
	}*/
	//method 2(XOR operator)
	/*public static int findnumber(int[] arr)
	{
		int res =0;
		for(int i=0 ; i<arr.length ;i++)
		{
			res = res^arr[i];
		}
		return res;
	}*/
	//method 3(hashing)
	public static void findnumber(int[] arr)
	{
		HashMap<Integer , Integer> hash = new HashMap<>();
		for(int i=0 ; i<arr.length ; i++)
		{
			if(!hash.containsKey(arr[i]))
			hash.put(arr[i], 1);
		
		else
		{
			 int count = hash.get(arr[i]);
			 hash.put(arr[i], count+1);
		}
			
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			if(hash.containsKey(arr[i]) && hash.get(arr[i])%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = scan.nextInt();
		}
	findnumber(arr);
		//System.out.println(x);
	}
}

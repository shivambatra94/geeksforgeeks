import java.util.*;
public class searchelementinsortedandrotatedarray 
{
	public static int search(int[] arr , int x , int y , int key)
	{
		if(x>y)
			return -1;
		int mid = (x+y)/2;
		if(arr[mid] == key)
			return mid;
		if(arr[x] < arr[mid])
		{
			if(key>=arr[x] && key<=arr[mid])
			return search(arr , x , mid-1 , key);
			else
				return search(arr , mid+1 , y , key);
		}
		else
		{
		
		
			if(key>=arr[mid] && key<=arr[y])
			{
				return search(arr , mid+1 , y ,key);
			}
			else
				return search(arr , x , mid-1 , key);
		}
		}
	
	//using pivot
	/*public static int  pivotedbinarysearch(int[] arr ,  int n ,int key)
	{
		int pivot = findpivot( arr , 0 , n-1);
		if(pivot==-1)
			return binarysearch(arr , 0 , n-1 ,key);
		if(arr[pivot] == key)
			return pivot;
		if(arr[0] <= key)
			return binarysearch(arr , 0 , pivot-1 , key);
		else
			return binarysearch(arr , pivot+1 ,n-1 , key);
		
	}
	public static int findpivot(int[] arr , int x , int y)
	{
		if(x>y)
			return -1;
		if(x==y)
			return x;
	   int mid = (x+y)/2;
	   if(mid<y && arr[mid]>arr[mid+1])
		   return mid;
	   if(mid>x && arr[mid]<arr[mid-1])
		   return (mid-1);
	   if(arr[x] >=arr[mid])
		   return findpivot(arr , x , mid-1);
	   else
		   return findpivot(arr,mid+1 , y);
	}
	public static int binarysearch(int[] arr , int x , int y ,int key)
	{
		if(x>y)
			return -1;
		int mid = (x+y)/2;
		if(key==arr[mid])
			return mid;
		
		if(key>arr[mid])
		{
			return binarysearch(arr, mid+1, y, key);
		}
		else
			return binarysearch(arr,x , mid-1, key);

                 	

		
	}*/
	
	public  static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = scan.nextInt();
		}
		int x = arr.length;
		int key = scan.nextInt();
		int a = search(arr , 0 , n-1 , key);
		if(a>-1)
		System.out.println("found");
		else
			System.out.println("not");
		//using pivot
		//int a = pivotedbinarysearch(arr , n ,key);
		//if(a!=-1)
			//System.out.println("found");
			//else
				//System.out.println("not");
	}
}

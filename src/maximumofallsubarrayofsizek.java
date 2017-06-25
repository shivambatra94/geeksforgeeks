import java.util.*;
public class maximumofallsubarrayofsizek 
{
	public static void findelements(int[] arr , int k , int n)
	{
		int i;
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();
		for( i=0 ; i<k ; ++i)
		{
			while(!a.isEmpty() && arr[i]>=arr[a.getLast()])
			{
				a.removeLast();
			}
			a.addLast(i);
		}
		
		for( ; i<n ; ++i)
		{
			System.out.println(arr[a.getFirst()]);
			while(!a.isEmpty() && i-k>=a.getFirst())
			{
				a.removeFirst();
			}
			
			while(!a.isEmpty() && arr[i]>=arr[a.getLast()])
			{
				a.removeLast();
			}
			a.addLast(i);
		}
		System.out.println(arr[a.getFirst()]);
	}
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k= 3;
		findelements(arr , k ,arr.length);
	}
}

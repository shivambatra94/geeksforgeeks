import java.util.*;
public class merge2arrayinsortedway 
{
	public static void movetoend(int[] big , int len)
	{
		int i ,j=len-1;
		for(i = len-1 ; i>=0 ; i--)
		{
			if(big[i]!=-1)
			{
				big[j]=big[i];
				j--;
			}
		}
	}
	public static void merge(int[] big , int[] small , int m , int n)
	{
		int i=n;
		int j=0 ;//index for small array
		int k=0;//index for big array
		while(k<(m+n))
		{
			if((i<(m+n) && big[i]<=small[j])  || j==n)
			{
				big[k] = big[i];
				k++;
				i++;
			}
			else
			{
				big[k] = small[j];
				k++;
				j++;
			}
		}
	}
	public static void printarray(int[] big , int len)
	{
		for(int i=0 ; i<len ; i++)
		{
			System.out.println(big[i]);
		}
	}
   public static void main(String[] args)
   {
	   Scanner scan = new Scanner(System.in);
	   int[] big = {2, 8, -1, -1, -1, 13, -1, 15, 20};
	   int [] small = {5, 7, 9, 25};
	   int n = small.length;
	   int m = big.length - n;
	   movetoend(big , (m+n));
	   merge(big , small , m , n);
	   printarray(big , m+n);
   }
}

import java.util.*;
class tuple
{
	int val , count , index;
	public tuple(int val , int count , int index)
	{
		this.val = val;
		this.count = count;
		this.index = index;
	}
}

class Mycomparator1 implements Comparator<tuple>
{
	public int  compare(tuple t1 , tuple t2)
	{
		return t1.val - t2.val;
	}
}

class Mycomparator2 implements Comparator<tuple>
{
	public int compare(tuple t1 , tuple t2)
	{
		if(t1.count!=t2.count)
			return t2.count-t1.count;
		else
			return t1.index - t2.index;
	}
}

public class arraysortacctofrequency 
{

	public static void sortarraybyfrequency(int[] arr , int n)
	{
		tuple[] tuples = new tuple[n];
		for(int i=0 ; i<n ; i++)
		{
			tuple t = new tuple(arr[i] ,0 , i);
			tuples[i]=t;
		}
		Arrays.sort(tuples, new Mycomparator1());
		
		tuples[0].count=1;
		for(int i=1 ; i<n ; i++)
		{
			if(tuples[i].val==tuples[i-1].val)
			{
				tuples[i].count+=tuples[i-1].count+1;
				tuples[i-1].count=-1;
				tuples[i].index=tuples[i-1].index;
			}
			else
				tuples[i].count=1;
		}
		
		Arrays.sort(tuples, new Mycomparator2());
		
		int index=0;
		for(int i=0 ; i<n ; i++)
		{
			if(tuples[i].count!=-1)
			{
				for(int j=0 ; j<tuples[i].count ; j++)
					arr[index++]=tuples[i].val;
			}
		}
		
	}
	public static void printarray(int[] arr)
	{
		for(int i=0 ;i<arr.length ;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i]=scan.nextInt();
		}
		sortarraybyfrequency(arr,arr.length);
		printarray(arr);
	}
}

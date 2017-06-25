import java.util.*;
public class nextgreaterelementinarray 
{
	public static void greaterelement(int[] arr , int n)
	{
		int curr = 0;
		Stack<Integer> s = new Stack<>();
		for(int i : arr)
		{
			if(!s.isEmpty())
			{
			 curr = s.pop();
			
			while(curr < i)
			{
				System.out.println(curr+" "+i);
				
				if(!s.isEmpty())
					curr=s.pop();
				else
					break;
			}
			
			if(curr>i)
				s.push(curr);
			}
			s.push(i);
		}
		while(!s.isEmpty())
			System.out.println(s.pop()+" "+-1);
	}
	public static void main(String[] args)
	{
		int[] arr = {13,7,6,12};
		greaterelement(arr , arr.length);
	}
}

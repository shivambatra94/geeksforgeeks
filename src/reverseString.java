import java.util.*;
public class reverseString 
{
	/*public static void reverse(char[] c)
	{
		for(int i=c.length-1 ; i>=0 ; i--)
		{
			System.out.print(c[i]);
		}
	}*/
	public static void reverse(String s , int index)
	{
		System.out.print(s.charAt(index));
		if(index!=0)
		{
			reverse(s , index-1);
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		//char[] c = s.toCharArray();
		//reverse(c);
		reverse(s , s.length()-1);
	}
	
}

import java.util.*;
public class dividestringinequalparts 
{
	public static void divide(String s , int len , int n)
	{
		int i;
		int size = len/n;
		if(len%n!=0)
			System.out.println(s);
	
		else
		{
			for(i=0 ; i<len ;)
			{
				int j = ((len-i)<=size)?len:i+size;
				System.out.println(s.substring(i, j));
				i=i+size;
			}
		}
		
	}
	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);
		String s = scan.nextLine();
		int n = scan.nextInt();
		
		int len = s.length();
		//System.out.println(len);
		divide(s , len , n);
		
	}
}

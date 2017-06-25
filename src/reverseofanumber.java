import java.util.*;
public class reverseofanumber 
{
	/*public static int reverse(int n)
	{
		int rev=0;
		
		while(n>0)
		{
			rev = rev*10 + n%10;
			n=n/10;
		}
		return rev;
	}*/
	public static void reverse(int n)
	{
		if(n < 10)
	      System.out.println(n);
		else
		{
			System.out.print(n%10);
			reverse(n/10);
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		 reverse(n);
		//System.out.println(x);
	}
}

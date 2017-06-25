import java.util.*;
public class NumbersWithoutUsingLoop 
{ 
	public static void printnumbers(int n)
	{
		if(n>0){
		printnumbers(n-1);
		System.out.println(n);
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		 printnumbers(n);
		
	}
}

import java.util.*;
public class multiplynowithoutusing 
{
	public static int result(int n , int l)
	{
		if(l==0)
		  return 0;
		
		 if(l>0)
			return (n+result(n,l-1));
		 else
			 return -result(n,-l);
		
	}
	public static void main(String...s)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();
		int a = result(n,l);
		System.out.println(a);
	}
}

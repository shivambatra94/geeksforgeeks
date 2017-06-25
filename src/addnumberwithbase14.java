import java.util.*;
public class addnumberwithbase14 
{
	public static void sum(String x , String y , int res)
	{
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		int len1  = a.length;
		int len2 = b.length;
		int num1 , num2;
		
		boolean carry;
		if(len1!=len2)
		{
			System.out.println("Function doesn't support numbers of different"+
		            " lengths. If you want to add such numbers then"+
		            " prefix smaller number with required no. of zeroes");
		
	     }
	else
	{
		for(int i=len1-1 ;i>=0 ; i--)
		{
			num1 = getvalue(a[i]);
			num2 =getvalue(b[i]);
			
		}
	}
		
	}
	public static int getvalue(char z)
	{
		if(z>'0' && z<='9'){
			return (z-'0');
		}
		else 
			return(z-'A'+10);
		
	}
	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);
		String n1 = scan.nextLine();
		String n2 = scan.nextLine();
		int result = 0;
		sum(n1 , n2 , result);
	}
}

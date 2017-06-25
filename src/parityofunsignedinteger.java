import java.util.*;
public class parityofunsignedinteger 
{
	public static boolean getparity(int n)
	{
		boolean parity=false;
		while(n>0)
		{
			parity = !parity;
			n = n&(n-1);
		}
		return parity;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(getparity(n) ? "odd" : "even");
	}
}

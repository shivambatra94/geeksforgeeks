import java.util.*;
public class positionofrightmostbit 
{
	public static int position(int n)
	{
		return (int) ((Math.log(n&-n)/Math.log(2))+1);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = position(n);
		System.out.println(x);
	}

}

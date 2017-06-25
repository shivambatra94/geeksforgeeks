import java.util.*;
public class babylonianmethod 
{
	public static void squareroot(int n)
	{
		float x = n;
		float y =1;
		float e = (float) 0.000001;
		while(x-y > e)
		{
			x = (x+y)/2;
			y = n/x;
		}
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		squareroot(n);
	}
}

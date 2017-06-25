import java.util.*;
public class floatingpointnumbersprecision 
{
	//public static int precision(float n)
	//{
		//return (int) (n<0 ? n-0.5 : n+0.5);
	//}
	public static float precision(float n)
	{
		
		int k = (int) (n<0 ? n*100-0.5 : n*100+0.5);
		return (float) (k/100.0);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		float n = scan.nextFloat();
		float x = precision(n);
		System.out.println(x);
	}
}
 
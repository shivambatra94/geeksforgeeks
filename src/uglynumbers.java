import java.util.*;
public class uglynumbers
{
	public static int getuglyno(int n)
	{
		int[] u = new int[n];
		u[0] = 1;
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		for(int i = 1 ; i<n ; i++)
		{
			u[i] = min(u[i2]*2 , u[i3]*3 , u[i5]*5);
			if(u[i]==u[i2]*2)
			{
				i2=i2+1;
				
			}
			if(u[i] == u[i3] * 3) 
			{

				i3+= 1;

			}

			if(u[i] == u[i5] * 5) 
			{

				i5+= 1;

			}
		}
		
		return u[n-1];
		
	}
	public static int min(int a , int b , int c)
	{
		if(a<=b)
		{
			if(a<=c)
				return a;
			else
				return c;
		}
		else if(b<=c)
		
			return b;
		
		else
			return c;
	}
	public static void main(String[] args)
	{
	   Scanner scan = new Scanner(System.in);
	   int n = scan.nextInt();
	   int x = getuglyno(n);
	   System.out.println(x);
	   
	}
}

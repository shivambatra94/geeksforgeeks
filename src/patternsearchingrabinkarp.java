import java.util.*;
public class patternsearchingrabinkarp 
{
	public static void patternsearch(String text , String patt , int q)
	{
		int m = patt.length();
		int n = text.length();
		
		int p=0,j;
		int t=0;
		int h=1;
		int d=256;
		for(int i=0 ; i<m-1 ; i++)
		{
			h=(h*d)%q;
		}
		for(int i=0 ; i<m ; i++)
		{
		
			p=(p*d + patt.charAt(i))%q;
			t=(t*d + text.charAt(i))%q;
		}
		
		for(int i=0 ; i<=n-m ; i++)
		{
			if(p==t)
			{
				for( j=0 ; j<m ; j++)
				{
					if(text.charAt(i+j) != patt.charAt(j))
						break;
				}
				if(j==m)
					System.out.println(i);
			}
			
			if(i<n-m)
			{
				t=(d*(t-text.charAt(i)*h) + text.charAt(i+m))%q;
			}
			
			if(t<0)
				t=t+q;
			
			
				
		}
	}
	public static void main(String[] args)
	{
		String text = "abcdefg";
		String patt = "efg";
		
		int q = 101;//prime no.
		
		patternsearch(text,patt,q);
	}
}

import java.util.*;
public class patternsearchingaloKPM 
{
	public static void patternsearch(String s , String patt , int n, int m)
	{
		int[] lps = new int[m];
		int j = 0;
		int i=0;
		 computeLPSarray(patt , m , lps);
		 
		 while(i<n)
		 {
			 if(s.charAt(i)==patt.charAt(j))
			 {
				 i++;
				 j++;
			 }
			 if(j==m)
			 {
				 System.out.println("found pattern at "+(i-j));
				 j=lps[j-1];
			 }
			 else if(i<n && s.charAt(i)!=patt.charAt(j))
			 {
				 if(j!=0)
				 j = lps[j-1];
				 
				 else
					 i++;
			 }
			 
		 }
	}
	public static void computeLPSarray(String patt , int m , int[] lps)
	{
		lps[0] = 0;
		int i=1;
		int j=0;
		while(i<m)
		{
			if(patt.charAt(i)==patt.charAt(j))
			{
				j++;
				lps[i] = j;
				i++;
			}
			else 
			{
				if(j!=0)
				 j = lps[j-1];
				else
				{
					lps[i] =j;
					i++;
				}
			}
			
			
			
		}
	
	}
	
      public static void main(String[] args)
	{
	    String s = "THIS IS A TEST TEXT";
	    String patt = "ABAACB";
	    patternsearch(s , patt , s.length() , patt.length() );
    }
}


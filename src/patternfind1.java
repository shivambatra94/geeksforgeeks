import java.util.*;
public class patternfind1 
{
	public static void findpattern(char[] ch , char[] ch1)
	{
		int len1 = ch.length;
		System.out.println(len1);
		int len2 = ch1.length;
		System.out.println(len2);
		
		for(int i=0 ; i<=len1-len2 ; i++)
		{
			int j;
			for( j=0 ; j<len2 ; j++)
			{
				if(ch[i+j]!=ch1[j])
					break;
			}
		
		if(j==len2)
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		String ptr = "THIS IS A TEST TEXT";
		char[] ch = ptr.toCharArray();
		
		String txt =  "TEST";
		char[] ch1 = txt.toCharArray();
		findpattern(ch,ch1);
	} 
}


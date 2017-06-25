import java.util.*;
public class runlengthcoding 
{
	public static String encoding(String s)
	{
		
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<n ; i++)
		{
			char c = s.charAt(i);
			int count=1;
			i++;
			while(i<s.length() && s.charAt(i)==c )
			{
				count++;
				i++;
			}
			sb.append(c).append(count);
		}
		return sb.toString();
	}
	public static void main(String[] args)
	{
		String s = "wwwwaaadexxxxxx";
		String a = encoding(s);
		System.out.println(a);
	}
}

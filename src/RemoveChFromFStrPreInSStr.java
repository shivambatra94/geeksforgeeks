import java.util.*;
public class RemoveChFromFStrPreInSStr 
{
	public static void remove(String s1 , String s2)
	{
		boolean[] count = new boolean[26];
		
		for(char ch : s2.toLowerCase().toCharArray())
		{
			count[ch-97] = true;
		}
		StringBuilder sb = new StringBuilder();
		for(char c : s1.toLowerCase().toCharArray())
		{
			if(!count[c-97])
			{
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		remove(s1 , s2);
	}
}

import java.util.*;
public class RemoveDuplicates 
{
	/*public static void Duplicate(String s)
	{
	 LinkedHashSet<Character> link = new LinkedHashSet<>();
	 for(int i=0 ; i<s.length() ; i++)
	 {
		 link.add(s.charAt(i));
	 }
	 for(char ch : link)
		 System.out.println(ch);
	}*/
	public static String Duplicate(String s)
	{
		StringBuffer b = new StringBuffer();
		boolean[] bol = new boolean[256];
		for(int i=0 ; i<s.length() ; i++)
		{
			int val = s.charAt(i);
			if(!bol[val])
			{
				bol[val]=true;
				
				b.append(s.charAt(i));
			}
		}
		return b.toString();
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String buf = Duplicate(s);
		System.out.println(buf);
	}
}

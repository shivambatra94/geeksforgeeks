import java.util.*;
public class stringfirstnonrepeatingchar 
{
	public static void nonrepchr(String s)
	{
		int[] count = new int[256];
		char[] ch = s.toCharArray();
		for(int i=0 ; i<s.length() ; i++)
		{
			int index = s.charAt(i);
			count[index+97]++;
		}
		
		for(int i=0 ; i<count.length ;i++)
		{
			if(count[i]==1)
			{
				System.out.println((char)(i-97));
				break;
			}
		}
		
				
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		nonrepchr(s);
	}
}

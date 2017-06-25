import java.util.*;
public class printlistcontaingivenlettersinaword 
{
	public static void checkstring(String s , String s1 )
	{
		int[] arr =new int[256];
		int[] arr1 = new int[256];
		char[] ch =s.toCharArray();
		int len =s.length();
		for(int i=0 ; i<len ; i++)
		{
			int index = (int)s.charAt(i);
			arr[index+97]=1;
		}
		char[] ch1 = s1.toCharArray();
		int len1 = s1.length();
		
		
		int count = 0;
		for(int i=0 ; i<len1 ; i++)
		{
			if(arr[s1.charAt(i)+97]==1)
				count++;
		}
		if(count==len)
			System.out.println("it contain");
		else
		
		System.out.println("no match");
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	    String s = scan.nextLine();
	    //char[] str = s.toCharArray();
	   
	    	String s1 = scan.nextLine();
	    	
	    	checkstring(s,s1);
	   
	}
}

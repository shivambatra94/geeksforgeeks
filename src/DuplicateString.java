import java.util.*;

public class DuplicateString 
{
	public static void Duplicate(String s)
	{
	  int[] arr = new int[256];
	  char[] ch = s.toCharArray();
	  
	  for(int i=0 ; i<s.length() ; i++)
	  {
		  int index = (int)s.charAt(i);
		  arr[index+97]++;
	  }
	  
	  for(int i=0 ; i<256 ; i++)
	  {
		  if(arr[i]>1)
		  {
			  System.out.println((char)(i-97)+" = "+arr[i]);
		  }
	  }
	  
	 
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Duplicate(s);
	}

}

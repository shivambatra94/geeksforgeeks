import java.util.*;
public class maxoccuringcharacter 
{
	public static void maxChar(String s,int len)
	{
	   	int[] arr = new int[26];
	   
	   	char ch[] =s.toCharArray(); 
	   	
	   	for(int i=0 ; i<s.length() ; i++)
	   	{
	        int  value = (int)s.charAt(i);
	         arr[value-97]++;
	    }
	   	//for(int i:arr)
	   		//System.out.println(i);
	   	
	   	int count=0;
	   	
	   	//char mchar=0;
	   	
		for( int i=0 ; i<26; i++){
	   		if(arr[i]>count)
	   		{
	   			count=arr[i];
	   			
	   		}
	   		
	   }
		for(int i=0 ; i<26 ;i++)
		{
			if(arr[i]==count)
			{
			System.out.println((char)(i+97));
			}
		}
		//System.out.println(mchar);
	   	System.out.println(count);
	}
	
	

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int len=s.length();
		//System.out.println(len);
		maxChar(s,len);
		
		
	}
}

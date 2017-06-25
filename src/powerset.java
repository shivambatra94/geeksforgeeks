import java.util.*;
public class powerset 
{
	public static void power(char[] ch)
	{
		int res=0;
		int len = ch.length;
		int plen = (int) Math.pow(2, len);
		for(int i=0 ; i<=plen ; i++)
		{
			for(int j=0 ; j<len ;j++)
			{
				if((i & (1<<j))>0)
				{
					System.out.print(ch[j]);
				}
			}
			System.out.println();
		}
		
	}
   public static void main(String[] args)
   {
	   Scanner scan = new Scanner(System.in);
	   
	   String s = scan.next();
	   char[] ch = s.toCharArray();
	   power(ch);
	   
   }
}

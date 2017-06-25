import java.util.*;
public class luckynumbers 
{
	public static int checknumber(int n , int count)
	{
		int np=n;
		if(count>n)
			return 1;
		else if((n%count) == 0)
			return 0;
		return checknumber((np -= np/count) , (count+1));
		}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count=2;
		if(checknumber(n,count)>0)
			System.out.println("is a lucky number");
		else
			System.out.println("is not a lucky number");
	}
}
  
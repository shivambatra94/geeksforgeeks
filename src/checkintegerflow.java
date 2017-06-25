import java.util.*;
public class checkintegerflow 
{
	public static int checkfun(int x , int y)
	{
		int res = x+y;
		System.out.println(res);
		if(x>0 && y>0 && res<0)
			return -1;
		 if(x<0 && y<0 && res>0)
			return -1;
		return 0;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int r=checkfun(x,y);
		System.out.println(r);
		
	}
}

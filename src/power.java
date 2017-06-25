import java.util.*;
public class power 
{
	public static int power(int x , int y)
	{
		if(y==0)
			return 1;
		int temp = power(x,y/2);
		 
		 if(y%2==0)
			return temp*temp;
		else
			return x*temp*temp;
	}
	/*public static int power(float x , int y)
	 * {
	 *   if(y==0)
	 *   return 1;
	 *   int temp =power(x,y/2);
	 *   if(y%2==0)
	 *   return temp*temp;
	 *   else
	 *   {
	 *   if(y>0)
	 *   return x*temp*temp;
	 *   else
	 *   return temp*temp/x;
	 * }
	 */
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  int x = scan.nextInt();
	  int y = scan.nextInt();
	  
	 int a= power(x,y);
	 System.out.println(a);
  }
  
}
//complexity=o(log n);

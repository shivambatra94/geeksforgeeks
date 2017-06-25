import java.util.*;
public class SumSingle
{
	/*public static void add(int n)
	{
		int sum;
		for(sum=0 ; n>0 ; sum+=n%10 ,n=n/10 );
		System.out.println(sum);	
		
			
	}*/
	
	  public static int add(int n)
	  {
		  
	  if(n==0)
	  return 0;
	   
	   else
	  return (n%10 + add(n/10));
	  }
	 
	
	public static void main(String[] args)
	{
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
        int sum = add(n);
         System.out.println(sum);
	}
}

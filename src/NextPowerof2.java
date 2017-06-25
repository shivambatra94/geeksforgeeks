import java.util.*;
public class NextPowerof2 
{
	/*public static int nextpow(int n)
	{
		 int count=0;
		 
	    if ((n>0) && (n & (n - 1))==0)
	        return n;
	 
	    while (n!=0) 
	    {
	    	//right shift
	        n >>= 1;
	        count=count+1;
	        
	    }
	    //left shift
	    return 1<<count;
		
	}*/
	public static int nextpow(int n)
	{
		int p=1;
		if(n>0 && (n & (n-1))==0)
		  return n;
		while(p<n)
		{
			//left shift
			p<<=1;
		}
		return p;
		
		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = nextpow(n);
		System.out.println(x);
	}

}

import java.util.*;
public class checknocanbediviedbyn 
{
	public static int multiple(int n)
	{
		int oddcount = 0;
		int evencount = 0;
		 if(n<0)
			 n = -n;
		 if(n==0)
			 return 1;
		 if(n==1)
			 return 0;
		 while(n!=0)
		 {
			 //odd
			 if((n & 1)==1){
				 oddcount++;
			 n = n<<1;
			 }
			 //even
			 if((n&1)==0)
			 {
				 evencount++;
				 n = n<<1;
			 }
			 
			 
		 }
		 return (Math.abs(oddcount - evencount));
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int a = multiple( n );
		if(a/x==0)
			System.out.println("is a multiple");
		else
			System.out.println("not a multiple");
	}
}

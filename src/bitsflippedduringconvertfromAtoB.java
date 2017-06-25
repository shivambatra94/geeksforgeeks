import java.util.*;
public class bitsflippedduringconvertfromAtoB 
{
	public static void count(int r)
	{
		int count=0;
		while(r>0)
		{
	      count+=(r&1);
	      r>>=1;
		}
		System.out.println(count);
		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int r = (A^B);
	    count(r);
	}
}

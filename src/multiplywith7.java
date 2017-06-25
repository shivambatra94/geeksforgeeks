import java.util.*;
public class multiplywith7 
{
	public static int multiply(int n)
	{
		return (n<<3)-n;
	}
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  int n = scan.nextInt();
	 int x= multiply(n);
	 System.out.println(x);
  }
}

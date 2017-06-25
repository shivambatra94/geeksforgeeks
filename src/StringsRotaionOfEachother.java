import java.util.*;
public class StringsRotaionOfEachother 
{
	public static boolean rotation(String s1 , String s2)
	{
		return (s1.length()==s2.length() && (s1 + s1).indexOf(s2)!=-1);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		
		if(rotation(s1,s2))
		{
			System.out.println("Strings are rotation of each other");
		}
		else
			System.out.println("Strings are not rotation of each other");
	}
}

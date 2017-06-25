import java.util.*;
public class printallcombinationofbalancedparanthesis 
{
	public static void parenthesis(int i, char[] ch , int balance)
	{
		if(i==ch.length)
		{
			if(balance==0)
			{
				for(int j=0 ;j<ch.length ; j++)
				{
					System.out.print(ch[j]+" ");
				}
				return;
			}
		}
		
		else
		{
			ch[i]='{';
			parenthesis(i+1 , ch , balance+1);
			
			if(balance!=0)
			{
				ch[i]='}';
				parenthesis(i+1 , ch , balance-1);
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int n =4;
		char[] ch = new char[2*n];
		parenthesis(0,ch,0);
	}
}

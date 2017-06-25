import java.util.*;
class node11
{
	int data ; 
	node11 next;
	public node11(int data)
	{
		this.data=data;
		next=null;
	}
}
public class countgivenintinlinkedlist 
{
	static node11 head;
	public static void countelement(int n)
	{
		node11 temp = head;
		
		int count=0;
		while(temp!=null)
		{
		if(temp.data==n)
		{
			count++;
		}
		temp=temp.next;
		}
		System.out.println(count);
	}
	public static void insert(int data)
	{
		node11 p =new node11(data);
		p.next = head;
		head= p;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n-->0)
		{
			int data = scan.nextInt();
			insert(data);
		}
		int x = scan.nextInt();
		countelement(x);
	}
}

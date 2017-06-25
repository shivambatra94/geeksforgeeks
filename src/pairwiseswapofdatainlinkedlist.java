import java.util.*;
class node6
{
	int data;
	node6 next;
	node6(int data)
	{
		this.data = data;
		next=  null;
		
	}
}
public class pairwiseswapofdatainlinkedlist 
{
	static node6 head;
	public static void pairswap()
	{
		node6 temp=head;
		while(temp!=null && temp.next!=null)
		{
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp=temp.next.next;
		}
	}
	
	public static void printlist()
	{
		node6 temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
	
	public static void insert(int data)
	{
		node6 p = new node6( data);
		p.next = head;
		head=p;
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
		printlist();
		pairswap();
		System.out.println();
		System.out.println("after swap");
		printlist();
	}
}

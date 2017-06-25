import java.util.*;
class node22
{
	int data;
	node22 next;
	public node22(int data)
	{
		this.data = data;
		next=null;
	}
}
public class printreverseoflinkedlist 
{
	static node22 head;
	public static void print(node22 head)
	{
		if(head==null)
			return;
		print(head.next);
		System.out.println(head.data);
	}
	public static void insert(int data)
	{
		node22 p = new node22(data);
		p.next = head ; 
		head = p ; 
	}
	public static void printlinklist(node22 head)
	{
	  while(head!=null)
	  {
		  System.out.println(head.data);
		  head=head.next;
	  }
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
		printlinklist(head);
		print(head);
	}

}

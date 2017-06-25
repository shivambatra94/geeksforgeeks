import java.util.*;
class node26
{
	int data ;
	node26 next;
	public node26(int data)
	{
		this.data=data;
		next=null;
	}
}
public class removeduplicatesfromsortedlinkedlist 
{
	static node26 head;
	public static void remove(node26 head)
	{
		node26 curr = head;
		node26 next;
		if(head==null)
			return;
		
		while(curr.next!=null)
		{
			if(curr.data==curr.next.data)
			{
				next = curr.next.next;
				curr.next=null;
				curr.next=next;
			}
			else
				curr=curr.next;
		}
	}
	public static void insert(int data)
	{
		node26 p = new node26(data);
		p.next = head;
		head = p;
	}
	public static void printelements(node26 head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void main(String...s)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n-->0)
		{
			int data = scan.nextInt();
			insert(data);
		}
		System.out.println("before removing duplicates");
		printelements(head);
		remove(head);
		System.out.println();
		System.out.println("after removing");
		printelements(head);
	}
	
}

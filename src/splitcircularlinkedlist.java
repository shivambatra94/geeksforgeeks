import java.util.*;
class node1
{
	int data ;
	node1 next;
	node1(int data)
	{
		this.data = data;
		next=null;
	}
}
public class splitcircularlinkedlist 
{
	static node1 head;
	public static void insert(int data)
	{
		node1 curr = head;
		node1 p = new node1(data);
		p.next=head;
		if(head!=null)
		{
			while(curr.next!=null)
			{
				curr=curr.next;
				curr.next=p;
			}
		}
		else
		{
			p=p.next;
		}
		head=p;
		
		
		}
		
	public static void print(node1 head)
	{
		node1 curr=head;
		if(head!=null)
		
		{
		do
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}while(curr!=head);
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
		print(head);
	}
}

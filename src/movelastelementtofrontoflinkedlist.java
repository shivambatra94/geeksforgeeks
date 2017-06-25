import java.util.*;
class node5
{
	int data;
	node5 next;
	node5(int data)
	{
		this.data=data;
		next=null;
	}
}
public class movelastelementtofrontoflinkedlist 
{
	static node5 head;
	public static node5 reverselist(node5 head)
	{
		if(head==null || head.next==null)
			return null ;
		node5 last=head;
		node5 seclast= null;
		while(last.next!=null)
		{
			seclast=last;
			last=last.next;
		}
	
		seclast.next = null;
		last.next=head;
		head=last;
		return head;
		
	}
	public static void printlist(node5 head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	public static void insert(int data)
	{
		node5 p = new node5(data);
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
		head=reverselist(head);
		printlist(head);
	}
}

import java.util.*;
class node8
{
	int data;
	node8 prev ,next;
	node8(int data)
	{
		this.data = data;
		prev=next=null;
	}
}
public class deletenodeindoublylinkedlist 
{
	static node8 head;
	public static void delete(node8 del)
	{
		if(head==null && del==null)
			return;
		
		if(head==del)
			head=del.next;
		
		if(del.next!=null)
			del.next.prev=del.prev;
		
		if(del.prev!=null)
			del.prev.next=del.next;
		
		return;
	}
	public static void insert(int data)
	{
		node8 p = new node8(data);
		p.prev=null;
		p.next = head;
		
		if(head!=null)
		head.prev = p;
		
		head=p;
	}
	public static void printlist()
	{
		node8 temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp= temp.next;
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
		printlist();
		delete(head.next.next);
		System.out.println();
		printlist();
	}
}

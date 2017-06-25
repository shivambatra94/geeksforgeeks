import java.util.*;
class node9
{
	int data;
	node9 next;
	public node9(int data)
	{
		this.data = data;
		next=null;
	}
}
public class middleelementinlinkedlist 
{
	static node9 head;
	public static void middleelement( )
	{
		node9 fast = head;
		node9 slow = head;
		if(head!=null)
		{
			while(fast!=null && fast.next!=null)
			{
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.println("the middle element is"+"= "+slow.data);
		}
		
	}
	public static void insert( int data)
	{
		node9 p = new node9(data);
		p.next = head;
		head = p;
		
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
		middleelement( );
	}
}

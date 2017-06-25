import java.util.*;
class node18
{
	int data;
	node18 next ; 
	public node18(int data)
	{
		this.data = data;
		next=null;
	}
}
public class insertelementinsortedlinkedlist 
{
	static node18 head;
	public static void sorted( int data)
	{
		node18 ins = new node18(data);
		
		if( (head==null) || (head.data >= ins.data))
		{
			ins.next = head;
			head=ins;
		}
		else
		{
			node18 curr= head;
			while(curr.next!=null && curr.next.data < ins.data)
			{
	           curr = curr.next;
			}
				ins.next=curr.next;
				curr.next = ins;
			
		}
	}
	public static void print(node18 head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n-- > 0)
		{
			int data = scan.nextInt();
			sorted( data);
		}
		print(head);
	    
	
		
	}
}

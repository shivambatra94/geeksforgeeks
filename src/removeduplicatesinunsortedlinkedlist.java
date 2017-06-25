import java.util.*;
class node27
{
	int data ;
	node27 next;
	public node27(int data)
	{
		this.data=data;
		next=null;
	}
}
public class removeduplicatesinunsortedlinkedlist 
{
	static node27 head;
	public static void remove(node27 head)
	{
		HashMap<Integer , Integer> list = new HashMap<Integer , Integer>();
		node27 curr=head , ptr=head ,next=null;
		while(curr!=null)
		{
			next = curr.next;
			if(list.containsKey(curr.data))
			{
				ptr.next=curr.next;
				curr=next;
				
			}
			else
			{
				list.put(curr.data, 1);
				ptr=curr;
				curr=next;
			}
		}
	}
	public static void insert(int data)
	{
		node27 p = new node27(data);
		p.next = head;
		head = p;
	}
	public static void printelements(node27 head)
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

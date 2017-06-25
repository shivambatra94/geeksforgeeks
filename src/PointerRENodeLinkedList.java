 import java.util.*;
class node1
{
	int data;
	node1 next;
	node1(int data)
	{
		this.data=data;
		
	}
}
public class PointerRENodeLinkedList 
{
	
	static node1 head;
	public static void delete(node1 node_ptr)
	{
		node1 temp;
		temp = node_ptr.next;
		node_ptr.data = temp.data;
		node_ptr.next = temp.next;
		temp=null;
	}
	public static void insert(int data)
	{
		node1 p = new node1(data);
		p.next = head;
		head=p;
	}
	public static void printlist(node1 head)
	{
		node1 curr = head;
		while(curr!=null)
		{
			System.out.print(" "+curr.data);
			curr= curr.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int data = scan.nextInt();
			insert(data);
		}
		printlist(head);
		delete(head.next);
		printlist(head);
	}

}

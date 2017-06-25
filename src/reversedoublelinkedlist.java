import java.util.*;
class node
{
	int data;
	node next,prev;
	node(int data)
	{
		this.data=data;
		next=prev=null;
	}
}
public class reversedoublelinkedlist 
{
	static node head;
	public static void  reverselist()
	{
		node curr = head;
		node next=null;
	     node p = null;
		while(curr!=null)
		{
			next = curr.prev;
			curr.prev = curr.next;
			curr.next=next;
			curr=curr.prev;
		}
		if(next!=null)
			head = next.prev;
			
				
		}
	public static void print()
	{
		node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	public static void insert(int data)
	{
		node p = new node(data);
		p.prev = null;
		p.next = head;
		if(head!=null)
			head.prev=p;
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
		print();
		//reverselist();
		//print();
	}
}

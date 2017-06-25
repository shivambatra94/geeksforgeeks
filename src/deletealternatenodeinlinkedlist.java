import java.util.*;
class node10
{
	int data;
	node10 next;
	node10(int data)
	{
		this.data = data;
		next=null;
	}
}
public class deletealternatenodeinlinkedlist 
{
	static node10 head;
	public static void remove(node10 prev)
	{
		if(head==null)
			return;
		node10 r = prev.next;
		if(r==null)
			return;
	prev.next = r.next;
	remove(prev.next);
		
		
	}
	public static void insert(int data)
	{
		node10 p =new node10(data);
		p.next = head;
		head=p;
	}
	
	public static void printlist()
	{
		node10 temp =head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
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
		remove( head);
		System.out.println();
		printlist();
	}
}

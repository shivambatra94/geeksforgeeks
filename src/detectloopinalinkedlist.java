import java.util.*;
class node12
{
	int data;
	node12 next;
	public node12(int data)
	{
		this.data=data;
		next=null;
	}
}
public class detectloopinalinkedlist 
{
	static node12 head;
	public static int detectloop()
	{
		node12 fast = head;
		node12 slow = head;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast)
			{
				System.out.println("loop found");
				return 1;
			}
			
		}
		return 0;
	}
	public static void insert(int data)
	{
		node12 p =new node12(data);
		p.next = head;
		head= p;
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
		head.next.next.next.next = head;
		detectloop();
	}
}

import java.util.*;




public class reversealternateknodesinlinkedlist 
{
	static node head;
	class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data = data;
			next=null;
		}
	}
	public static node alternate(node head , int k)
	{
		node curr = head;
		node next=null;
		node prev=null;
		int count=0;
		while(count<k && curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr=next;
			count++;
		}
		
		if(head!=null)
			head.next = curr;
		
		 count=0;
		while(count<k-1 && curr!=null)
		{
			curr=curr.next;
			count++;
		}
		if(curr!=null)
			curr.next = alternate(curr.next , k);
		
		return prev;
		
	}
	 void insert(int data)
	{
		node p = new node(data);
	    p.next = head;
	    head = p;
	}
	 public static void printlist(node head)
	  {
		  node temp = head;
		  while(temp!=null)
		  {
			  System.out.print(temp.data);
			  temp=temp.next;
		  }
	  }
	public static void main(String[] args)
	{
		 reversealternateknodesinlinkedlist list = new reversealternateknodesinlinkedlist();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n-->0)
		{
			int data = scan.nextInt();
			list.insert(data);
		}
		printlist(head);
		node x = alternate(head , 3);
		System.out.println();
		printlist(x);
	}
}

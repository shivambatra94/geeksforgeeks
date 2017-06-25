import java.util.*;
public class reverselistingroupsofgivensize 
{
	static node head;
	class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	public static node groupdivide(node head , int k)
	{
		node curr = head;
		int count=0;
		node prev=null , next=null;
		while(count<k && curr!=null)
		{
			next= curr.next;
			curr.next = prev;
			prev=curr;
			curr=next;
			count++;
		}
		
		if(curr!=null)
			head.next = groupdivide(next , k);
		
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
		reverselistingroupsofgivensize list = new reverselistingroupsofgivensize();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n-->0)
		{
			int data = scan.nextInt();
			list.insert(data);
		}
		printlist(head);
		node x = groupdivide(head , 3);
		System.out.println();
		printlist(x);
	}
}

import java.util.*;
public class segregateoddandeveninlinkedlist 
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
	public static void segregate()
	{
		node curr = head;
		node end = head;
		node prev = null;
		while(end.next!=null)
			end=end.next;
		node newend = end;
		while((curr.data%2)!=0 && curr!=end )
		{
			newend.next = curr;
			curr=curr.next;
			newend.next.next=null;
			newend=newend.next;
		}
		
		if(curr.data%2==0)
		{
			head = curr;
			while(curr!=end)
			{
			if(curr.data%2==0)
			{
				prev=curr;
				curr=curr.next;
			}
			else
			{
				prev.next = curr.next;
				curr.next = null;
				newend.next = curr;
				newend=curr;
				curr = prev.next;
				
			}
		    }
	    }
		
		/*else
			prev = curr;
	if(newend!=end && end.data%2!=0)
	{
		prev.next=end.next;
		end.next=null;
		newend.next=end;
	}*/
		
	}
	 void insert(int data)
	{
		node p = new node(data);
		p.next = head;
		head=p;
	}
	 public static void printlist()
	 {
		 node temp=head;
		 while(temp!=null)
		 {
			 System.out.print(" "+temp.data);
			 temp=temp.next;
		 }
	 }
	public static void main(String[] args)
	{
		segregateoddandeveninlinkedlist list = new segregateoddandeveninlinkedlist();
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		while(n-->0)
		{
			int data = scan.nextInt();
			list.insert(data);
		}
		printlist();
		segregate();
		System.out.println();
		printlist();
	}
}

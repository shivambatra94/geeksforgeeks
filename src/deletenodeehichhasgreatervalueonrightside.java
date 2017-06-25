import java.util.*;
public class deletenodeehichhasgreatervalueonrightside 
{
	static node head;
	class node
	{
		int data ;
		node next;
		node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static void deletefun()
	{
		reverse();
		deletenode();
		reverse();
	}
	public static void deletenode()
	{
		node curr = head;
		node maxnode = head;
		node temp;
		while(curr!=null && curr.next!=null)
		{
			if(curr.next.data <maxnode.data)
			{
				temp=curr.next;
				curr.next=temp.next;
				temp=null;
			}
			
			else
			{
				curr=curr.next;
				maxnode=curr;
			}
		}
	}
	public static void reverse()
	{
		node curr=head;
		node prev=null;
		node next;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
public static	void printlist()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
	}
	 void insert(int data)
	{
		node p = new node(data);
		p.next=head;
		head=p;
	}
	public static void main(String[] args)
	{
		deletenodeehichhasgreatervalueonrightside list = new deletenodeehichhasgreatervalueonrightside();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n-->0)
		{
			int data = scan.nextInt();
			list.insert(data);
		}
		printlist();
		deletefun();
		System.out.println();
		printlist();
	}
}

import java.util.*;
class node11 
{
	int data;
	node11 next;
	node11(int data)
	{
		this.data = data;
		next=null;
	}
}
public class alternatesplitoflinkedlist 
{
	static node11 head;
	public static void alternatesplit(node11 head , node11 a , node11 b)
	{
		node11 adummy = new node11(Integer.MAX_VALUE);
		node11 bdummy = new node11(Integer.MAX_VALUE);
		node11 atail = adummy;
		node11 btail = bdummy;
		adummy.next=null;
		bdummy.next=null;
		node11 curr = head;
		while(curr!=null)
		{
			movenode(atail , curr);
			atail=atail.next;
			if(curr!=null)
			{
				movenode(btail , curr);
				btail = btail.next;
			}
		}
		a=adummy.next;
		b=bdummy.next;
		
	}
	
	public static void movenode(node11 dest , node11 curr)
	{
		node11 temp = curr;
		temp.next=null;
		dest.next=temp;
		
		curr=curr.next;
	}
	public static void insert(int data)
	{
		node11 p = new node11(data);
		p.next = head;
		head=p;
	}
	public static void printlist(node11 temp)
	{
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args)
	{
		alternatesplitoflinkedlist list1 = new alternatesplitoflinkedlist();
		
		node11 a=null;
		node11 b = null;
		
		list1.head=new node11(1);
		list1.head.next=new node11(0);
		list1.head.next.next=new node11(1);
	    list1.head.next.next.next=new node11(0);
		
		printlist(list1.head);
		alternatesplit(list1.head , a , b);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		
	}
}

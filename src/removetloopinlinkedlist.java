import java.util.*;
public class removetloopinlinkedlist 
{
	static node head;
	static class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static void detectloop(node head)
	{
		node slow = head;
		node fast = head;
		while(fast!=null && slow!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
			{
				
				removeloop(slow,head);
				break;
			}
		}
	}
	public static void removeloop(node loop , node head)
	{
		int k=1,i;
		node ptr1 = loop;
		node ptr2 = loop;
		while(ptr1.next!=ptr2)
		{
			ptr1=ptr1.next;
			k++;
		}
		
		ptr1=head;
		ptr2=head;
		for(i=0 ; i<k ; i++)
		{
			ptr2 = ptr2.next;
		}
		
		while(ptr2!=ptr1)
		{
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		ptr2 = ptr2.next;
		while(ptr2.next!=ptr1)
		{
			ptr2 = ptr2.next;
		}
		
	ptr2.next=null;
		
		
	}
	void printlist(node head)
	{
		node temp =head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args)
	{
		 removetloopinlinkedlist list = new removetloopinlinkedlist();
	        list.head = new node(1);
	        list.head.next = new node(2);
	        list.head.next.next = new node(3);
	        list.head.next.next.next = new node(4);
	        list.head.next.next.next.next = new node(5);
	        head.next.next.next.next.next = head.next;
	        detectloop(head);
	        list.printlist(head);
	}
}

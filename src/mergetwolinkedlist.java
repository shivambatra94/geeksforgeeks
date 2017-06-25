import java.util.*;
class node12 
{
	int data;
	node12 next;
	node12(int data)
	{
		this.data = data;
		next=null;
	}
}
public class mergetwolinkedlist 
{
	static node12 head;
	public static node12 mergelist(node12 head1 ,node12 head2 , node12 head3)
	{
		node12 temp1 = head1;
		node12 temp2= head2;
		node12 temp3 = head3;
		while(temp1!=null || temp2!=null)
		{
			if(temp1!=null && temp2!=null)
			{
				if(temp1.data<temp2.data)
				{
					temp3.next=temp1;
					  temp1 = temp1.next;
				}
				else
				{
					temp3.next = temp2;
					temp2 = temp2.next;
				}
			}
			temp3 = temp3.next;
				
		}
		
		if(temp2==null)
		{
			temp3.next = temp1;
			temp3= temp3.next;
			temp1 = temp1.next;
		}
		
		if(temp1 == null)
		{
			temp3.next=temp2;
			temp3 = temp3.next;
			temp2 = temp2.next;
		}
		
		return head3.next;
	}
	public static void insert(int data)
	{
		node12 p = new node12(data);
		p.next = head;
		head=p;
	}
	public static void printlist(node12 head)
	{
		node12 curr = head;
		while(curr!=null)
		{
			System.out.print(curr.data);
			curr=curr.next;
		}
	}
	public static void main(String[] args)
	{
		mergetwolinkedlist list1 = new mergetwolinkedlist();
		mergetwolinkedlist list2 = new mergetwolinkedlist();
		mergetwolinkedlist list3 = new mergetwolinkedlist();
		
		list1.head=new node12(5);
		list1.head.next=new node12(10);
		list1.head.next.next=new node12(20);
		list2.head=new node12(2);
		list2.head.next=new node12(3);
		list2.head.next.next=new node12(20);
		list2.head.next.next.next=new node12(50);
		
	    list3.head = new node12(Integer.MIN_VALUE);
		
		printlist(list1.head);
		System.out.println();
		printlist(list2.head);
		node12 head4 = mergelist(list1.head , list2.head, list3.head);
		System.out.println();
	    printlist(head4);
	}
}

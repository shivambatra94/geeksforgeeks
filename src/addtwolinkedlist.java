import java.util.*;
public class addtwolinkedlist 
{
	static node head1,head2;
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
	public static node addlinkedlist(node first , node second)
	{
		node res = null;
		node temp = null;
		node prev = null;
		int carry=0;
		int sum;
		
		while(first!=null || second!=null)
		{
			sum=carry + (first!=null ? first.data :0) + (second!=null ? second.data :0);
			carry = sum>=10 ? 1:0;
			
			sum = sum%10;
			temp=new node(sum);
			
			if(res==null)
				res=temp;
			
			else
				prev.next=temp;
			
			prev = temp;
			
			if(first!=null)
				first=first.next;
			
			if(second!=null)
				second=second.next;
		}
		
		if(carry>0)
			temp.next = new node(carry);
		
		return res;
	}
	
	public void printList(node head)
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args)
	{
		addtwolinkedlist list = new addtwolinkedlist();
		 
        // creating first list
        list.head1 = new node(7);
        list.head1.next = new node(5);
        list.head1.next.next = new node(9);
        list.head1.next.next.next = new node(4);
        list.head1.next.next.next.next = new node(6);
        System.out.print("First List is ");
        list.printList(head1);
 
        // creating seconnd list
        list.head2 = new node(8);
        list.head2.next = new node(4);
        System.out.print("Second List is ");
        System.out.println();
        list.printList(head2);
        
        node res = addlinkedlist(head1 , head2);
        System.out.println();
         list.printList(res); 
	}
}
import java.util.*;

 
public class identicallinkedlist
{
	 node13 head;

	class node13
	{
		int data;
		node13 next;
		public node13(int data)
		{
			this.data = data;
			next=null;
		}
	}
	
    public static boolean checkidentical(node13 head1 , node13 head2)
	{
		if(head1==null && head2==null)
			return true;
		
		if(head1!=null && head2!=null)
		  return((head1.data == head2.data)
					&& checkidentical(head1.next, head2.next));
		
		return false;
	}
	 void push(int new_data)
	{
		node13 p = new node13(new_data);
		p.next = head;
		head = p;
		
	}
	public static void main(String[] args)
	{
		identicallinkedlist list1 = new identicallinkedlist();
		 identicallinkedlist list2 = new identicallinkedlist();
		
		list1.push(1);
		list1.push(2);
		list1.push(3);
		list2.push(1);
		list2.push(2);
		list2.push(3);
		
		boolean a = checkidentical(list1.head , list2.head);
		
		if(a!=true)
			System.out.println(" not identical");
		else 
			System.out.println(" identical");
		
  	}
}

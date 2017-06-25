import java.util.*;
class node13
{
	int data;
	node13 next;
	public node13(int data)
	{
		this.data=data;
		next=null;
	}
}
public class reverselinkedlist 
{
	static node13 head;
	/*public static node13 reverselist(node13 head)
	{
		node13 prev = null;
		node13 curr = head;
		node13 next =null;
	    while(curr!=null)
	    {
	    	next = curr.next;
	    	curr.next = prev;
	    	prev = curr;
	    	curr = next;
	    }
	    head = prev;
	    return head;
	    
	}*/
	//using recursion
	public static node13 reverselist(node13 curr, node13 prev) {
		 
        
        if (curr.next == null) 
        {
            head = curr;
            curr.next = prev;
            return null;
        }
         node13 next1 = curr.next;
         curr.next = prev;
         reverselist(next1, curr);
        return head;
    }
	public static void printlist(node13 head)
	{
		if(head==null)
			return;
		while(head!=null)
		{
			System.out.print(head.data);
			head=head.next;
		}
	}
	public static void insert(int data)
	{
		node13 p =new node13(data);
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
		System.out.println("the lsit before reverse is called");
		printlist(head);
	head = reverselist(head , null);
		System.out.println("");
		System.out.println("the list after reverse is called");
		printlist(head);
}
}
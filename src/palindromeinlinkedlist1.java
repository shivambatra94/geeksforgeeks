import java.util.*;
class node16
{
	int data;
	node16 next;
	public node16(int data)
	{
		this.data = data;
		next=null;		
	}
}
public class palindromeinlinkedlist1 
{
	static node16 head;
	static boolean isp1;
	//static node16 second_half;
	//static node16 fast;
	//static node16 slow;
	
	/*public static boolean ispalindrome()
	{
		
	   fast = head;
	    slow =head;
	   node16 prev_slow = head;
	   node16 mid_ele = null;
	   boolean  res = true;
	   if(head!=null && head.next!=null)
	   {
	   while(fast!=null && fast.next!=null)
	   {
		   fast = fast.next.next;
		   prev_slow = slow;
		   slow = slow.next;
	   }
	   if(fast!=null)
	   {
		   mid_ele = slow;
		   slow= slow.next;
	   }
	   
	   second_half=slow;
	   prev_slow.next=null;
	   reverse();
	   res = compare(head , second_half);
	   reverse();
	   if(mid_ele!=null)
	   {
		   prev_slow.next = mid_ele;
		   mid_ele.next = second_half;
	   }
	   else
		   prev_slow.next = second_half;
	}
	   return res;
	}
	public static void reverse()
	{
		node16 curr=second_half;
		node16 next;
		node16 prev= null;
		while(curr!=null)
		{
			next= curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;	
		}
		second_half = prev ;
	}
	public static boolean compare(node16 first , node16 sec)
	{
		while(first!=null && sec!=null)
		{
			if(first.data == sec.data)
			{
				first = first.next ; 
				sec = sec.next;
			}
			else 
				return false;
		}
		if(first==null && sec== null )
			return true;
		else
			return false;
	}*/
	//using recursion
	public static boolean ispalindromeuntil( node16 right)
	{
		node16 left=head;
		if(right==null)
			return true;
	
		boolean	isp = ispalindromeuntil(right.next);
		
		if (!isp)
            return false;
 
		
			
         if( (left.data) == (right.data))
         {
        	 
        left = left.next;
        return true;
		}
         else
        return false;
	}
	
	public static void insert(int data)
	{
		node16 p = new node16(data);
		p.next = head;
		head = p;
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
	   if(ispalindromeuntil(head)!=false)
		   System.out.println("is a palindrome");
	   else
		   System.out.println("is not a palindrome");
   }
}

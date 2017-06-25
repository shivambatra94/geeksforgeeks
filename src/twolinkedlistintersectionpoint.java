import java.util.*;
class node19
{
	int data;
	node19 next;
	public node19(int data)
	{
		this.data = data;
		next = null;
	}
}
public class twolinkedlistintersectionpoint 
{
	static node19 head1 , head2;
	public static void getnode()
	{
		int d;
		int c1 = getcount(head1);
        int c2 = getcount(head2);
        if(c2>c1)
        {
        	d = c2-c1;
         getnodedata(head1 , head2 ,d );       
        }
        else
        {
        	d=c1-c2;
        	 getnodedata(head1 , head2 ,d );  
        }
        
	}
	public static void getnodedata(node19 head1 , node19 head2 , int d)
	{
		node19 curr1 = head1;
		node19 curr2 = head2;
		
		for(int i=0 ; i<d ;i++)
		{
			if(curr1==null)
				return ;
			else
				curr1 = curr1.next;
		}
		
		while(curr1!=null && curr2!=null)
		{
			if(curr1.data==curr2.data)
			{
				System.out.println (curr1.data);
				break;
			}
			curr1= curr1.next;
			curr2 = curr2.next;
		}
		
	}
	public static int getcount(node19 head)
	{
		int count=0;
		node19 current = head;
		while(current!=null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	public static void insert1(int data)
	{
		node19 p = new node19(data);
		p.next = head1;
		head1 = p;
	}
	
	public static void insert2(int data)
	{
		node19 p = new node19(data);
		p.next = head2;
		head2 = p;
	}
	
	public static void main(String[] arr)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		while(n-->0)
		{
			int data = scan.nextInt();
			insert1(data);
		}
		int a = scan.nextInt();
		while(a-->0)
		{
			int data =scan.nextInt();
			 insert2(data);
		}
		getnode();
	}
}

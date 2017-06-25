import java.util.Scanner;

class node
{
	int data;
	 node next;
	node(int data)
	{
		this.data = data;
		next =null;
	}
}
 
class NthLinkedList 
{
	 static node head;
	public static int getnode(int index)
	{
		node current = head;
		int count=0;
		
		while(current!=null)
		{
		if(count==index)
		return current.data;
			
		count++;
		current=current.next;
		}
		
		assert(false);
		return 0;
	}
	public  static void insert( int data)
	{
		node p = new node(data);
		
		p.next = head;
		
		
		head = p ;
		
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		
		while(T-->0)
		{
			int data = scan.nextInt();
			insert(data);
		}
		
		
		int index = scan.nextInt();
		System.out.println("Element at index 3 is "+getnode(index) );
		
	
	}
}

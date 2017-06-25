import java.util.*;
public class sortedinsertofcircularlinkedlist 
{
	static node head;
	class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	 void insert(node temp)
	{
		node curr =head;
		if(curr==null)
		{
			temp.next=temp;
			head=temp;
		}
		
		else if(curr.data >= temp.data)
		{
			while(curr.next!=head)
			{
				curr = curr.next; 
			}
			curr.next = temp;
			temp.next=head;
			head=temp;
			
		}
		
		
		else 
		{
			while(curr.next!=head && curr.next.data < temp.data)
				curr = curr.next;
			
			temp.next=curr.next;
			curr.next=temp;
			
		}
	}
	void printlist()
	{
		node curr=head;
		if(head!=null)
		
		{
		do
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}while(curr!=head);
		}
	}
	 node newnode(int data)
	 {
		 node p = new node(data);
		 return p;
	 }
	public static void main(String[] args)
	{
		sortedinsertofcircularlinkedlist list = new sortedinsertofcircularlinkedlist();
		int[] arr = {12, 56, 2, 11, 1, 90};
		node temp = null ;
       for(int i=0 ; i<6 ; i++)
       {
    	   temp = list.newnode(arr[i]);
    	   list.insert(temp);
       }
       list.printlist();
		
	}
}

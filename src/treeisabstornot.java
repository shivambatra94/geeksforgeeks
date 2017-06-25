import java.util.*;
class node21
{
	int data;
	node21 left , right;
	
	node21(int data)
	{
		this.data = data;
		left=right=null;
	}
}
public class treeisabstornot 
{
	 static node21 root;
	public static boolean isbst()
	{
		
			return isbstutil(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
	}
	public static boolean isbstutil(node21 root , int min , int max)
	{
		if(root==null)
			return true;
		if(root.data<min || root.data>max)
			return false;
	
		
			return (isbstutil(root.left , min , root.data ) && isbstutil(root.right , root.data,max));
		
	}

	/*public static node21 insert(node21 root , int data)
	{
		if(root==null)
			return new node21(data);
		else
		{
		node21 curr;
		if(data<=root.data)
		{
			curr = insert(root.left , data);
			root.left = curr;
		}
		else if(data>=root.data)
		{
			curr = insert(root.right , data);
			root.right = curr;
		}
		
		
		return root ;
		}
	}*/
	public static void main(String[] args)
	{
		treeisabstornot bi = new treeisabstornot();
		
		bi.root = new node21(3);
        bi.root.left = new node21(2);
        bi.root.right = new node21(5);
        bi.root.left.left = new node21(1);
        bi.root.left.right = new node21(4);
		/*Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		  node21 root = null;
		  while(n-->0)
		  {
			int data = scan.nextInt();
			root=insert(root , data);
		  }*/
		  boolean x =isbst();
		  if(x==true)
		  System.out.println("yes");
		  else
			  System.out.println("NO");
	}
}

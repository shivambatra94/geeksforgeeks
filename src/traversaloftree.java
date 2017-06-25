import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.sun.corba.se.impl.orbutil.graph.Node;

class node4
{
	int data;
	node4 left , right;
	
	node4(int data)
	{
		this.data = data;
		left=right=null;
	}
}
public class traversaloftree
{
	
	public static void inorder(node4 root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		}
		
		public static  void postorder(node4 root)
		{
			if(root==null)
			return;
			postorder(root.left);
			postorder(root.right);
		
			System.out.println(root.data);
		}
		public static void preorder(node4 root)
		{
			if(root==null)
				return;
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
		public static void levelorder(node4 root)
		{
	          Queue<node4> queue = new LinkedList();
	          queue.add(root);
	          while(!queue.isEmpty())
	          {
	        	  node4 curr = queue.remove();
	        	  System.out.println(curr.data);
	        	  
	        	  if(curr.left!=null)
	        		  queue.add(curr.left);
	        	  
	        	  if(curr.right!=null)
	        		  queue.add(curr.right);
	          }
			
		}
	
	public static node4 insert(node4 root , int data)
	{
		if(root==null)
			return new node4(data);
		else
		{
		node4 curr;
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
	}
	
	public static void main(String[] args)
	{
	  Scanner scan = new Scanner(System.in);
	  int n = scan.nextInt();
	  node4 root = null;
	  while(n-->0)
	  {
		int data = scan.nextInt();
		root=insert(root , data);
	  }
	  inorder(root);
	  System.out.println("postorder");
	  postorder(root);
	  System.out.println("preorder");
	  preorder(root);
	  System.out.println("levelorder");
	  levelorder(root);
	}
}

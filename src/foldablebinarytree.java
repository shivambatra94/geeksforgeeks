import java.util.*;
public class foldablebinarytree 
{
	class node
	{
		int data;
		node left , right;
		node(int data)
		{
			this.data = data;
			left=right=null;
		}
	}
	public static boolean isfolded(node root)
	{
	  boolean res;
	  if(root==null)
		  return true;
	  //mirror of left subtree
	  mirror(root.left);
	  
	  res = isstructure(root.left , root.right);
	  
	  mirror(root.left);
	  
	  return res;
	}
	
	public static boolean isstructure(node a , node b)
	{
		if(a==null && b==null)
			return true;
		if(a!=null && b!=null
				&& isstructure(a.left , b.left)
				&& isstructure(a.right , b.right))
			return true;
			
			
		return false;
	}
	
	public static void mirror(node root)
	{
		node temp;		
		if(root == null)
			return;
		else
		{
		 mirror(root.right);
		 mirror(root.left);
		 
		 temp = root.left;
		 root.left = root.right;
		 root.right = temp;
		}
	}
	public  node insert(node root , int data)
	{
		if(root==null)
			return new node(data);
		else
		{
			node curr;
			if(data<=root.data)
			{
				curr=insert(root.left,data);
				root.left=curr;
			}
			if(data>root.data)
			{
				curr=insert(root.right , data);
				root.right=curr;
			}
			return root;
		}
	}
	public static void main(String[] args)
	{
		foldablebinarytree tree = new foldablebinarytree();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root = tree.insert(root , data);
		}
		boolean a = isfolded(root);
		if(a==true)
			System.out.println("fold");
		else
			System.out.println("not fold");
	}
}

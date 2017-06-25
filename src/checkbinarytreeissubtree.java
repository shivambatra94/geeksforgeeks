import java.util.*;
public class checkbinarytreeissubtree 
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
	public static boolean isidentical(node root1 , node root2)
	{
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		 return (root1.data==root2.data && isidentical(root1.left,root2.left) && isidentical(root1.right , root2.right));
		
	}
	//root1=t root2=s
	public static boolean checktree(node root1 , node root2)
	{
		if(root1==null)
			return false;
		
		if(root2==null)
			return true;
		
		if(isidentical(root1,root2))
			return true;
		
		return checktree(root1.left ,root2) || checktree(root1.right,root2);
	}
	 node insert(node root , int data)
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
		checkbinarytreeissubtree tree = new checkbinarytreeissubtree();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node root1 = null;
		node root2 = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root1 = tree.insert(root1 , data);
		}
		System.out.println("subtree");
		int n1 = scan.nextInt();
		while(n1-->0)
		{
			int data = scan.nextInt();
			root2 = tree.insert(root2 , data);
		}
		
		boolean a =checktree(root1,root2);
		if(a==true)
		System.out.println("is a subtree");
		else
			System.out.println("not a subtree");
	}
}

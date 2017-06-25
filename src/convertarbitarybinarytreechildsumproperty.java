import java.util.*;
class node25
{
	int data;
	node25 left , right;
	public node25(int data)
	{
		this.data = data;
		left=right=null;
	}
}
public class convertarbitarybinarytreechildsumproperty 
{
	static node25 root;
	public static void converttree(node25 root)
	{
		int leftdata = 0 , rightdata = 0 , diff;
		if(root==null || (root.left==null && root.right==null))
			return;
		else
		{
			converttree(root.left);
			converttree(root.right);
			
			if(root.left!=null)
				leftdata=root.left.data;
			if(root.right!=null)
				rightdata = root.right.data;
			
			diff = (leftdata+rightdata)-root.data;
			if(diff>0)
				root.data=root.data+diff;
			if(diff<0)
				increment(root,-diff);
		}
	}
	public static void increment(node25 root , int diff)
	{
		if(root.left!=null)
		{
			root.left.data = root.left.data+diff;
			increment(root.left ,diff);
		}
		else if(root.right!=null)
		{
			root.right.data=root.right.data+diff;
			increment(root.right , diff);
		}
	}
	public static void printorder(node25 root)
	{
		if(root==null)
			return;
		printorder(root.left);
		System.out.print(root.data+" ");
		printorder(root.right);
	}
	public static void main(String[] args)
	{
		convertarbitarybinarytreechildsumproperty tree = new convertarbitarybinarytreechildsumproperty ();
		tree.root = new node25(50);
		
		tree.root.left=new node25(7);
		tree.root.right=new node25(2);
		tree.root.left.left=new node25(3);
		tree.root.left.right=new node25(5);
		tree.root.right.left = new node25(1);
		tree.root.right.right=new node25(30);
		printorder(tree.root);
		converttree(tree.root);
		System.out.println();
		printorder(tree.root);
	}
	
}

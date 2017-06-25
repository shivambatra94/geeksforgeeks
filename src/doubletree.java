import java.util.*;
class node7
{
	int data;
	node7 right,left;
	node7(int data)
	{
		this.data = data;
		right=left=null;
	}
	
}
public class doubletree 
{
	public static void double1(node7 root)
	{
		node7 oldleft;
		if(root==null)
			return;
		double1(root.left);
		double1(root.right);
		
		oldleft = root.left;
		root.left = new node7(root.data);
		root.left.left = oldleft;
		
	}
	
	public static void printtree(node7 root)
	{
		if(root==null)
			return;
		printtree(root.left);
		System.out.print(root.data+" ");
		printtree(root.right);
	}
	public static node7 insert(node7 root , int data)
	{
		if(root==null)
			return new node7(data);
		else
		{
			node7 curr;
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
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node7 root=null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root = insert(root,data);
		}
		printtree(root);
		double1(root);
		System.out.println();
		System.out.println("double tree travesal");
		printtree(root);
		
		
		
	}
}

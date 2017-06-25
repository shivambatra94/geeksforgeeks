import java.util.*;
class node8
{
	int data;
	node8 left,right;
	public node8(int data)
	{
		this.data = data;
		left=right=null;
	}
}
public class mirrorofbinartree 
{
	public static node8 mirror(node8 root)
	{
		if(root==null)
			return root;
		
		node8 left = mirror(root.left);
		node8 right = mirror(root.right);
		root.left = right;
		root.right=left;
		
		return root;
	}
	public static void inorder(node8 root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
			
	}
	public static node8 insert(node8 root , int data)
	{
		if(root==null)
			return new node8(data);
		else
		{
			node8 curr;
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
		int n= scan.nextInt();
		node8 root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root = insert(root , data);
		}
		System.out.println("before mirror");
		inorder(root);
		root=mirror(root);
		System.out.println("\nafter mirror");
		inorder(root);
	}
}

import java.util.*;
class node5
{
	int data;
	node5 left,right;
	public node5(int data)
	{
		this.data = data;
		left=right=null;
	}
}
public class calculatesizeoftree 
{
	public static int sizeoftree(node5 root)
	{
		int heightleft = 0 ;
		int heightright = 0 ;
		if(root.left!=null)
			heightleft=sizeoftree(root.left);
		
		if(root.right!=null)
			heightright = sizeoftree(root.right);
		
		return (heightleft + 1 + heightright);
	}
	public static node5 insert(node5 root , int data)
	{
		if(root==null)
			return new node5(data);
		else
		{
			node5 curr;
			if(data<=root.data)
			{
				curr=insert(root.left,data);
				root.left=curr;
			}
			else
			{
				curr=insert(root.right,data);
				root.right=curr;
			}
			return root;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node5 root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root = insert(root , data);
			
		}
		int x = sizeoftree(root);
		System.out.println(x);
	}
}

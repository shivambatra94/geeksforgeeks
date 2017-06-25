import java.util.*;
class node30
{
	int data;
	node30 left , right;
	
	node30(int data)
	{
		this.data = data;
		left=right=null;
	}
}
public class binarytreeisheightbalanced 
{
	public static int isbalance(node30 root)
	{
		if(root==null)
			return 1;
		int lh = isbalance(root.left);
		int rh = isbalance(root.right);
		
		if(lh==-1 && rh ==-1)
			return 0;
		 if((Math.abs(lh-rh))>1)
			return 0;

		
			return (1+Math.max(lh,rh));
			
		
	}
	/*public static boolean isbalance(node30 root)
	{
		if(root==null)
			return true;
		int lh = height(root.left);
		int rh = height(root.right);
		
		if((Math.abs(lh-rh)<=1) && isbalance(root.left) && isbalance(root.right))
			return true;			
		
		return false;
	}*/
	/*public static int height(node30 root)
	{
		if(root==null)
			return 0;
		else
			return (1+Math.max((height(root.left)), (height(root.right))));
	}*/
	public static node30 insert(node30 root , int data)
	{
	
		if(root==null)
			return new node30(data);
		else
		{
			node30 curr;
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
		node30 root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root = insert(root , data);
		}
		int a =isbalance(root);
		if(a>0)
			System.out.println("tree is balanced");
		else
			System.out.println("tree is not balanced");
	}
}

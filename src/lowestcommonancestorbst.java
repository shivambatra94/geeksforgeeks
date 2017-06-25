import java.util.*;
class node15
{
	int data;
	node15 right , left;
	public node15(int data)
	{
		this.data = data;
		right=left=null;
	}
}
public class lowestcommonancestorbst 
{
	public static node15 lca(node15 root , int x ,int y)
	{
		if(root==null)
			return null;
		else
		{
			if(root.data>x && root.data>y)
				return lca(root.left , x , y);
			if(root.data<x && root.data<y)
				return lca(root.right , x , y);
		}
		return root;
	}
	public static node15 insert(node15 root , int data)
	{
		if(root==null)
			return new node15(data);
		else
		{
			node15  curr;
			if(root.data>=data)
			{
				curr=insert(root.left , data);
				root.left =curr;
				
			}
			if(root.data<data)
			{
				curr =insert(root.right ,data);
				root.right=curr;
			}
			return root;
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node15 root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root=insert(root , data);
		}
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		node15 t = lca(root , n1 , n2);
		System.out.println(t.data);
	}
}

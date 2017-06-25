import java.util.*;
class node17
{
	int data;
	node17 right , left;
	public node17(int data)
	{
		this.data = data;
		right=left=null;
	}
}
public class minimumvalueinbinarytree 
{
	public static int min(node17 root)
	{
	
	while(root.left!=null)
	{
		root = root.left;
	}
	return (root.data);
	}
	public static node17 insert(node17 root , int data)
	{
		if(root==null)
			return new node17(data);
		else
		{
			node17 curr;
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
	node17 root = null;
	while(n-->0)
	{
		int data = scan.nextInt();
		root = insert(root , data);
	}
	int a = min(root);
	System.out.println(a);
	
}
}
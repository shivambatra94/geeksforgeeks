import java.util.*;
class node6
{
	int data;
	node6 right,left;
	public node6(int data)
	{
		this.data = data;
		left=right=null;
	}
	
}
public class treesareidentical 
{
	public static boolean checkidentical(node6 root1 , node6 root)
	{
		if(root==null && root1==null)
			return true;
		if(root!=null && root1!=null)
		{
			return ((root.data==root1.data ) && checkidentical(root1.left , root.left)
					             && checkidentical(root.right , root1.right) );
		}
		return false;
	}
	public static node6 insert(node6 root , int data)
	{
		if(root==null)
			return new node6(data);
		else
		{
			node6 curr;
			if(data<=root.data)
			{
				curr=insert(root.left , data);
				root.left=curr;
			}
			else
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
		node6 root = null;
		node6 root1 = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root=insert(root , data); 
		}
		int n1=scan.nextInt();
		while(n1-->0)
		{
			int data = scan.nextInt();
			root1=insert(root1 , data); 
		}
		if(checkidentical(root1 , root))
			System.out.println("the tree are identical");
		else
			System.out.println("the trees are not identical");
	}
}

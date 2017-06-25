import java.util.*;
class node7
{
	int data;
	node7 left,right;
	public node7(int data)
	{
	   this.data = data;
	   left=right=null;
	}
}
public class deletetree
{
	//using postorder
	public static void delete(node7 root)
	{
		if(root==null)
			return;
		delete(root.left);
		delete(root.right);
		System.out.println("the no. to deleted"+root.data);
		root=null;
		
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
	node7 root = null;
	while(n-->0)
	{
		int data = scan.nextInt();
		root = insert(root , data);
	}
	delete(root);
	}
}

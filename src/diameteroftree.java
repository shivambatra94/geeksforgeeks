import java.util.Scanner;
class node29
{
	int data ; 
	node29 right,left;
	public node29(int data)
	{
		this.data = data;
		right=left=null;
	}
}
public class diameteroftree
{
	static node29 root;
	public static int findiameter(node29 root)
	{
		if(root==null)
			return 0;
		int lheight = height(root.left);
		int rheight = height(root.right);
		 
		
		return Math.max((lheight + rheight + 1),
                Math.max(lheight , rheight));

		
	}
	
	public static int height(node29 root)
	{
		if(root==null)
			return 0;
		else
			return(1+Math.max(height(root.left), height(root.right)));
	}
	/*public static node29 insert(node29 root , int data)
	{
		if(root==null)
			return new node29(data);
		else
		{
			node29 curr;
			if(data<=root.data)
			{
				curr = insert(root.left , data);
				root.left = curr;
			}
			if(data>root.data)
			{
				curr = insert(root.right , data);
				root.right = curr;
						
			}
			return root;
		}
	}*/
	public static void main(String[] args)
	{
		diameteroftree tree = new diameteroftree();
		tree.root = new node29(1);
        tree.root.left = new node29(2);
        tree.root.right = new node29(3);
        tree.root.left.left = new node29(4);
        tree.root.left.right = new node29(5);
 
		/*Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node29 root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root = insert(root , data);
		}*/
		int a = findiameter(tree.root);
		System.out.println(a);
		
	}
}

import java.util.*;
public class checkifgivenbinarytreesumtree 
{
	class node
	{
		int data;
		node right,left;
		node(int data)
		{
			this.data = data;
			right=left = null;
		}
	}
	static int isleaf(node root)
	{
		if(root==null)
			return 0;
		if(root.right==null && root.left==null)
			return 1;
		return 0;
	}
	public static int issumtree(node root)
	{
		int ls,rs;
		
		if(root.right==null && root.left==null)
			return 1;
		
		if(issumtree(root.left)!=0 && issumtree(root.right)!=0)
		{
			if(root.left == null)
				ls= 0;
			else if(isleaf(root.left)!=0)
				ls = root.left.data;
			else
				ls = 2*(root.left.data);
			
			if(root.right==null)
				rs = 0;
			else if(isleaf(root.right)!=0)
				rs = root.right.data;
			else
				rs  = 2*(root.right.data);
			 if(root.data == ls+rs)
				 return 1;
		}
		
		 
			 return 0;
	}
  node insert(node root , int data)
	{
		if(root==null)
			return new node(data);
		else
		{
			node curr;
			if(root.data>data)
			{
				curr = insert(root.left , data );
				root.left = curr;
			}
			
			if(root.data<data)
			{
				curr = insert(root.right , data);
				root.right = curr;
			}
			return root;
	    }
   }
	public static void  main(String[] args)
	{
		checkifgivenbinarytreesumtree tree = new checkifgivenbinarytreesumtree();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node root=null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root = tree.insert(root,data);
		}
		if(issumtree(root)==1)
			System.out.println("true");
		else
		System.out.println("false");		
	}
}

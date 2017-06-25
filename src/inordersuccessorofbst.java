import java.util.*;
public class inordersuccessorofbst 
{
	class node
	{
		int data;
		node right,left;
		node(int data)
		{
			this.data = data;
			right=left=null;
		}
	}
	
	public static node inordersuccessor(node root , node n)
	{
		if(n.right!=null)
			return minvalue(n.right);
		
		node succ =null;
		while(root!=null)
		{
			if(root.data>n.data)
			{
				succ = root;
				root=root.left;
			}
			
			else if(root.data<n.data)
			{
				root=root.right;
			}
			else
				break;
		}
		return succ;
	}
	
	public static node minvalue(node root)
	{
		node curr= root;
		while(curr.left!=null)
		{
			curr= curr.left;
		}
		return curr;
	}
	public  node insert(node root , int data)
	{
		if(root==null)
			return new node(data);
		else
		{
			node curr;
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
		inordersuccessorofbst tree = new inordersuccessorofbst();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		 node root = null; 
		while(n-->0)
		{
			int data = scan.nextInt();
			root=tree.insert(root , data);
		}
		node temp = root.left.right.right;
		node suc = inordersuccessor(root, temp);
		if(suc!=null)
			System.out.println(suc.data);
		else
			System.out.println("no successor");
	}
}

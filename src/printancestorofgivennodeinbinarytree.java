import java.util.*;

public class printancestorofgivennodeinbinarytree 
{
	class node
	{
		int data;
		node right,left;
		node(int data)
		{
			this.data = data;
			left=right=null;
		}
	}
	
	node insert(node root , int data)
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
	
	public static boolean getancestor(node root , int temp)
	{
		if(root==null)
			return false;
		if(root.data==temp)
			return true;
		
		if(getancestor(root.left, temp) || getancestor(root.right, temp))
		{
			System.out.println(root.data);
			return true;
		}
		else 
			return false;
	}
	
	public static void main(String[] args)
	{
		printancestorofgivennodeinbinarytree tree = new printancestorofgivennodeinbinarytree();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root=tree.insert(root , data);
		}
		int temp = scan.nextInt();
		getancestor(root , temp);
	}
}

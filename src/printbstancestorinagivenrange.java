import java.util.*;



public class printbstancestorinagivenrange 
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
	
	public static void ancestor(node root , int k1 , int k2)
	{
		if(root==null)
			return;
		if(k1 < root.data)
			ancestor(root.left, k1, k2);
		
		if(k1<=root.data && k2>root.data)
			System.out.println(root.data);
		
		if(k2>root.data)
			ancestor(root.right, k1, k2);
		
	}
	public static void main(String[] args)
	{
		printbstancestorinagivenrange tree = new printbstancestorinagivenrange();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root=tree.insert(root , data);
		}
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		ancestor(root , k1 , k2);
	}
}

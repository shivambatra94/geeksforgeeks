import java.util.*;


public class printnodesatkthdistancefromroot 
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
	
	public static void findnode(node root , int k)
	{
		if(root==null)
			return;
		if(k==0)
		{
			System.out.println(root.data);
          return;
		}
		
		else
		{
			findnode(root.left , k-1);
			findnode(root.right,k-1);
			
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
	
	public static void main(String[] args)
	{
		printnodesatkthdistancefromroot tree = new printnodesatkthdistancefromroot();
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		node root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root = tree.insert(root , data);
		}
		int k = scan.nextInt();
		findnode(root , k);
	}
}

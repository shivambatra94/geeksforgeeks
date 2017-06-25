import java.util.*;
class node20
{
	int data;
	node20 right,left;
	public node20(int data)
	{
		this.data = data;;
		right=left=null;
	}
}
public class countleafnode 
{
	public static int countleaf(node20 root)
	{
		
		if (root==null)
			return 0;
			if(root.right==null && root.left==null)
			{
				return 1;
			}
			else
			{
				return countleaf(root.left)+countleaf(root.right);
			}
			
	}
	public static node20 insert(node20 root , int data)
	{
		if(root==null)
			return new node20(data);
		else
		{
		node20 curr;
		if(data<=root.data)
		{
			curr = insert(root.left , data);
			root.left = curr;
		}
		else if(data>=root.data)
		{
			curr = insert(root.right , data);
			root.right = curr;
		}
		
		
		return root ;
		}
	}
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  int n = scan.nextInt();
	  node20 root = null;
	  while(n-->0)
	  {
		int data = scan.nextInt();
		root=insert(root , data);
	  }
	  int a = countleaf(root);
	  System.out.println(a);
  }
}

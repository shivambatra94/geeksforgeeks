import java.util.*;
class node2
{
	int data;
	node2 right,left;
	node2(int data)
	{
		this.data = data;
		right=left=null;
	}
}
public class rootoleafpathsumequaltonumber 
{
	public static boolean checksum(node2 root , int sum)
	{
		if(root==null)
			return (sum==0);
		else
		{
			boolean ans=false;
			
			int subsum = sum - root.data;
			if(subsum==0 && root.left==null && root.right==null)
			  return true;
			if(root.left!=null)
			ans = ans ||	checksum(root.left,subsum);
			if(root.right!=null)
				ans = ans || checksum(root.right , subsum);
			return ans;
		}
		
	}
	public static node2 insert(node2 root , int data)
	{
		if(root==null)
			return new node2(data);
		else
		{
			node2 curr;
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
		 node2 root = null; 
		while(n-->0)
		{
			int data = scan.nextInt();
			root=insert(root , data);
		}
		int sum = scan.nextInt();
		boolean x =checksum(root,sum);
		if(x==true)
			System.out.println("true");
		else
			System.out.println("false");
	}
}

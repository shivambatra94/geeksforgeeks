import java.util.*;
class node9
{
	int data;
	node9 right,left;
	node9(int data)
	{
		this.data = data;
		right=left=null;
	}
}
public class maximumwidthofbinarytree 
{
	public static int maximum(node9 root)
	{
		int h = height(root);
		
		int[] count = new int[10];
		int level =0 ;
		getmaxwidth(root , count , level);
		return getmax(count , h);
	}
	public static void getmaxwidth(node9 root , int[] count , int level)
	{
		if(root!=null)
		{
			count[level]++;
			getmaxwidth(root.left , count , level+1);
			getmaxwidth(root.right , count , level+1);
		}
	}
	public static int getmax(int[] count , int  h)
	{
		int max = count[0];
		for(int i=0 ; i<h ; i++)
		{
			if(count[i]>max)
				max=count[i];
		}
		return max;
	}
	public static int height(node9 root)
	{
		if(root==null)
			return 0;
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		return (1+Math.max(lheight, rheight));
	}
	public static node9 insert(node9 root , int data)
	{
		if(root==null)
			return new node9(data);
		else
		{
			node9 curr;
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
		int n =  scan.nextInt();
		node9 root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root=insert(root , data);
		}
		int x = maximum(root);
		System.out.println(x);
	}
}

import java.util.*;
class node4
{
	int data;
	node4 right,left;
	node4(int data)
	{
		this.data = data;
		right=left=null;
	}
}
public class binarytreeroottoleafpath
{
	public static void path(node4 root)
	{
		int[] path = new int[1000];
		pathtraverse(root, path,0);
	}
	public static void pathtraverse(node4 root , int[] path , int len)
	{
		if(root==null)
			return;
		path[len++]=root.data;
		if(root.left==null && root.right==null)
			printpath(path,len);
		pathtraverse(root.left , path , len);
		pathtraverse(root.right , path , len);
	}
	public static void printpath(int[] path , int len)
	{
		for(int i=0 ; i<len ; i++)
		{
			System.out.print(path[i]+" ");
		}
		System.out.println();
	}
	public static node4 insert(node4 root , int data)
	{
		if(root==null)
			return new node4(data);
		else
		{
			node4 curr;
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
		 node4 root = null; 
		while(n-->0)
		{
			int data = scan.nextInt();
			root=insert(root , data);
		}
		path(root);
	}
}
